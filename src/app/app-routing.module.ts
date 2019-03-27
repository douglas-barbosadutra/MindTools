import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


//Login
import {LoginComponent} from './components/login/login.component';
import { HomeUserComponent } from './components/home-user/home-user.component';

//homeuser


import { PrincipiReadComponent } from './components/principi/principi-read/principi-read.component';

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  {path: 'login', component: LoginComponent},
  {path: 'home-user', component: HomeUserComponent},
  {path: 'principi-read', component:  PrincipiReadComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
