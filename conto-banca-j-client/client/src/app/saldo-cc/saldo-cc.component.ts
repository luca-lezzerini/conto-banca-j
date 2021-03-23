import { Component, OnInit } from '@angular/core';
import { Cliente } from '../gestione-cliente/cliente';
import { ContoCorrente } from '../gestione-cc/contoCorrente';

@Component({
  selector: 'app-saldo-cc',
  templateUrl: './saldo-cc.component.html',
  styleUrls: ['./saldo-cc.component.css'],
})
export class SaldoCcComponent implements OnInit {
  client: Cliente = new Cliente();
  listaClienti: Cliente[] = [];
  listaCC: ContoCorrente[] = [];
  saldoCCor: number;
  ricercaCliente: string = '';
  constructor() {}

  ngOnInit() {}

  selezionaCliente(c: Cliente) {}

  saldoCC(cc: ContoCorrente) {}

  cercaCliente() {}
}
