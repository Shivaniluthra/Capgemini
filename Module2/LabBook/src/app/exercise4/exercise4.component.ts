import { Component, OnInit } from '@angular/core';
import { Book } from '../model/book';
import { BookService } from '../services/book.service';

@Component({
  selector: 'app-exercise4',
  templateUrl: './exercise4.component.html',
  styleUrls: ['./exercise4.component.css']
})
export class Exercise4Component implements OnInit {
  books: Array<Book>;
  globalSearch;
  
  constructor(private bService: BookService) { }

  ngOnInit(): void {
    this.bService.getBooks()
    .subscribe(res=>{
      this.books= res.map(item=>{
          return new Book(item.id, item.title, item.year, item.author);
      });
    });
  }

}
