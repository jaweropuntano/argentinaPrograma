import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Exeriencia } from './model/exeriencia';

@Injectable({
  providedIn: 'root'
})
export class SExperienciaService {
  expURL = 'https://localhost:8080/explab'

  constructor(private httpClient: HttpClient) { }
  public lista():Observable<Exeriencia[]>{
    return this.httpClient.get<Exeriencia[]>(this.expURL + 'lista');
  }
  public detail(id:number):Observable<Exeriencia>{
    return this.httpClient.get<Exeriencia>(this.expURL + `detail/${id}`);
  }
  public save(exeriencia:Exeriencia):Observable<any>{
    return this.httpClient.post<any>(this.expURL + 'create', exeriencia);
  }
  public update(id:number, exeriencia: Exeriencia):Observable<any>{
    return this.httpClient.put<any>(this.expURL + `update/${id}`, exeriencia);
  }
  public delete(id:number):Observable<any>{
    return this.httpClient.delete<any>(this.expURL + `delete/${id}`);
  }


}
