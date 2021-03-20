import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GestioneClienteComponent } from './gestione-cliente/gestione-cliente.component';

const routes: Routes = [
  {path:"gestione-cliente", component: GestioneClienteComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
