import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';

@Component({
  selector: 'app-associa-cc',
  templateUrl: './associa-cc.component.html',
  styleUrls: ['./associa-cc.component.css'],
})
export class AssociaCcComponent implements OnInit {
  constructor() {}
  cliente: Cliente = new Cliente();
  listaClienti: Cliente[] = [];

  ngOnInit() {}
}
