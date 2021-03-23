import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from '../gestione-cliente/cliente';
import { ListaClientiDto } from '../gestione-cliente/lista-clienti-dto';
import { ContoPrestito } from '../gestione-cp/conto-prestito';
import { ContoPrestitoDto } from '../gestione-cp/conto-prestito-dto';
import { FiltroCognomeDto } from '../mostra-tutti-i-conti/filtro-cognome-dto';
import { AssociaCPDto } from './associa-cp-dto';
import { CriterioCPDto } from './criterio-cp-dto';

@Component({
  selector: 'app-associa-cp',
  templateUrl: './associa-cp.component.html',
  styleUrls: ['./associa-cp.component.css']
})
export class AssociaCpComponent implements OnInit {

  cognome: string;
  cliente: Cliente = new Cliente();
  codice: string;
  clienti: Cliente[] = [];
  cp: ContoPrestito = new ContoPrestito();
  risposta: string;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  cercaCognomeEquals() {
    let dto: FiltroCognomeDto = new FiltroCognomeDto();
    dto.cognome = this.cognome;
    let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>
      ("http://localhost:8080/cerca-cliente-equals", dto);
    oss.subscribe(t => this.clienti = t.listaClienti);
    this.cognome = "";
  }

  associaCP(c: Cliente) {
    let dto: AssociaCPDto = new AssociaCPDto();
    dto.contoPrestito = this.cp;
    dto.cliente = c;
    console.log("dto associa cp: " + dto.cliente.cognome);
    let oss: Observable<AssociaCPDto> = this.http.post<AssociaCPDto>
      ("http://localhost:8080/associa-cp", dto);
    oss.subscribe(s => this.risposta = "Cliente " + s.cliente.cognome +
      " associato al conto " + s.contoPrestito.codice);
  }

  cercaCodiceEquals() {
    let dto: CriterioCPDto = new CriterioCPDto();
    dto.ricerca = this.codice;
    let oss: Observable<ContoPrestitoDto> = this.http.post<ContoPrestitoDto>
      ("http://localhost:8080/cerca-cp", dto);
    oss.subscribe(s => this.cp = s.contoPrestito);
    console.log(this.cp);
  }

}