import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ContoDeposito } from '../gestione-cd/contoDeposito';
import { ContoDepositoDto } from '../gestione-cd/contoDepositoDto';
import { NumContoCDDto } from '../gestione-cd/numCDDto';
import { Cliente } from '../gestione-cliente/cliente';
import { ListaClientiDto } from '../gestione-cliente/lista-clienti-dto';
import { FiltroCognomeDto } from '../mostra-tutti-i-conti/filtro-cognome-dto';
import { associaCDDto } from './associa-cd-dto';

@Component({
  selector: 'app-associa-cd',
  templateUrl: './associa-cd.component.html',
  styleUrls: ['./associa-cd.component.css']
})
export class AssociaCdComponent implements OnInit {

  cognomeCliente: string;
  listaClienti: Cliente[];
  conto: ContoDeposito;
  numConto: string;

  constructor(private http: HttpClient) {
    this.aggiornaLista();
  }

  ngOnInit(): void {
  }
  cercaCliente() {
    const dto: FiltroCognomeDto = new FiltroCognomeDto();
    dto.cognome = this.cognomeCliente;
    const oss: Observable<ListaClientiDto> = this.http
      .post<ListaClientiDto>('http://localhost:8080/cerca-cliente-equals', dto);
    oss.subscribe(g => this.listaClienti = g.listaClienti);
    this.cognomeCliente = "";
  }

  associaCliente(c: Cliente) {
    const dto: associaCDDto = new associaCDDto();
    dto.cliente= c;
    dto.conto = this.conto;
    const oss: Observable<null> = this.http
      .post<null>('http://localhost:8080/associa-cd', dto);
    oss.subscribe();
    this.aggiornaLista();
  }

  cercaConto() {
    const dto: NumContoCDDto = new NumContoCDDto();
    dto.codice = this.numConto;
    const oss: Observable<ContoDepositoDto> = this.http
      .post<ContoDepositoDto>('http://localhost:8080/cerca-conto-deposito', dto);
    oss.subscribe(r => this.conto = r.conto);
    this.numConto = "";
  }

  aggiornaLista() {
    const oss: Observable<ListaClientiDto> = this.http
      .get<ListaClientiDto>('http://localhost:8080/aggiorna-cliente');
    oss.subscribe(l => this.listaClienti = l.listaClienti);
  }
}
