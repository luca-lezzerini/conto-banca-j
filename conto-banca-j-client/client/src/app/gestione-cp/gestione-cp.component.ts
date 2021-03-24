import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ContoPrestito } from './conto-prestito';
import { ContoPrestitoDto } from './conto-prestito-dto';
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
  messaggioErrore: string;
  codiceEdit = true;
  addVisibileAdd: boolean;
  addVisibileInput: boolean;
  addVisibileIntestazioneTabella: boolean;
  newVisibile:boolean=true;


  constructor(private http: HttpClient,private router:Router) { }

  ngOnInit(): void {
  }

  new(): void {
    this.aggiorna();
    this.codiceEdit = false;
    this.addVisibileAdd = true;
    this.addVisibileInput = true;
    this.addVisibileIntestazioneTabella = true;
    this.newVisibile=false;

  }

  homepage(){
   this.router.navigateByUrl('/homepage')
  }

  add() {
    if (this.codice == "") {
      this.messaggioErrore = "Errore nella compilazione. Inserire un codice conto valido"
    }
    else {
      this.messaggioErrore = "";
      let dto: NumCpDto = new NumCpDto();
      dto.codice = this.codice;
      let ox: Observable<ListaCpDto> = this.http.post<ListaCpDto>("http://localhost:8080/add", dto);
      ox.subscribe(a => this.listaCodici = a.listaCodici);

      this.codice = ""
    }
  }
  edit(c: ContoPrestito) {

    if (this.codice == "") {
      this.messaggioErrore = "Errore nella compilazione. Inserire un codice conto valido"
    }
    else {
      this.messaggioErrore = "";
      let dto: ContoPrestitoDto = new ContoPrestitoDto();
      dto.contoPrestito = c;
      c.codice = this.codice;
      let ov: Observable<ListaCpDto> = this.http.post<ListaCpDto>("http://localhost:8080/edit", dto);
      ov.subscribe(e => this.listaCodici = e.listaCodici);

      this.codice = ""
    }
  }
  delete(c: ContoPrestito) {
    this.messaggioErrore = "";
    let dto: NumCpDto = new NumCpDto();
    dto.codice = c.codice;
    let oz: Observable<ListaCpDto> = this.http.post<ListaCpDto>("http://localhost:8080/delete", dto);
    oz.subscribe(d => this.listaCodici = d.listaCodici);

    this.codice = ""
  }
  aggiorna() {
    this.codice = "";
    let ow: Observable<ListaCpDto> = this.http.get<ListaCpDto>("http://localhost:8080/aggiorna")
    ow.subscribe(a => this.listaCodici = a.listaCodici)
  }

}
