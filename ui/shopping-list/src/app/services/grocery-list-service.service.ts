import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { GroceryList } from '../models/grocery-list';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GroceryListService {

  constructor(private http: HttpClient) { } 

  
  getAll(): Observable<GroceryList[]> {
    return this.http.get<GroceryList[]>(environment.url);
  }

  getById(id: number): Observable<GroceryList> {
    return this.http.get(environment.url + '/' + id);
  }
}
