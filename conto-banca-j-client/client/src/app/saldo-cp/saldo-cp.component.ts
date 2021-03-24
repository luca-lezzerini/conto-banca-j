import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from '../gestione-cliente/cliente';
import { ClienteDto } from '../gestione-cliente/cliente-dto';
import { ListaClientiDto } from '../gestione-cliente/lista-clienti-dto';
import { ContoPrestito } from '../gestione-cp/conto-prestito';
import { ContoPrestitoDto } from '../gestione-cp/conto-prestito-dto';
import { ListaCpDto } from '../gestione-cp/lista-cp-dto';
import { FiltroCognomeDto } from '../mostra-tutti-i-conti/filtro-cognome-dto';
import { SaldoCPDto } from './saldo-cp-dto';

@Component({
  selector: 'app-saldo-cp',
  templateUrl: './saldo-cp.component.html',
  styleUrls: ['../theme.css']
})
export class SaldoCpComponent implements OnInit {

  client: Cliente = new Cliente();
  listaClienti: Cliente[] = [];
  listaCP: ContoPrestito[] = [];
  saldoCPre: number[] = [];
  ricercaCliente: string = '';
  showTabCP : boolean = false;

  constructor(private http: HttpClient) { }

  ngOnInit() { }

  cercaCliente() {
    let dto: FiltroCognomeDto = new FiltroCognomeDto();
    dto.cognome = this.ricercaCliente + "%";
    let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>(
      'http://localhost:8080/cerca-cliente-like',
      dto
    );
    oss.subscribe(l => this.listaClienti = l.listaClienti);
    this.showTabCP = false;
    this.saldoCPre = [];
  }

  selezionaCliente(c: Cliente) {
    let dto: ClienteDto = new ClienteDto();
    dto.cliente = c;
    let oss: Observable<ListaCpDto> = this.http.post<ListaCpDto>(
      'http://localhost:8080/ricerca-cp',
      dto
    );
    oss.subscribe(c => {
      this.listaCP = c.listaCodici;
      this.showTabCP = true;
    });
  }

  saldoCP(cc: ContoPrestito, i) {
    let dto: ContoPrestitoDto = new ContoPrestitoDto();
    dto.contoPrestito = cc;
    let oss: Observable<SaldoCPDto> = this.http.post<SaldoCPDto>(
      'http://localhost:8080/saldo-cp',
      dto
    );
    oss.subscribe(s => {
      this.listaCP = s.listaCP;
      this.saldoCPre[i] = s.saldo;
    })
  }

}
