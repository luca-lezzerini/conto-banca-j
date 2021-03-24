import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GestioneClienteComponent } from './gestione-cliente/gestione-cliente.component';
import { GestioneCcComponent } from './gestione-cc/gestione-cc.component';
import { GestioneCpComponent } from './gestione-cp/gestione-cp.component';
import { MostraTuttiIContiComponent } from './mostra-tutti-i-conti/mostra-tutti-i-conti.component';
import { GestioneCdComponent } from './gestione-cd/gestione-cd.component';
import { AssociaCpComponent } from './associa-cp/associa-cp.component';
import { EstrattoContoCpComponent } from './estratto-conto-cp/estratto-conto-cp.component';
import { HomePageComponent } from './home-page/home-page.component';
import { AssociaCcComponent } from './associa-cc/associa-cc.component';
import { AssociaCdComponent } from './associa-cd/associa-cd.component';
import { EcCcComponent } from './ec-cc/ec-cc.component';
import { SaldoCcComponent } from './saldo-cc/saldo-cc.component';
import { SaldoCpComponent } from './saldo-cp/saldo-cp.component';
import { SaldoCdComponent } from './saldo-cd/saldo-cd.component';
import { EstrattoContoCdComponent } from './estratto-conto-cd/estratto-conto-cd.component';

const routes: Routes = [
  { path: 'gestione-cliente', component: GestioneClienteComponent },
  { path: 'gestione-conto-corrente', component: GestioneCcComponent },
  { path: 'gestione-conto-prestito', component: GestioneCpComponent },
  { path: 'gestione-conto-deposito', component: GestioneCdComponent },
  { path: 'mostra-tutti-i-conti', component: MostraTuttiIContiComponent },
  { path: 'associa-cp', component: AssociaCpComponent },
  { path: 'associa-cc', component: AssociaCcComponent },
  { path: 'associa-cd', component: AssociaCdComponent },
  { path: 'estratto-conto-cp', component: EstrattoContoCpComponent },
  { path: 'estratto-conto-cc', component: EcCcComponent },
  { path: 'estratto-conto-cd', component: EstrattoContoCdComponent},
  { path: 'saldo-cc', component: SaldoCcComponent },
  { path: 'saldo-cd', component: SaldoCdComponent },
  { path: 'saldo-cp', component: SaldoCpComponent },
  { path: 'homepage', component: HomePageComponent },
  { path: '', redirectTo: '/homepage', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
