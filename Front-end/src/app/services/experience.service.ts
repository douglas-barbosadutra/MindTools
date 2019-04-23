import { Injectable } from '@angular/core';
import{ HttpClient, HttpParams } from '@angular/common/http';
import {Experience} from 'src/app/models/Experience';
import {Observable, of, BehaviorSubject} from 'rxjs';
import { ExperienceUserFeedbackDTO } from 'src/app/models/ExperienceUserFeedbackDTO';
import {Feedback} from 'src/app/models/Feedback';
import {User} from 'src/app/models/User';
import { ExperienceDTO } from '../dto/ExperienceDTO';


@Injectable({
  providedIn: 'root'
})
export class ExperienceService {


  constructor(private http: HttpClient) { }
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.log(result);
      console.error(error);
      console.log('${operation} failed: ${error.message}');
      return of(result as T);
    };
  }
  
  insertExperience(experienceDTO: ExperienceDTO):Observable<any>{
    
    return this.http.post<any>("http://localhost:8080/Experience/insert", experienceDTO);
    
  }
  showAllExperiences(idUser: number):Observable<Array<ExperienceUserFeedbackDTO>>{
    return this.http.get<Array<ExperienceUserFeedbackDTO>> ("http://localhost:8080/Experience/showAllExperience?idUser=" +idUser);
  }

}