import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import {Parametri} from 'src/app/models/Parametri';
import { tap, catchError } from 'rxjs/operators';
import { Queue } from 'queue-typescript';

@Injectable({
  providedIn: 'root'
})
export class ParametriService {
  public parametriList: Array<Parametri>;
  public merge: string;
  
  
  constructor(private http:HttpClient) { }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
        console.error(error);
        console.log('${operation} failed: ${error.message}');
        return of(result as T);
    };
  }

  readParametri():Observable <Array<Parametri>> {
    return this.http.get<Array<Parametri>>("http://localhost:8094/Parametri/param")
    
  }

  inviaParametriSelezionati(parametriSelezionati :  Array<Parametri>): Observable<any>
  {
    return this.http.post<any>("http://localhost:8094/Matrice/contradizione", parametriSelezionati);
    

  }
  
}
