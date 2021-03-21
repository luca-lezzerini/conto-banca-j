import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from './cliente';
import { ClienteDto } from './cliente-dto';
import { ListaClientiDto } from './lista-clienti-dto';

@Component({
  selector: 'app-gestione-cliente',
  templateUrl: './gestione-cliente.component.html',
  styleUrls: ['./gestione-cliente.component.css']
})
export class GestioneClienteComponent implements OnInit {

  cliente: Cliente = new Cliente();
  clienteMod: Cliente = new Cliente();
  clienti: Cliente[] = [];
  inputEnabled: boolean;
  buttonVisible: boolean;
  stato: string = "";

  constructor(private http: HttpClient) {
    this.aggiorna();
   }

  ngOnInit(): void {
  }

  nuovo() {
    //Abilita i campi di input
    this.inputEnabled = true;
  }

  aggiungi() {
    // aggiunge nuovo cliente
    let dto: ClienteDto = new ClienteDto();
    dto.cliente = this.cliente;
    let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>
      ("http://localhost:8080/aggiungi-cliente", dto);
    oss.subscribe(v => this.clienti = v.listaClienti);
    this.cliente = new Cliente();
  }

  conferma() {
    //conferma la modifica o la cancellazione
    let dto: ClienteDto = new ClienteDto();
    dto.cliente = this.cliente;

    console.log(this.stato);
    if (this.stato == "mod") {
      console.log("siamo nell if mod");
      let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>
        ("http://localhost:8080/modifica-cliente", dto);
      oss.subscribe(v => this.clienti = v.listaClienti);
    } else if (this.stato == "canc") {
      console.log("siamo nell if canc");
      let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>
        ("http://localhost:8080/cancella-cliente", dto);
      oss.subscribe(v => this.clienti = v.listaClienti);
    } 
    this.cliente = new Cliente();
    dto.cliente = this.cliente;
    this.buttonVisible = false;
    this.inputEnabled = false;
  }

  annulla() {
    //TODO
    this.buttonVisible = false;
    this.inputEnabled = false;
  }

  modifica(c: Cliente) {
    // richiama il conferma per la modifica
    this.cliente = c;
    this.buttonVisible = true;
    this.inputEnabled = true;
    this.stato = "mod";
  }

  cancella(c: Cliente) {
    // richiama il conferma per la cancellazione
    this.cliente = c;
    this.buttonVisible = true;
    this.inputEnabled = false;
    this.stato = "canc";
  }

  aggiorna(){
    let oss: Observable<ListaClientiDto> = this.http.get<ListaClientiDto>
        ("http://localhost:8080/aggiorna-cliente");
    oss.subscribe(v => this.clienti = v.listaClienti);
  }

}
