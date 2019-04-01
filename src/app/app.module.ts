import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { HomeUserComponent } from './components/home-user/home-user.component';
import { PrincipiReadComponent } from './components/principi/principi-read/principi-read.component';
import { InsertExperienceComponent} from './components/experience/insert-experience/insert-experience.component';
import { FeedbackComponent } from './components/feedback/feedback.component';
import { RegistrazioneComponent } from './components/registrazione/registrazione.component';
import { AllExperienceComponent } from './components/experience/all-experience/all-experience.component';
import { ExperienceService } from './services/experience.service';
import { LoginService } from './services/login.service';
import { FeedbackService } from './services/feedback.service';
import { ImagenService } from './services/imagen.service';
import { PrincipiService } from './services/principi/principi.service';






@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeUserComponent,
    PrincipiReadComponent,
    FeedbackComponent,
    RegistrazioneComponent,
    AllExperienceComponent,
    InsertExperienceComponent
],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ExperienceService, LoginService, FeedbackService, ImagenService, PrincipiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
