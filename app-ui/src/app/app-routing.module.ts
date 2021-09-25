import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ParcelListComponent} from "./components/parcel-list/parcel-list.component";
import {ParcelDetailsComponent} from "./components/parcel-details/parcel-details.component";
import {ParcelFormComponent} from "./components/parcel-form/parcel-form.component";
import {ParcelUpdateComponent} from "./components/parcel-update/parcel-update.component";

const routes: Routes = [
  {path: '', redirectTo: 'parcels', pathMatch: 'full'},
  {path: 'parcels', component: ParcelListComponent},
  {path: 'parcels/:id', component: ParcelDetailsComponent},
  {path: 'addparcel', component: ParcelFormComponent},
  {path: 'updateparcel/:id', component: ParcelUpdateComponent},
  {path: '**', redirectTo: 'parcels', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
