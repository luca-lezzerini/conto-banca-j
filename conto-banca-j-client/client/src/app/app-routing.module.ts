import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GestioneClienteComponent } from './gestione-cliente/gestione-cliente.component';
import {GestioneCcComponent} from './gestione-cc/gestione-cc.component';
import { GestioneCpComponent } from './gestione-cp/gestione-cp.component';
import { MostraTuttiIContiComponent } from './mostra-tutti-i-conti/mostra-tutti-i-conti.component';
import { GestioneCdComponent } from './gestione-cd/gestione-cd.component';
import { AssociaCpComponent } from './associa-cp/associa-cp.component';

const routes: Routes = [
  {path: 'gestione-cliente', component: GestioneClienteComponent},
  {path: 'gestione-conto-corrente', component: GestioneCcComponent},
  {path: 'gestione-conto-prestito', component: GestioneCpComponent},
  {path: 'gestione-conto-deposito', component: GestioneCdComponent},
  {path: 'mostra-tutti-i-conti',component: MostraTuttiIContiComponent},
  {path: 'associa-cp', component: AssociaCpComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
