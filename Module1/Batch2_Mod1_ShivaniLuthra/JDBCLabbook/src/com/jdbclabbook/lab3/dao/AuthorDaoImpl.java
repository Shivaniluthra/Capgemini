package com.jdbclabbook.lab3.dao;

import java.sql.*;

import com.jdbclabbook.connection.MyDBConnection;
import com.jdbclabbook.lab3.bean.Author;

public class AuthorDaoImpl implements AuthorDao{
	Connection con= MyDBConnection.connect();
	
	@Override
	public String addAuthor(Author a) {
		try {
			PreparedStatement ps= con.prepareStatement("insert into author values(author_is_seq.NEXTVAL,?)");
			ps.setString(1, a.getName());
			int i=ps.executeUpdate();
			if(i>0)
				return "Author inserted successfully";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Not inserted";
	}

}
