import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from './cliente';
import { ClienteDto } from './cliente-dto';
import { DatiPageDto } from './dati-page-dto';
import { ListaClientiDto } from './lista-clienti-dto';
import { PageDto } from './page-dto';

@Component({
  selector: 'app-gestione-cliente',
  templateUrl: './gestione-cliente.component.html',
  styleUrls: ['../theme.css']
})
export class GestioneClienteComponent implements OnInit {

  cliente: Cliente = new Cliente();
  clienti: Cliente[] = [];
  inputEnabled: boolean;
  buttonVisible: boolean;
  stato: string = "";

  //variabili paginazione
  numPag: number = 0;
  elemPag: number = 10;
  totalPages: number;
  totalElements: number;
  first: boolean;
  last: boolean;
  
  numberOfElements: number;

  constructor(private http: HttpClient) {
    //this.aggiorna();
    this.aggiornaPaginati();
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
    this.buttonVisible = false;
    this.inputEnabled = false;
  }

  annulla() {
    this.cliente = new Cliente();
    this.buttonVisible = false;
    this.inputEnabled = false;
  }

  modifica(c: Cliente) {
    // richiama il conferma per la modifica
    this.cliente.id = c.id;
    this.cliente.nome = c.nome;
    this.cliente.cognome = c.cognome;
    //this.cliente.dataNascita = c.dataNascita;
    this.cliente.indirizzo = c.indirizzo;
    this.cliente.telefono = c.telefono;
    this.cliente.codiceFiscale = c.codiceFiscale;
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

  aggiorna() {
    let oss: Observable<ListaClientiDto> = this.http.get<ListaClientiDto>
      ("http://localhost:8080/aggiorna-cliente");
    oss.subscribe(v => this.clienti = v.listaClienti);
  }

  aggiornaPaginati() {
    let dto: DatiPageDto = new DatiPageDto();
    dto.numPag = this.numPag;
    dto.elemPag = this.elemPag;
    let oss: Observable<PageDto> = this.http.post<PageDto>
      ("http://localhost:8080/clienti-paginati", dto);
    oss.subscribe(v => {
      this.clienti = v.listaCliPag.content;
      console.log("totalPages: " + v.listaCliPag.totalPages);
      console.log("totalElements: " + v.listaCliPag.totalElements);
      console.log("number: " + v.listaCliPag.number);
      console.log("first: " + v.listaCliPag.first);
      console.log("last: " + v.listaCliPag.last);
      console.log("size. " + v.listaCliPag.size);
      console.log("numberOfElements: " + v.listaCliPag.numberOfElements);

    });
  }

}
