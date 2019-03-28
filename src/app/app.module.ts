import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { LoginComponent } from './components/login/login.component';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { HomeUserComponent } from './components/home-user/home-user.component';

import { PrincipiReadComponent } from './components/principi/principi-read/principi-read.component';

import { FeedbackComponent } from './components/feedback/feedback.component';






@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeUserComponent,
    PrincipiReadComponent,
    FeedbackComponent,
    
],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
