import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Book } from '../model/book';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private httpClient: HttpClient) {}

   public getBooks(): Observable<Book[]>{
    const url="assets/booklist.json";
    return this.httpClient.get<Book[]>(url);
   }
   
}
