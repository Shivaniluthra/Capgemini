package com.jdbclabbook.lab3.service;

import com.jdbclabbook.lab3.bean.Author;
import com.jdbclabbook.lab3.dao.AuthorDao;
import com.jdbclabbook.lab3.dao.AuthorDaoImpl;

public class AuthorServiceImpl implements AuthorService {
	AuthorDao dao= new AuthorDaoImpl();
	
	@Override
	public String addAuthor(Author a) {
		if(a==null)
			return "Cannot create author";
		return dao.addAuthor(a);
	}

}
