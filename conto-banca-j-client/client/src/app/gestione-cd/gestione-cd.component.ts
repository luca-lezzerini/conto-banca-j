import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ContoDeposito } from './contoDeposito';
import { ContoDepositoDto } from './contoDepositoDto';
import { ListaCDDto } from './listaCDDto';
import { ModificaCDDto } from './modificaCDDto';
import { NumContoCDDto } from './numCDDto';

@Component({
  selector: 'app-gestione-cd',
  templateUrl: './gestione-cd.component.html',
  styleUrls: ['../theme.css']
})
export class GestioneCdComponent implements OnInit {
codice: string;
listaConti: ContoDeposito[];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }
  aggiungi(): void{
    const dto: NumContoCDDto = new NumContoCDDto();
    dto.codice = this.codice;
    const oss: Observable<ListaCDDto> = this.http
      .post<ListaCDDto>('http://localhost:8080/new-cd', dto);
    oss.subscribe(l => this.listaConti = l.listaCD);
    this.codice = '';
  }

  modifica(c: ContoDeposito): void{
    const dto: ModificaCDDto = new ModificaCDDto();
    dto.conto = c;
    dto.nuovoNumeroConto = this.codice;
    const oss: Observable<ListaCDDto> = this.http
      .post<ListaCDDto>('http://localhost:8080/modifica-cd', dto);
    oss.subscribe(v => this.listaConti = v.listaCD);
    this.codice = '';
  }

  elimina(c: ContoDeposito): void{
    const dto: ContoDepositoDto = new ContoDepositoDto();
    dto.conto = c;
    const oss: Observable<ListaCDDto> = this.http
    .post<ListaCDDto>('http://localhost:8080/elimina-cd', dto);
    oss.subscribe(v => this.listaConti = v.listaCD);
  }
  aggiorna(): void{
    const oss: Observable<ListaCDDto> = this.http
      .get<ListaCDDto>('http://localhost:8080/aggiorna-lista-cd');
    oss.subscribe(v => this.listaConti = v.listaCD);
  }

}
