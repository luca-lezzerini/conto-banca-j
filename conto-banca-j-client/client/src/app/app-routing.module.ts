import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GestioneClienteComponent } from './gestione-cliente/gestione-cliente.component';
import {GestioneCcComponent} from './gestione-cc/gestione-cc.component';

const routes: Routes = [
  {path: 'gestione-cliente', component: GestioneClienteComponent},
  {path: 'gestione-conto-corrente', component: GestioneCcComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
