import { Injectable } from '@angular/core';
import { tap, catchError } from 'rxjs/operators';
import {HttpClient, HttpParams} from '@angular/common/http';
import { User } from '../models/User';
import {Observable, of, BehaviorSubject} from 'rxjs';


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

  registrazione(username: string, password:string, nome: string, cognome: string, email: string, lingua: string): Observable<User> 
  {
    const params = new HttpParams().set('iduser', '0').set('username', username).set('password', password).set('nome', nome).set('cognome', cognome).
        set('email', email).set('lingua', lingua);
        return this.http.post<User>('http://localhost:8080/Registrazione/reg', params);

  }
}
