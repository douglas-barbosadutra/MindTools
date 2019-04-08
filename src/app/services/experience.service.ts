import { Injectable } from '@angular/core';
import{ HttpClient, HttpParams } from '@angular/common/http';
import {Experience} from 'src/app/models/Experience';
import {Observable, of, BehaviorSubject} from 'rxjs';
import { ExperienceUserFeedbackDTO } from 'src/app/models/ExperienceUserFeedbackDTO';
import {Feedback} from 'src/app/models/Feedback';
import {User} from 'src/app/models/User';


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
  
  insertExperience(
     IDuser: number, 
     idPrincipi: number,
      commento: string, 
      positivo: string, 
      negativo: string,  
    score: string, 
     secon: Array<string>,
      ):Observable<any>{
       
    const params = new HttpParams()
    .set('user',JSON.stringify(IDuser))
    .set('idPrincipi',JSON.stringify(idPrincipi))
    .set('commento',commento)
    .set('positivo',positivo)
    .set('negativo',negativo)
    .set('score',score)
    .set('idsprincipi[]',JSON.stringify(secon));
   
    alert(params);
    return this.http.post<any>("http//localhost:8080/Experience/insertExperience", params);
    
  }
  showAllExperiences(idUser: number):Observable<Array<ExperienceUserFeedbackDTO>>{
    return this.http.get<Array<ExperienceUserFeedbackDTO>> ("http://localhost:8080/Experience/showAllExperience?idUser=" +idUser);
  }

}
