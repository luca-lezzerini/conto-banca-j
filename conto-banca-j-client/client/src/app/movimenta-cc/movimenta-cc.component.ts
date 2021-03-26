import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { MovCC } from '../ec-cc/mov-cc';
import { ContoCorrente } from '../gestione-cc/contoCorrente';
import { ListaCCDto } from '../gestione-cc/listaCCDto';
import { numContoCCDto } from '../gestione-cc/numContoCCDto';
import { MovimentoCCDto } from './mov-cc-dto';
import { MovimentiCCDto } from './movimenti-cc-dto';
import { MovimentoCC } from './movimento-cc';

@Component({
  selector: 'app-movimenta-cc',
  templateUrl: './movimenta-cc.component.html',
  styleUrls: ['../theme.css']
})
export class MovimentaCcComponent implements OnInit {
  dataOdierna: Date;
  contoCorrente: ContoCorrente = new ContoCorrente();
  codice: string;
  tipoMov: string = "versamento";
  importo: number;
  listaMovCC: MovimentoCC[];

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
  }

  cerca() {
    let dto: numContoCCDto = new numContoCCDto();
    dto.numConto = this.contoCorrente.numConto;
    let oss: Observable<numContoCCDto> = this.http.post<numContoCCDto>("http://localhost:8080/cerca-conto", dto);
    oss.subscribe(c => this.codice = c.numConto);
  }
  esegui() {
    let dto: MovimentoCCDto = new MovimentoCCDto();
    dto.numContoCC=this.codice;
    dto.dataOdierna=this.dataOdierna;
    dto.importo = this.importo;
    dto.tipoMovimento = this.tipoMov;
    let oss: Observable<MovimentiCCDto> = this.http.post<MovimentiCCDto>("http://localhost:8080/esegui-movimento-cc", dto);
    oss.subscribe(x => this.listaMovCC = x.listaMovimentiCC);
  }
}
