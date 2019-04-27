
import { Component, OnInit, ComponentFactoryResolver } from '@angular/core';
import { User } from 'src/app/models/User';
/** import { UserService } from '../../services/user.service'; */
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { LoginService } from '../../services/login.service';
import {TokenDTO} from 'src/app/dto/TokenDTO';
import {UserLoggedDTO} from 'src/app/dto/UserLoggedDTO';
import { HttpHeaderResponse, HttpErrorResponse, HttpResponseBase } from '@angular/common/http';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { headersToString } from 'selenium-webdriver/http';

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

    user: User;
    public tokenDTO: TokenDTO;
    userLoggedDTO:UserLoggedDTO;

    constructor(private loginService: LoginService, private router: Router) {

    }
    ngOnInit() {
        console.log('arrivato');

    }
 

    login(f: NgForm): void {
   
        console.log('mi arrivano username=' + f.value.username + ' password= ' + f.value.password);
        this.loginService.login(f.value.username, f.value.password).subscribe(response => {
            console.log('Risposta ricevuta');
            if (response != null) {
                this.tokenDTO = response;
                 console.log(this.tokenDTO);
                localStorage.setItem('jwt',this.tokenDTO.token);
            
                this.router.navigateByUrl("/home-user");
            }
        });

        
    }

    

   

    registrazione(): void{
        this.router.navigateByUrl("/registrazione");
    }

}
