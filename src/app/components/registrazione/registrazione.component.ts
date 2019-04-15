import { Component, OnInit } from '@angular/core';
import { NgForm } from "@angular/forms";
import { RegistrazioneService } from "../../services/registrazione.service";
import { User } from "../../models/User";
import { Router, NavigationExtras } from '@angular/router';


@Component({
  selector: 'app-registrazione',
  templateUrl: './registrazione.component.html',
  styleUrls: ['./registrazione.component.css']
})
export class RegistrazioneComponent implements OnInit {

  constructor(private registrazioneService: RegistrazioneService, private router: Router) { }

  ngOnInit() 
  {
  }

    registrazione(f: NgForm){
    
  this.registrazioneService.registrazione(f.value.username, f.value.password, f.value.nome, f.value.cognome, f.value.email, f.value.lingua ).subscribe((response) => {
      
      if (response != null) {        
        this.router.navigateByUrl("/login");
      }
      else
      this.router.navigateByUrl("/registrazione");
      alert("Username già in uso");

    });
  }
}   

