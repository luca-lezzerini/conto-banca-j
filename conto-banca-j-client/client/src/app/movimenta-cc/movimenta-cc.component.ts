import { Component, OnInit } from '@angular/core';
import { MovCC } from '../ec-cc/mov-cc';

@Component({
  selector: 'app-movimenta-cc',
  templateUrl: './movimenta-cc.component.html',
  styleUrls: ['../theme.css']
})
export class MovimentaCcComponent implements OnInit {
  codice:string;
  tipoMov:string="versamento";
  importo:number;
  listaMovCC:MovCC[];

  constructor() { }

  ngOnInit(): void {
  }
cerca(){}
esegui(){}
}
