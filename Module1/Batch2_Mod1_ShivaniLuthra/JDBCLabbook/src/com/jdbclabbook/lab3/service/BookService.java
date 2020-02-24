package com.jdbclabbook.lab3.service;

import java.util.List;

import com.jdbclabbook.lab3.bean.Book;

public interface BookService {
	public String addBook(Book b);
	public List<String> bookList(String authorName);
	public String updatePrice(String authorName, double price);

}
