import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {SiuntosListComponent} from "./components/siuntos-list/siuntos-list.component";
import {SiuntosDetailsComponent} from "./components/siuntos-details/siuntos-details.component";
import {SiuntosFormComponent} from "./components/siuntos-form/siuntos-form.component";
import {SiuntosUpdateComponent} from "./components/siuntos-update/siuntos-update.component";
import {PageNotFoundComponent} from "./components/page-not-found/page-not-found.component";

const routes: Routes = [
  { path: '', redirectTo: 'siuntos', pathMatch: 'full' },
  { path: 'siuntos', component: SiuntosListComponent },
  { path: 'siuntos/:id', component: SiuntosDetailsComponent },
  { path: 'addsiunta', component: SiuntosFormComponent},
  { path: 'updatesiunta/:id', component: SiuntosUpdateComponent},
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
