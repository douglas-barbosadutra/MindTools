import { Injectable } from '@angular/core';
import{ HttpClient } from '@angular/common/http';
import {Experience} from 'src/app/models/Experience';



@Injectable({
  providedIn: 'root'
})
export class ExperienceService {

  constructor(private http: HttpClient) { }
  insertExperience(experience : Experience){
    return this.http.post('http//localhost:8080/Experience/insertExperience', experience);
  }
  AllExperiences(){
    return this.http.get('http://localhost:8080/Experience/AllExperiences');

  }


}
