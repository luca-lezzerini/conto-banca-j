import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { MovCD } from '../estratto-conto-cd/mov-cd';

@Component({
  selector: 'app-movimenta-cd',
  templateUrl: './movimenta-cd.component.html',
  styleUrls: ['./movimenta-cd.component.css']
})
export class MovimentaCdComponent implements OnInit {
  codice: string;
  tipoMov: string;
  importo: number;
  listaMovCD: MovCD [] = [];
  movCD: MovCD;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
  }

  cerca(){
    const dto: 
  }
}
