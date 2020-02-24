package com.jdbclabbook.lab3.service;

import java.util.List;

import com.jdbclabbook.lab3.bean.Book;
import com.jdbclabbook.lab3.dao.BookDao;
import com.jdbclabbook.lab3.dao.BookDaoImpl;

public class BookServiceImpl implements BookService {
	BookDao dao = new BookDaoImpl();
	
	@Override
	public String addBook(Book b) {
		if(b!=null)
			return dao.addBook(b);
		return "Unable to insert";
	}

	@Override
	public List<String> bookList(String authorName) {
		if(authorName==null)
			System.out.println("Null value");
		return dao.bookList(authorName);
	}

	@Override
	public String updatePrice(String authorName, double price) {
		if(authorName==null || price<1)
			return "Cannot update";
		return dao.updatePrice(authorName, price);
	}

}
