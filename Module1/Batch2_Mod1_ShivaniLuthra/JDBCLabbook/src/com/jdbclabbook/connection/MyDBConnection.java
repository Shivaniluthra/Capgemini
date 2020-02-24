package com.jdbclabbook.connection;

import java.sql.*;

public class MyDBConnection {
	private static Connection con=null;
	public static Connection connect()  {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		}
		 catch (SQLException e) {
				e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		 }
		return con;
	}
}
