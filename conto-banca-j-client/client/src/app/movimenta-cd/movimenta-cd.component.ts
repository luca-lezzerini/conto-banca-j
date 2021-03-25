import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { MovCD } from '../estratto-conto-cd/mov-cd';
import {NumContoCDDto} from '../gestione-cd/numCDDto';
import {Observable} from 'rxjs';
import {ContoDepositoDto} from '../gestione-cd/contoDepositoDto';
import {ContoDeposito} from '../gestione-cd/contoDeposito';
import {MovimentaCdDto} from './movimenta-cd-dto';
import {ListaMovCDDto} from '../estratto-conto-cd/lista-mov-cd-dto';

@Component({
  selector: 'app-movimenta-cd',
  templateUrl: './movimenta-cd.component.html',
  styleUrls: ['./movimenta-cd.component.css']
})
export class MovimentaCdComponent implements OnInit {
  codice: string;
  tipoMov: string;
  importo: number;
  conto: ContoDeposito = new ContoDeposito();
  listaMovCD: MovCD [] = [];
  movCD: MovCD;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
  }

  cerca(): void{
    const dto: NumContoCDDto = new NumContoCDDto();
    dto.codice = this.codice;
    const oss: Observable<ContoDepositoDto> = this.http
      .post<ContoDepositoDto>('http://localhost:8080/cerca-conto-deposito', dto);
    oss.subscribe(r => this.conto = r.conto);
    this.aggiornaListaMovimentiCD();
  }
  esegui(): void {
    const dto: MovimentaCdDto = new MovimentaCdDto();
    dto.conto = this.conto;
    dto.importo = this.importo;
    dto.tipoMovimento = this.tipoMov;
    const oss: Observable<null> = this.http
      .post<null>('http://localhost:8080/esegui-movimento-cd', dto);
    oss.subscribe();
    this.aggiornaListaMovimentiCD();
  }
  aggiornaListaMovimentiCD(): void {
    const dto: ContoDepositoDto = new ContoDepositoDto();
    dto.conto = this.conto;
    const oss: Observable<ListaMovCDDto> = this.http
      .post<ListaMovCDDto>('http://localhost:8080/mostra-movimenti-conto-dto', dto);
    oss.subscribe(l => this.listaMovCD = l.listaMovCD);
  }
}
