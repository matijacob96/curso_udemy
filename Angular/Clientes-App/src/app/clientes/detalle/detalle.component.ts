import { Component, OnInit, Input } from "@angular/core";
import { Cliente } from "../cliente";
import { ClienteService } from "../cliente.service";
import swal from "sweetalert2";
import { HttpEventType } from "@angular/common/http";
import { ModalService } from './modal.service';
import { AuthService } from '../../usuarios/auth.service';
import { FacturaService } from '../../facturas/services/factura.service';
import { Factura } from 'src/app/facturas/models/factura';
import Swal from 'sweetalert2';

@Component({
  selector: "detalle-cliente",
  templateUrl: "./detalle.component.html",
  styleUrls: ["./detalle.component.css"]
})
export class DetalleComponent implements OnInit {
  @Input() cliente: Cliente;
  titulo: string = "Detalle del cliente";
  public fotoSeleccionada: File;
  progress: number = 0;

  constructor(
    private clienteService: ClienteService,
    public modalService: ModalService,
    public authService: AuthService,
    private facturaService: FacturaService
  ) {}

  ngOnInit() {
  }

  seleccionarFoto(event) {
    this.fotoSeleccionada = event.target.files[0];
    this.progress = 0;
    console.log(this.fotoSeleccionada);
    if (this.fotoSeleccionada.type.indexOf("image") < 0) {
      swal.fire(
        "Error seleccionar imagen: ",
        "El archivo debe ser del tipo imagen",
        "error"
      );
      this.fotoSeleccionada = null;
    }
  }

  subirFoto() {
    if (!this.fotoSeleccionada) {
      swal.fire("Error: Upload", "Debe seleccionar una foto", "error");
    } else {
      this.clienteService
        .subirfoto(this.fotoSeleccionada, this.cliente.id)
        .subscribe(event => {
          if (event.type === HttpEventType.UploadProgress) {
            this.progress = Math.round((event.loaded / event.total) * 100);
          } else if (event.type === HttpEventType.Response) {
            let response: any = event.body;
            this.cliente = response.cliente as Cliente;

            this.modalService.notificarUpload.emit(this.cliente);

            swal.fire(
              "La foto se ha subido con éxito",
              response.mensaje,
              "success"
            );
          }
          //this.cliente = cliente;
        });
    }
  }

  cerrarModal(){
    this.modalService.cerrarModal();
    this.fotoSeleccionada = null;
    this.progress = 0;
  }

  delete(factura: Factura): void{
    const swalWithBootstrapButtons = Swal.mixin({
      customClass: {
        confirmButton: "btn btn-success",
        cancelButton: "btn btn-danger"
      },
      buttonsStyling: false
    });
    swalWithBootstrapButtons
      .fire({
        title: "¿Está seguro?",
        text: `¿Seguro que desea eliminar la factura ${factura.descripcion}?`,
        icon: "warning",
        showCancelButton: true,
        confirmButtonText: "¡Si, eliminar!",
        cancelButtonText: "¡No, cancelar!",
        reverseButtons: true
      })
      .then(result => {
        if (result.value) {
          this.facturaService.delete(factura.id).subscribe(
            () => {
            this.cliente.facturas = this.cliente.facturas.filter(fact => fact !== factura);
            swalWithBootstrapButtons.fire(
              "¡Factura eliminada!",
              `Factura ${factura.descripcion} eliminada con éxito.`,
              "success"
            );
          });
        }
      });
  }
}
