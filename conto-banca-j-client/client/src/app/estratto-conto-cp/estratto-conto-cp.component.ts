import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ContoDeposito } from '../gestione-cd/contoDeposito';
import { Cliente } from '../gestione-cliente/cliente';
import { ClienteDto } from '../gestione-cliente/cliente-dto';
import { ListaClientiDto } from '../gestione-cliente/lista-clienti-dto';
import { ContoPrestito } from '../gestione-cp/conto-prestito';
import { ContoPrestitoDto } from '../gestione-cp/conto-prestito-dto';
import { FiltroCognomeDto } from '../mostra-tutti-i-conti/filtro-cognome-dto';
import { ListaContiClienteDto } from '../mostra-tutti-i-conti/lista-conti-cliente-dto';
import { ListaContoPrestitoDto } from './lista-conto-prestito-dto';
import { ListaMovCpDto } from './lista-mov-cp-dto';
import { MovCp } from './mov-cp';

@Component({
  selector: 'app-estratto-conto-cp',
  templateUrl: './estratto-conto-cp.component.html',
  styleUrls: ['./estratto-conto-cp.component.css']
})
export class EstrattoContoCpComponent implements OnInit {

  cliente = new Cliente();
  clienti: Cliente[] = [];
  listaMovCp: MovCp[];
  contoPrestito = new ContoPrestito();
  contiPrestiti: ContoPrestito[] = [];
  estrattocontoVisibile: boolean;
  contiPrestitoVisibile: boolean



  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  cerca() {
    let dto: FiltroCognomeDto = new FiltroCognomeDto();
    dto.cognome = this.cliente.cognome;
    let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>("http://localhost:8080/cerca-cliente-cp", dto);
    oss.subscribe(c => this.clienti = c.listaClienti);
    this.cliente.cognome = "";
    this.listaMovCp = null;
    this.contiPrestiti = null;
    this.estrattocontoVisibile = false;


  }

  mostraContiCp(c: Cliente) {
    this.contiPrestitoVisibile = true;
    let dto: ClienteDto = new ClienteDto();
    dto.cliente = c;
    let fx: Observable<ListaContiClienteDto> = this.http.post<ListaContiClienteDto>("http://localhost:8080/carica-conti", dto);
    fx.subscribe(m => this.contiPrestiti = m.listaCP);
    this.listaMovCp = null;
  }

  mostraEstrattoConto(e: ContoPrestito) {
    this.listaMovCp = null;
    this.contiPrestitoVisibile = true;
    this.estrattocontoVisibile = true;
    let dto: ContoPrestitoDto = new ContoPrestitoDto();
    dto.contoPrestito = e;
    let ec: Observable<ListaMovCpDto> = this.http.post<ListaMovCpDto>("http://localhost:8080/mov-cp", dto);
    ec.subscribe(s => this.listaMovCp = s.listaMovCp);

  }

}












      
  

    
  

