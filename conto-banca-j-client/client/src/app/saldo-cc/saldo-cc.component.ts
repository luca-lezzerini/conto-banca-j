import { Component, OnInit } from '@angular/core';
import { Cliente } from '../gestione-cliente/cliente';
import { ContoCorrente } from '../gestione-cc/contoCorrente';
import { FiltroCognomeDto } from '../mostra-tutti-i-conti/filtro-cognome-dto';
import { Observable } from 'rxjs';
import { ListaClientiDto } from '../gestione-cliente/lista-clienti-dto';
import { HttpClient } from '@angular/common/http';
import { ClienteDto } from '../gestione-cliente/cliente-dto';
import { ListaCCDto } from '../gestione-cc/listaCCDto';
import { ContoCorrenteDto } from '../gestione-cc/contoCorrenteDto';
import { SaldoCCDto } from './saldo-cc-dto';

@Component({
  selector: 'app-saldo-cc',
  templateUrl: './saldo-cc.component.html',
  styleUrls: ['../theme.css']
})
export class SaldoCcComponent implements OnInit {
  client: Cliente = new Cliente();
  listaClienti: Cliente[] = [];
  listaCC: ContoCorrente[] = [];
  saldoCCor: number[] = [];
  ricercaCliente: string = '';
  showTabCC : boolean = false;

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
    this.showTabCC = false;
    this.saldoCCor = [];
  }

  selezionaCliente(c: Cliente) {
    let dto: ClienteDto = new ClienteDto();
    dto.cliente = c;
    let oss: Observable<ListaCCDto> = this.http.post<ListaCCDto>(
      'http://localhost:8080/ricerca-cc',
      dto
    );
    oss.subscribe(c => {
      this.listaCC = c.listaCC;
      this.showTabCC = true;
    });
  }

  saldoCC(cc: ContoCorrente, i) {
    let dto: ContoCorrenteDto = new ContoCorrenteDto();
    dto.conto = cc;
    let oss: Observable<SaldoCCDto> = this.http.post<SaldoCCDto>(
      'http://localhost:8080/saldo-cc',
      dto
    );
    oss.subscribe(s => {
      this.listaCC = s.listaCC;
      this.saldoCCor[i] = s.saldo;
    })
  }


}
