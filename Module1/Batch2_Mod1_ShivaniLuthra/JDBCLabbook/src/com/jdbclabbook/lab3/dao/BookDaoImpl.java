package com.jdbclabbook.lab3.dao;

import java.sql.*;
import java.util.*;

import com.jdbclabbook.connection.MyDBConnection;
import com.jdbclabbook.lab3.bean.Book;

public class BookDaoImpl implements BookDao{
	Connection con= MyDBConnection.connect();

	@Override
	public String addBook(Book b) {
		try {
			PreparedStatement ps= con.prepareStatement("insert into Book values(book_isbn_seq.NEXTVAL,?,?)");
			ps.setString(1, b.getTitle());
			ps.setDouble(2, b.getPrice());
			int i= ps.executeUpdate();
			if(i>0)
				return "Book inserted successfully";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Book not inserted";
	}

	@Override
	public List<String> bookList(String authorName) {
		List<String> bookList= new ArrayList<>();
		try {
			PreparedStatement ps= con.prepareStatement("select * from Book,Author where name=?");
			ps.setString(1, authorName);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				bookList.add(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookList;
	}

	@Override
	public String updatePrice(String authorName, double price) {
		try {
			PreparedStatement ps= con.prepareStatement("update Book set price=? where name=?");
			ps.setDouble(1, price);
			ps.setString(2, authorName);
			int i= ps.executeUpdate();
			if(i>0)
				return "Price updated";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Unable to update";
	}
	
	

}
