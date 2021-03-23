import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from '../gestione-cliente/cliente';
import { ClienteDto } from '../gestione-cliente/cliente-dto';
import { ListaClientiDto } from '../gestione-cliente/lista-clienti-dto';
import { ContoPrestito } from '../gestione-cp/conto-prestito';
import { FiltroCognomeDto } from '../mostra-tutti-i-conti/filtro-cognome-dto';
import { ListaContiClienteDto } from '../mostra-tutti-i-conti/lista-conti-cliente-dto';
import { ListaContoPrestitoDto } from './lista-conto-prestito-dto';

@Component({
  selector: 'app-estratto-conto-cp',
  templateUrl: './estratto-conto-cp.component.html',
  styleUrls: ['./estratto-conto-cp.component.css']
})
export class EstrattoContoCpComponent implements OnInit {

  cliente = new Cliente();
  clienti: Cliente[] = [];
  cognomeContains: string;


  contoPrestito = new ContoPrestito();
  contiPrestiti: ContoPrestito[] = [];



  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  cerca() {
    let dto: FiltroCognomeDto = new FiltroCognomeDto();
    dto.cognome = this.cliente.cognome;
    let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>("http://localhost:8080/cerca-cliente-cp", dto);
    oss.subscribe(c => this.clienti = c.listaClienti);
    this.cliente.cognome = "";
  }

  mostraContiCp(c: Cliente) {
    let dto:ClienteDto = new ClienteDto();
    dto.cliente=c;
    let fx: Observable<ListaContiClienteDto> = this.http.post<ListaContiClienteDto>("http://localhost:8080/carica-conti", dto);
    fx.subscribe(m => this.contiPrestiti = m.listaCP);
  }
      
   mostraEstrattoConto() {

   }    
     
  }  
      
  

    
  

