import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {NgForm} from '@angular/forms';
import{Experience} from 'src/app/models/Experience';
import{Principi} from 'src/app/models/Principi';
import {ExperienceService} from 'src/app/services/experience.service';
import{PrincipiService} from 'src/app/services/principi/principi.service';

@Component({
  selector: 'app-insert-experience',
  templateUrl: './insert-experience.component.html',
  styleUrls: ['./insert-experience.component.css']
})
export class InsertExperienceComponent implements OnInit {

  private experience : Experience;
  public secondari: Array<Principi>;

  constructor(private router: Router, private experienceService: ExperienceService, private principiService: PrincipiService) { }

  ngOnInit() {
  }
   insertExperience(f: NgForm, imagen: NgForm){
     this.experience = new Experience(null, null,f.value.commento,f.value.positivo,f.value.negativo,f.value.score, f.value.secondari, imagen.value.imagen)
     
   

   this.principiService.readPrincipi().subscribe((response) => {
     this.secondari = response;
    console.log('Lista principi input caricarita');
});
   }
   

}
