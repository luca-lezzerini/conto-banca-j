import { Component, OnInit } from '@angular/core';
import { ContoPrestito } from '../conto-prestito';

@Component({
  selector: 'app-gestione-cp',
  templateUrl: './gestione-cp.component.html',
  styleUrls: ['./gestione-cp.component.css']
})
export class GestioneCpComponent implements OnInit {

  contoPrestito: ContoPrestito = new ContoPrestito();
  codici: ContoPrestito[] = [];


  constructor() { }

  ngOnInit(): void {
  }

  new() {

  }

  add(){

  }

  edit(c: ContoPrestito){

  }

  delete(c: ContoPrestito){

  }

}
