import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';
import { Router, ActivatedRoute } from '@angular/router';
import swal from 'sweetalert2';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {

  private cliente: Cliente = new Cliente();
  private titulo: String = "Crear Cliente";
  constructor(
    private clienteService: ClienteService,
    private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.loadCliente();
  }

  loadCliente(): void{
    this.activatedRoute.params.subscribe(params => {
        let id = params['id'];
        if(id){
          this.clienteService.getCliente(id).subscribe( (cliente) => this.cliente = cliente);
        }
      }
    );
  }

  create(): void {
    this.clienteService.create(this.cliente).subscribe(
      cliente => { 
        this.router.navigate(['/clientes']);
        swal.fire('Cliente guardado',`Cliente ${cliente.apellido} ${cliente.nombre} creado con éxito`, 'success');
      });
  }

  update(): void {
    this.clienteService.update(this.cliente).subscribe( cliente => {
      this.router.navigate(['/clientes']);
      swal.fire('Cliente Actualizado',`Cliente ${cliente.apellido} ${cliente.nombre} actualizado con éxito!`, 'success');
    });
  }

}
