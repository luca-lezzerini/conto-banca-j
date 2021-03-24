import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GestioneClienteComponent } from './gestione-cliente/gestione-cliente.component';
import { GestioneCcComponent } from './gestione-cc/gestione-cc.component';
import { GestioneCpComponent } from './gestione-cp/gestione-cp.component';
import { GestioneCdComponent } from './gestione-cd/gestione-cd.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { MostraTuttiIContiComponent } from './mostra-tutti-i-conti/mostra-tutti-i-conti.component';
import { AssociaCpComponent } from './associa-cp/associa-cp.component';
import { HomePageComponent } from './home-page/home-page.component';
import { EstrattoContoCpComponent } from './estratto-conto-cp/estratto-conto-cp.component';
import { AssociaCcComponent } from './associa-cc/associa-cc.component';
import { AssociaCdComponent } from './associa-cd/associa-cd.component';
import { EcCcComponent } from './ec-cc/ec-cc.component';
import { SaldoCcComponent } from './saldo-cc/saldo-cc.component';
import { SaldoCpComponent } from './saldo-cp/saldo-cp.component';
import { SaldoCdComponent } from './saldo-cd/saldo-cd.component';
import { EstrattoContoCdComponent } from './estratto-conto-cd/estratto-conto-cd.component';

@NgModule({
  declarations: [
    AppComponent,
    GestioneClienteComponent,
    GestioneCcComponent,
    GestioneCpComponent,
    GestioneCdComponent,
    MostraTuttiIContiComponent,
    AssociaCpComponent,
    HomePageComponent,
    EstrattoContoCpComponent,
    AssociaCcComponent,
    AssociaCdComponent,
    EcCcComponent,
    SaldoCcComponent,
    SaldoCdComponent,
    SaldoCpComponent,
    EstrattoContoCdComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule, HttpClientModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
