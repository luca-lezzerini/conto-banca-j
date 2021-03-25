import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { CriterioCPDto } from '../associa-cp/criterio-cp-dto';
import { ListaMovCpDto } from '../estratto-conto-cp/lista-mov-cp-dto';
import { MovCp } from '../estratto-conto-cp/mov-cp';
import { MovimentaCPDto } from './movimenta-cp-dto';

@Component({
  selector: 'app-movimenta-cp',
  templateUrl: './movimenta-cp.component.html',
  styleUrls: ['./movimenta-cp.component.css']
})
export class MovimentaCpComponent implements OnInit {

  risposta: string;
  codice: string;
  importo: number;
  movimenti: MovCp[] = [];
  movCP: MovCp;

  enumCP = [
    { id: 1, name: "Concessione" },
    { id: 2, name: "Erogazione" },
    { id: 3, name: "Rimborso" }
  ];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  cerca() {
    let dto: CriterioCPDto = new CriterioCPDto();
    dto.ricerca = this.codice;
    let oss: Observable<ListaMovCpDto> = this.http.post<ListaMovCpDto>
      ("http://localhost:8080/cerca-mov-cp", dto);
    oss.subscribe(s => this.movimenti = s.listaMovCp);
    this.aggiorna();
    console.log(this.movimenti);
  }

  esegui() {
    
  }

  aggiorna() {
    let oss: Observable<ListaMovCpDto> = this.http.get<ListaMovCpDto>
      ("http://localhost:8080/aggiorna-mov-cp");
    oss.subscribe(s => this.movimenti = s.listaMovCp);
  }

}
