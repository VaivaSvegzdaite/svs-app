import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {AppRoutingModule} from './app-routing.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import {AppComponent} from './app.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import {FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import { ParcelListComponent } from './components/parcel-list/parcel-list.component';
import { ParcelFormComponent } from './components/parcel-form/parcel-form.component';
import { ParcelDetailsComponent } from './components/parcel-details/parcel-details.component';
import { ParcelUpdateComponent } from './components/parcel-update/parcel-update.component';


@NgModule({
  declarations: [
    AppComponent,
    PageNotFoundComponent,
    HeaderComponent,
    FooterComponent,
    ParcelListComponent,
    ParcelFormComponent,
    ParcelDetailsComponent,
    ParcelUpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule,
    ReactiveFormsModule,
    FontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
