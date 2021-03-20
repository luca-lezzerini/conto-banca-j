import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ContoCorrente } from './contoCorrente';
import { ContoCorrenteDto } from './contoCorrenteDto';
import { ListaCCDto } from './listaCCDto';
import { numContoCCDto } from './numContoCCDto';
import {ModificaCCDto} from './ModificaCCDto';

@Component({
  selector: 'app-gestione-cc',
  templateUrl: './gestione-cc.component.html',
  styleUrls: ['./gestione-cc.component.css']
})
export class GestioneCcComponent implements OnInit {

  numConto: string;
  listaConti: Array<ContoCorrente>;
  numContoEditable = false;
  constructor(private http: HttpClient) {
    this.aggiorna();
  }

  ngOnInit(): void {
  }

  nuovo(): void{
    this.numContoEditable = false;
  }

  aggiungi(): void{
    const dto: numContoCCDto = new numContoCCDto();
    dto.numConto = this.numConto;
    const oss: Observable<ListaCCDto> = this.http
      .post<ListaCCDto>('http://localhost:8080/new', dto);
    oss.subscribe(l => this.listaConti = l.listaCC);
    this.numConto = '';
  }

  modifica(c: ContoCorrente): void{
    const dto: ModificaCCDto = new ModificaCCDto();
    dto.conto = c;
    dto.nuovoNumeroConto = this.numConto;
    const oss: Observable<ListaCCDto> = this.http
      .post<ListaCCDto>('http://localhost:8080/modifica', dto);
    oss.subscribe(v => this.listaConti = v.listaCC);
    this.numConto = '';
  }

  elimina(c: ContoCorrente): void{
    const dto: ContoCorrenteDto = new ContoCorrenteDto();
    dto.conto = c;
    const oss: Observable<ListaCCDto> = this.http
    .post<ListaCCDto>('http://localhost:8080/elimina', dto);
    oss.subscribe(v => this.listaConti = v.listaCC);
  }
  aggiorna(): void{
    const oss: Observable<ListaCCDto> = this.http
      .get<ListaCCDto>('http://localhost:8080/aggiorna-lista');
    oss.subscribe(v => this.listaConti = v.listaCC);
  }
}
