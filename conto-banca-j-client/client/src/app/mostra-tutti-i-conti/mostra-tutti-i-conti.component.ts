import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ContoCorrente } from '../gestione-cc/contoCorrente';
import { ContoDeposito } from '../gestione-cd/contoDeposito';
import { Cliente } from '../gestione-cliente/cliente';
import { ListaClientiDto } from '../gestione-cliente/lista-clienti-dto';
import { ContoPrestito } from '../gestione-cp/conto-prestito';
import { FiltroCognomeDto } from './filtro-cognome-dto';
import { Observable } from 'rxjs';
import { ListaContiClienteDto } from './lista-conti-cliente-dto';
import { ClienteDto } from '../gestione-cliente/cliente-dto';

@Component({
  selector: 'app-mostra-tutti-i-conti',
  templateUrl: './mostra-tutti-i-conti.component.html',
  styleUrls: ['./mostra-tutti-i-conti.component.css']
})
export class MostraTuttiIContiComponent implements OnInit {


  cliente = new Cliente();
  clienti: Cliente[] = [];

  contoCorrente = new ContoCorrente();
  contiCorrenti: ContoCorrente[] = [];

  contoPrestito = new ContoPrestito();
  contiPrestiti: ContoPrestito[] = [];

  contoDeposito = new ContoDeposito;
  contiDepositi: ContoDeposito[] = [];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  cerca() {
    let dto: FiltroCognomeDto = new FiltroCognomeDto();
    dto.cognome = this.cliente.cognome;
    let oss: Observable<ListaClientiDto> = this.http.post<ListaClientiDto>("http://localhost:8080/cerca-cliente", dto);
    oss.subscribe(c => this.clienti = c.listaClienti);
    this.cliente.cognome = "";
  }

  mostraConti(c: Cliente) {
    let dto:ClienteDto = new ClienteDto();
    dto.cliente=c;
    let fx: Observable<ListaContiClienteDto> = this.http.post<ListaContiClienteDto>("http://localhost:8080/carica-conti", dto);
    fx.subscribe(m => {
      this.contiDepositi = m.listaCD;
      this.contiPrestiti = m.listaCP;
      this.contiCorrenti = m.listaCC;
    });

  }
}
