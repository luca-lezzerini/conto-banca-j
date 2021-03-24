import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ContoDeposito } from '../gestione-cd/contoDeposito';
import { ContoDepositoDto } from '../gestione-cd/contoDepositoDto';
import { ListaCDDto } from '../gestione-cd/listaCDDto';
import { Cliente } from '../gestione-cliente/cliente';
import { ClienteDto } from '../gestione-cliente/cliente-dto';
import { ListaClientiDto } from '../gestione-cliente/lista-clienti-dto';
import { FiltroCognomeDto } from '../mostra-tutti-i-conti/filtro-cognome-dto';
import { SaldoCDDto } from './saldo-cd-dto';

@Component({
  selector: 'app-saldo-cd',
  templateUrl: './saldo-cd.component.html',
  styleUrls: ['./saldo-cd.component.css']
})
export class SaldoCdComponent implements OnInit {
  client: Cliente = new Cliente();
  listaClienti: Cliente[] = [];
  listaCD: ContoDeposito[] = [];
  saldoCDor: number[] = [];
  ricercaCliente: string = '';
  showTabCD : boolean = false;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  cercaCliente() {
    let dto: FiltroCognomeDto = new FiltroCognomeDto();
    dto.cognome = this.ricercaCliente + "%";
    let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>(
      'http://localhost:8080/cerca-cliente-like',
      dto);
      oss.subscribe(l => this.listaClienti = l.listaClienti);
    this.showTabCD = false;
    this.saldoCDor = [];
  }

  selezionaCliente(c: Cliente) {
    let dto: ClienteDto = new ClienteDto();
    dto.cliente = c;
    let oss: Observable<ListaCDDto> = this.http.post<ListaCDDto>(
      'http://localhost:8080/ricerca-cd',
      dto
    );
    oss.subscribe(c => {
      this.listaCD = c.listaCD;
      this.showTabCD = true;
    });
  }

  saldoCD(cd: ContoDeposito, i) {
    let dto: ContoDepositoDto = new ContoDepositoDto();
    dto.conto = cd;
    let oss: Observable<SaldoCDDto> = this.http.post<SaldoCDDto>(
      'http://localhost:8080/saldo-cd',
      dto
    );
    oss.subscribe(s => {
      this.listaCD = s.listaCD;
      this.saldoCDor[i] = s.saldo;
    })
  }
}
