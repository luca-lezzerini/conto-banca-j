import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ContoPrestito } from './conto-prestito';
import { ListaCpDto } from './lista-cp-dto';
import { NumCpDto } from './num-cp-dto';

@Component({
  selector: 'app-gestione-cp',
  templateUrl: './gestione-cp.component.html',
  styleUrls: ['./gestione-cp.component.css']
})
export class GestioneCpComponent implements OnInit {

  codice: string;
  listaCodici: ContoPrestito[] = [];
  
  id: number=0;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  new() {

  }

  add() {
    let dto: NumCpDto = new NumCpDto();
    dto.codice = this.codice;
    let ox: Observable<ListaCpDto> = this.http.post<ListaCpDto>("http://localhost:8080/add", dto);
    ox.subscribe(a => this.listaCodici = a.listaCodici);
  }

  edit(c: ContoPrestito) {
    let dto: NumCpDto = new NumCpDto;
    dto.codice = c.codice;
    let ov: Observable<ListaCpDto> = this.http.post<ListaCpDto>("http://localhost:8080/edit", dto);
    ov.subscribe(e => this.listaCodici = e.listaCodici);
  }



  delete(c: ContoPrestito) {
    let dto: NumCpDto = new NumCpDto;
    dto.codice = c.codice;
    let oz: Observable<ListaCpDto> = this.http.post<ListaCpDto>("http://localhost:8080/delete", dto);
    oz.subscribe(d => this.listaCodici = d.listaCodici);
  }



}
