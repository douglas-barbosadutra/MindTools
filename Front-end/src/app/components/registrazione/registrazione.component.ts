import { Component, OnInit } from '@angular/core';
import { NgForm } from "@angular/forms";
import { RegistrazioneService } from "../../services/registrazione.service";
import { User } from "../../models/User";
import { Router, NavigationExtras } from '@angular/router';
import {ParamDTO} from 'src/app/dto/ParamDTO';
import {UserDTO} from 'src/app/dto/UserDTO';


@Component({
  selector: 'app-registrazione',
  templateUrl: './registrazione.component.html',
  styleUrls: ['./registrazione.component.css']
})
export class RegistrazioneComponent implements OnInit {
  
  public paramDTO: ParamDTO;
  public userDTO: UserDTO;

  constructor(private registrazioneService: RegistrazioneService, private router: Router) { }

  ngOnInit() 
  {
    var a = localStorage.getItem("jwt");
  }

  registrazione(f: NgForm)
  {
    var a = localStorage.getItem("jwt");
    this.userDTO = new UserDTO(0, f.value.username, f.value.password, f.value.nome, f.value.cognome, f.value.email, f.value.lingua, 0 );
    this.paramDTO = new ParamDTO(a, this.userDTO);



    this.registrazioneService.registrazione(this.paramDTO ).subscribe((response) => {
      if (response != null) {   
       console.log("arrivo");  
        this.router.navigateByUrl("Login");
     }
     else
     this.router.navigateByUrl("Registrazione");
    });
  }
  
  }

  









