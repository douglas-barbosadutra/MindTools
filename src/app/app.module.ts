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
import {RegistrazioneService} from './services/registrazione.service';
import { PrincipiService } from './services/principi/principi.service';
import { PrincipiSelectOneComponent } from './components/principi/principi-select-one/principi-select-one.component';
import { PrincipiRandomComponent } from './components/principi/principi-random/principi-random.component';
import { PrincipiByParolaComponent } from './components/principi/principi-by-parola/principi-by-parola.component';
import {MatrixComponent} from './components/matrix/matrix.component';
import { MatrixService } from './services/matrix.service';
import { ParametriService } from './services/parametri.service';
import { ParametriComponent } from './components/parametri/parametri.component';
import { ContradictionComponent } from './components/contradiction/contradiction.component';








@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeUserComponent,
    PrincipiReadComponent,
    FeedbackComponent,
    RegistrazioneComponent,
    AllExperienceComponent,
    InsertExperienceComponent,
    PrincipiSelectOneComponent,
    PrincipiRandomComponent,
    PrincipiByParolaComponent,
    MatrixComponent,
    ParametriComponent,
    ContradictionComponent,
   
   
    
    
  
],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [ExperienceService, LoginService, FeedbackService, ImagenService, PrincipiService, RegistrazioneService, MatrixService, ParametriService],
  bootstrap: [AppComponent]
})
export class AppModule { }
