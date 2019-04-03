import { Injectable } from '@angular/core';
import{ HttpClient } from '@angular/common/http';
import {Experience} from 'src/app/models/Experience';
import {Observable, of, BehaviorSubject} from 'rxjs';
import { ExperienceUserFeedbackDTO } from 'src/app/models/ExperienceUserFeedbackDTO';


@Injectable({
  providedIn: 'root'
})
export class ExperienceService {

  constructor(private http: HttpClient) { }
  insertExperience(experience : Experience){
    return this.http.post('http//localhost:8080/Experience/insertExperience', experience);
  }
  showAllExperiences(idUser: number):Observable<Array<ExperienceUserFeedbackDTO>>{
    return this.http.get<Array<ExperienceUserFeedbackDTO>> ("http://localhost:8080/Experience/showAllExperience?idUser=" +idUser);
  }

}
