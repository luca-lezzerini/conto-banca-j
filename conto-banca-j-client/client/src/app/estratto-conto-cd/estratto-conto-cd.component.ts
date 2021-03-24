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
import { ListaMovCDDto } from './lista-mov-cd-dto';
import { MovCD } from './mov-cd';

@Component({
  selector: 'app-estratto-conto-cd',
  templateUrl: './estratto-conto-cd.component.html',
  styleUrls: ['./estratto-conto-cd.component.css']
})
export class EstrattoContoCdComponent implements OnInit {

  cognome: string;
  cliente: Cliente = new Cliente();
  clienti: Cliente[] = [];
  conto: ContoDeposito;
  conti: ContoDeposito [] = [];
  movimenti: MovCD [] = [];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  cercaCognomeLike(){
    let dto: FiltroCognomeDto = new FiltroCognomeDto();
    dto.cognome = this.cognome + "%";
    let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>
      ("http://localhost:8080/cerca-cliente-cd", dto);
    oss.subscribe(s => this.clienti = s.listaClienti);
    this.cognome = "";

  }

  seleziona(c: Cliente){
    this.movimenti = [];
    let dto: ClienteDto = new ClienteDto();
    dto.cliente = c;
    let oss: Observable<ListaCDDto> = this.http.post<ListaCDDto>
      ("http://localhost:8080/mostra-cd-cliente", dto);
      oss.subscribe(s => this.conti = s.listaCD);
  }

  mostraEC(c: ContoDeposito){
    let dto: ContoDepositoDto = new ContoDepositoDto();
    dto.conto = c;
    let oss: Observable<ListaMovCDDto> = this.http.post<ListaMovCDDto>
      ("http://localhost:8080/mostra-ec-cd", dto);
      oss.subscribe(s => this.movimenti = s.listaMovCD);
  }


}
