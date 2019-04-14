import { Component, OnInit, ɵConsole } from '@angular/core';
import {Router} from '@angular/router';
import { Injectable } from '@angular/core';
import {NgForm} from '@angular/forms';
import{Experience} from 'src/app/models/Experience';
import{Principi} from 'src/app/models/Principi';
import {ExperienceService} from 'src/app/services/experience.service';
import{PrincipiService} from 'src/app/services/principi/principi.service';
import { Imagen } from 'src/app/models/Imagen';
import { HttpClient} from '@angular/common/http';
import {ImagenService} from 'src/app/services/imagen.service';
import { ExperienceDTO } from 'src/app/dto/ExperienceDTO';

import { User } from 'src/app/models/User';

@Component({
  selector: 'app-insert-experience',
  templateUrl: './insert-experience.component.html',
  styleUrls: ['./insert-experience.component.css']
})
@Injectable({
  providedIn: 'root'
})
export class InsertExperienceComponent implements OnInit {
  public selectedFile:File = null;
  private experience : Experience;
  public secondari: Array<Principi>;
  public secon: Array<string> = new Array();
  private user:User;
  private score:number;
  private idPrincipi: number;
  private experienceDTO: ExperienceDTO;
  
  
  onFileSelected(event){
    this.selectedFile = <File>event.target.files[0];
    
  }
  onRadioSelected(event){
    var target = event.target;
       if (target.checked) {
        this.score = target.value;
       } 
    console.log(this.score);
  }


  onChecked(event){
    var target = event.target;
    if(target.checked){
      this.secon.push(target.value);
    }
  }
  

  constructor(private router: Router, private experienceService: ExperienceService, private principiService: PrincipiService, private http: HttpClient,
    private ImagenService: ImagenService) { }

  ngOnInit() {

    this.principiService.readPrincipi().subscribe((response)=> {
      this.secondari = response;
 }); 
 
  }
   insertExperience(f: NgForm){
    this.user = JSON.parse(sessionStorage.getItem("user"));
    this.idPrincipi = parseInt(sessionStorage.getItem("idPrincipi"));
    this.experienceDTO =  new ExperienceDTO(this.user, this.idPrincipi, f.value.commento, f.value.positivo, f.value.negativo, this.score, this.secon)
     console.log(this.experienceDTO);
     
    this.experienceService.insertExperience(this.experienceDTO).subscribe((response) => {
      
        if (response != null) {   
         console.log("arrivo");  
          this.router.navigateByUrl("AllExperience");
       }
       else
       this.router.navigateByUrl("InsertExperience");
        
  
      });
   }

   onUpload(){
     this.ImagenService.pushFileToStorage( this.selectedFile).subscribe(res=>{
      console.log(res);
      this.router.navigateByUrl("InsertExperience");
    });
  }

   

}