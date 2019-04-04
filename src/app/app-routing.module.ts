import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


//Login
import {LoginComponent} from './components/login/login.component';
import { HomeUserComponent } from './components/home-user/home-user.component';
import {RegistrazioneComponent} from './components/registrazione/registrazione.component';

//homeuser


import { PrincipiReadComponent } from './components/principi/principi-read/principi-read.component';
import { FeedbackComponent } from './components/feedback/feedback.component';
//Experience
import { AllExperienceComponent } from './components/experience/all-experience/all-experience.component';
//InsertExperience
import { InsertExperienceComponent } from './components/experience/insert-experience/insert-experience.component';
import { PrincipiSelectOneComponent } from './components/principi/principi-select-one/principi-select-one.component';
import { PrincipiRandomComponent } from './components/principi/principi-random/principi-random.component';
import { PrincipiByParolaComponent } from './components/principi/principi-by-parola/principi-by-parola.component';
import {MatrixComponent} from './components/matrix/matrix.component';
import { ZoomComponent } from './components/zoom/zoom.component';
const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  {path: 'login', component: LoginComponent},
  {path: 'registrazione', component: RegistrazioneComponent},
  {path: 'home-user', component: HomeUserComponent},
  {path: 'PrincipiRead', component:  PrincipiReadComponent},
  {path: 'feedback', component:  FeedbackComponent},
  {path: 'AllExperience', component:  AllExperienceComponent},
  {path: 'InsertExperience', component:  InsertExperienceComponent},
  {path: 'PrincipiSelectOne', component:  PrincipiSelectOneComponent},
  {path: 'PrincipiRandom', component:  PrincipiRandomComponent},
  {path: 'PrincipiByParola', component:  PrincipiByParolaComponent},
  {path: 'matrix', component:  MatrixComponent},
  {path: 'Zoom', component:  ZoomComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash: true,onSameUrlNavigation: 'reload'})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
