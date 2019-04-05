import { Component, OnInit } from '@angular/core';
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
import {HttpHeaders } from '@angular/common/http';


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
  private imagen:Imagen;
  private user:Number;
  public bytes: Array<ArrayBufferTypes>;
  
  onFileSelected(event){
    this.selectedFile = <File>event.target.files[0];
    
    
   
  }

  constructor(private router: Router, private experienceService: ExperienceService, private principiService: PrincipiService, private http: HttpClient,
    private ImagenService: ImagenService) { }

  ngOnInit() {

    this.principiService.readPrincipi().subscribe((response)=> {
      this.secondari = response;
     console.log('Lista principi input caricarita');

  //   this.user = parseInt(sessionStorage.getItem("user");
  
 }); 
 
  }
   insertExperience(f: NgForm){
     this.experience = new Experience(null, null,f.value.commento,f.value.positivo,f.value.negativo,f.value.score, f.value.secondari, null);
     this.router.navigateByUrl("allExperience");
   }

   onUpload(){
     this.ImagenService.pushFileToStorage( this.selectedFile).subscribe(res=>{
      console.log(res);
      this.router.navigateByUrl('/InsertExperience');
    });
  }

   

}
