import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ContoCorrente } from '../gestione-cc/contoCorrente';
import { ContoDeposito } from '../gestione-cd/contoDeposito';
import { Cliente } from '../gestione-cliente/cliente';
import { ContoPrestito } from '../gestione-cp/conto-prestito';

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
    
  }

  mostraConti(c:Cliente){

  }
 
}
