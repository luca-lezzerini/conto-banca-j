import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gestione-cliente',
  templateUrl: './gestione-cliente.component.html',
  styleUrls: ['./gestione-cliente.component.css']
})
export class GestioneClienteComponent implements OnInit {

  nome: string;
  cognome: string;
  codiceFiscale: string;
  telefono: string;
  indirizzo: string;

  constructor() { }

  ngOnInit(): void {
  }

}
