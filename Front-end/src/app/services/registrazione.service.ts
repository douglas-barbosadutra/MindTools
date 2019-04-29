import { Injectable } from '@angular/core';
import { tap, catchError } from 'rxjs/operators';
import {HttpClient, HttpParams} from '@angular/common/http';
import { User } from '../models/User';
import {Observable, of, BehaviorSubject} from 'rxjs';
import {ParamDTO} from 'src/app/dto/ParamDTO';


@Injectable({
  providedIn: 'root'
})
export class RegistrazioneService {

  constructor(private http: HttpClient) { }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.log(result);
      console.error(error);
      console.log('${operation} failed: ${error.message}');
      return of(result as T);
    };
  }

  registrazione(paramDTO : ParamDTO):Observable<any>
  {
    return this.http.post<any>("http://localhost:8094/Registrazione/reg",paramDTO);
  }
}
