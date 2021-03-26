import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { CriterioCPDto } from '../associa-cp/criterio-cp-dto';
import { ListaMovCpDto } from '../estratto-conto-cp/lista-mov-cp-dto';
import { MovCp } from '../estratto-conto-cp/mov-cp';
import { ContoPrestito } from '../gestione-cp/conto-prestito';
import { ContoPrestitoDto } from '../gestione-cp/conto-prestito-dto';
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
  movCP: MovCp = new MovCp();
  contoP: ContoPrestito;
  tipoMovimento: string;

  operazioni = [
    { name: "Concessione" },
    { name: "Erogazione" },
    { name: "Rimborso" }
  ];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  cerca() {
    let dto: CriterioCPDto = new CriterioCPDto();
    dto.ricerca = this.codice;
    let oss: Observable<ContoPrestitoDto> = this.http.post<ContoPrestitoDto>
      ("http://localhost:8080/cerca-mov-cp", dto);
    oss.subscribe(s => this.contoP = s.contoPrestito);
    //this.aggiorna();
    this.movimenti = this.contoP.listaMovCp;
    console.log(this.movimenti);
  }

  esegui() {
    let dto: MovimentaCPDto = new MovimentaCPDto();
    this.movCP.contoP = this.contoP;
    this.movCP.importoMov = this.importo;
    this.movCP.tipoMov = this.tipoMovimento;
    console.log(this.tipoMovimento);
    dto.movCp = this.movCP;
    let oss: Observable<ListaMovCpDto> = this.http.post<ListaMovCpDto>
      ("http://localhost:8080/esegui-mov-cp", dto);
    oss.subscribe(t => this.movimenti = t.listaMovCp);
  }

}
