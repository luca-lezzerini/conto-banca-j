import { Component, OnInit } from '@angular/core';
import { Cliente } from '../gestione-cliente/cliente';
import { HttpClient } from '@angular/common/http';
import { FiltroCognomeDto } from '../mostra-tutti-i-conti/filtro-cognome-dto';
import { ListaClientiDto } from '../gestione-cliente/lista-clienti-dto';
import { Observable } from 'rxjs';
import { ContoCorrenteDto } from '../gestione-cc/contoCorrenteDto';
import { AssociaCCDto } from './associa-cc-dto';
import { ContoCorrente } from '../gestione-cc/contoCorrente';
import { MsgAssociaCCDto } from './msg-associa-cc-dto';
import { numContoCCDto } from '../gestione-cc/numContoCCDto';

@Component({
  selector: 'app-associa-cc',
  templateUrl: './associa-cc.component.html',
  styleUrls: ['../theme.css'],
})
export class AssociaCcComponent implements OnInit {
  cliente: Cliente = new Cliente();
  listaClienti: Cliente[] = [];
  ricercaCliente: string = '';
  ricercaCC: string = '';
  messaggioAss: string = '';
  contoCorrente: ContoCorrente = new ContoCorrente();

  constructor(private http: HttpClient) { }

  ngOnInit() { }

  cercaCliente() {
    let dto: FiltroCognomeDto = new FiltroCognomeDto();
    dto.cognome = this.ricercaCliente;
    let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>(
      'http://localhost:8080/cerca-cliente-equals',
      dto
    );
    oss.subscribe(l => this.listaClienti = l.listaClienti);
  }

  cercaCC() {
    if (this.ricercaCC != "") {
      let dto: numContoCCDto = new numContoCCDto();
      dto.numConto = this.ricercaCC;
      let oss: Observable<ContoCorrenteDto> = this.http.post<ContoCorrenteDto>(
        'http://localhost:8080/cerca-cc-equals',
        dto
      );
      oss.subscribe(l => this.contoCorrente = l.conto);
    }
    else {
      this.contoCorrente.numConto = null;
    }
  }

  associaCC(c: Cliente) {
    if (this.contoCorrente.numConto != null) {
      let dto: AssociaCCDto = new AssociaCCDto();
      dto.cliente = c;
      dto.contoCorrente = this.contoCorrente;
      let oss: Observable<MsgAssociaCCDto> = this.http.post<MsgAssociaCCDto>(
        'http://localhost:8080/associa-cc',
        dto
      );
      oss.subscribe(l => {
        this.messaggioAss = l.messaggio;
        console.log(this.messaggioAss);
      });
      this.contoCorrente = new ContoCorrente();
      this.ricercaCC = "";
    }
  }
}
