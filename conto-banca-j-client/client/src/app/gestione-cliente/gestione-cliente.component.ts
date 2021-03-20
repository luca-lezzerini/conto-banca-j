import { Component, OnInit } from '@angular/core';
import { Cliente } from '../cliente';

@Component({
  selector: 'app-gestione-cliente',
  templateUrl: './gestione-cliente.component.html',
  styleUrls: ['./gestione-cliente.component.css']
})
export class GestioneClienteComponent implements OnInit {

  cliente: Cliente = new Cliente();
  clienti: Cliente[] = [];
  inputEnabled: boolean;
  buttonVisible: boolean;

  constructor() {}

  ngOnInit(): void {
  }

  nuovo(){
    //Abilita i campi di input
    this.inputEnabled = true;
  }

  aggiungi(){
    // aggiunge nuovo cliente
  }

  conferma(){
    //TODO
    //conferma la modifica o la cancellazione
    this.buttonVisible = false;
    this.inputEnabled = false;
  }

  annulla(){
    //TODO
    this.buttonVisible = false;
    this.inputEnabled = false;
  }

  modifica(c: Cliente){
    // richiama il conferma per la modifica
    this.buttonVisible = true;
  }

  cancella(c: Cliente){
    // richiama il conferma per la cancellazione
    this.buttonVisible = true;
  }

}
