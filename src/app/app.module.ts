import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PrincipiComponent } from './components/principi/principi.component';
import { LoginComponent } from './components/login/login.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { InsertExperienceComponent } from './components/experience/insert-experience/insert-experience.component';
import { AllExperienceComponent } from './components/experience/all-experience/all-experience.component';




@NgModule({
  declarations: [
    AppComponent,
    PrincipiComponent,
    LoginComponent,
    ExperienceComponent,
    InsertExperienceComponent,
    AllExperienceComponent
],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
