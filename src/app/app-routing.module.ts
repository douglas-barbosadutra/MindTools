import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


//Login
import {LoginComponent} from './components/login/login.component';
import { HomeUserComponent } from './components/home-user/home-user.component';

//homeuser


import { PrincipiReadComponent } from './components/principi/principi-read/principi-read.component';
import { FeedbackComponent } from './components/feedback/feedback.component';
//Experience
import { AllExperienceComponent } from './components/experience/all-experience/all-experience.component';
//InsertExperience
import { InsertExperienceComponent } from './components/experience/insert-experience/insert-experience.component';

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  {path: 'login', component: LoginComponent},
  {path: 'home-user', component: HomeUserComponent},
  {path: 'PrincipiRead', component:  PrincipiReadComponent},
  {path: 'feedback', component:  FeedbackComponent},
  {path: 'AllExperience', component:  AllExperienceComponent},
  {path: 'InsertExperience', component:  InsertExperienceComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash: true,onSameUrlNavigation: 'reload'})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
