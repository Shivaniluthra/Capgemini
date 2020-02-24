package com.jdbclabbook.lab3.dao;

import java.util.List;

import com.jdbclabbook.lab3.bean.Book;

public interface BookDao {
	public String addBook(Book b);
	public List<String> bookList(String authorName);
	public String updatePrice(String authorName, double price);

}
