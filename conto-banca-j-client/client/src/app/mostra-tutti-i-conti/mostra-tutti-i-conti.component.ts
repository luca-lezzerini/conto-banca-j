import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Cliente } from '../gestione-cliente/cliente';

@Component({
  selector: 'app-mostra-tutti-i-conti',
  templateUrl: './mostra-tutti-i-conti.component.html',
  styleUrls: ['./mostra-tutti-i-conti.component.css']
})
export class MostraTuttiIContiComponent implements OnInit {

  
cliente = new Cliente();
clienti: Cliente[] = [];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  cerca() {
    
  }

  mostraConti(c:Cliente){

  }

}
