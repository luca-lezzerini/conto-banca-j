import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ContoCorrente } from '../gestione-cc/contoCorrente';
import { ContoCorrenteDto } from '../gestione-cc/contoCorrenteDto';
import { ListaCCDto } from '../gestione-cc/listaCCDto';
import { Cliente } from '../gestione-cliente/cliente';
import { ClienteDto } from '../gestione-cliente/cliente-dto';
import { ListaClientiDto } from '../gestione-cliente/lista-clienti-dto';
import { FiltroCognomeDto } from '../mostra-tutti-i-conti/filtro-cognome-dto';
import { ListaMovCCDto } from './lista-mov-cc-dto';
import { MovCC } from './mov-cc';

@Component({
  selector: 'app-ec-cc',
  templateUrl: './ec-cc.component.html',
  styleUrls: ['./ec-cc.component.css']
})
export class EcCcComponent implements OnInit {

  cognome: string;
  cliente: Cliente = new Cliente();
  clienti: Cliente[] = [];
  conto: ContoCorrente;
  conti: ContoCorrente [] = [];
  movimenti: MovCC [] = [];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  cercaCognomeLike(){
    let dto: FiltroCognomeDto = new FiltroCognomeDto();
    dto.cognome = this.cognome + "%";
    let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>
      ("http://localhost:8080/cerca-cliente-cc", dto);
    oss.subscribe(s => this.clienti = s.listaClienti);
    this.cognome = "";

  }

  seleziona(c: Cliente){
    this.movimenti = [];
    let dto: ClienteDto = new ClienteDto();
    dto.cliente = c;
    let oss: Observable<ListaCCDto> = this.http.post<ListaCCDto>
      ("http://localhost:8080/mostra-cc-cliente", dto);
      oss.subscribe(s => this.conti = s.listaCC);
  }

  mostraEC(c: ContoCorrente){
    let dto: ContoCorrenteDto = new ContoCorrenteDto();
    dto.conto = c;
    let oss: Observable<ListaMovCCDto> = this.http.post<ListaMovCCDto>
      ("http://localhost:8080/mostra-ec-cc", dto);
      oss.subscribe(s => this.movimenti = s.listaMov);
  }

}
