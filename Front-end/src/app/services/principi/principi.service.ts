import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse, HttpParams} from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { Principi } from 'src/app/models/Principi';
import { tap, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PrincipiService {
  
  constructor(private http:HttpClient) { }
  l

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
        console.error(error);
        console.log('${operation} failed: ${error.message}');
        return of(result as T);
    };
}

readPrincipi(token:string):Observable<Array<Principi>>{
  return this.http.get<Array<Principi>>("http://localhost:8094/Principi/ShowAllPrincipi?jwt="+token);
  
}

selectPrincipio(idPrincipi:number):Observable <Principi> {
return this.http.get<Principi>('http://localhost:8094/Principi/SelezionaPrincipio?id='+idPrincipi);

}
cerca(pChiave : string):Observable <Array<Principi>> {
  return this.http.get<Array<Principi>>('http://localhost:8094/Principi/PrincipiByParola?pChiave='+pChiave);
  
  }

  random(token:string):Observable <Principi> {
    return this.http.get<Principi>('http://localhost:8094/Principi/PrincipioRandom?jwt='+token);

  }
  




}

