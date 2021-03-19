import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GestioneClienteComponent } from './gestione-cliente/gestione-cliente.component';
import { GestioneCcComponent } from './gestione-cc/gestione-cc.component';
import { GestioneCpComponent } from './gestione-cp/gestione-cp.component';
import { GestioneCdComponent } from './gestione-cd/gestione-cd.component';

@NgModule({
  declarations: [
    AppComponent,
    GestioneClienteComponent,
    GestioneCcComponent,
    GestioneCpComponent,
    GestioneCdComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
