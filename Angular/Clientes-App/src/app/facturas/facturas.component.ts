import { Component, OnInit } from '@angular/core';
import { Factura } from './models/factura';

@Component({
  selector: 'app-facturas',
  templateUrl: './facturas.component.html'
})
export class FacturasComponent implements OnInit {

  title: string = 'Nueva Factura';
  factura:Factura = new Factura();
  
  constructor() { }

  ngOnInit() {
  }

}
