package com.jdbclabbook.lab;

import java.sql.*;
import java.util.Scanner;

import com.jdbclabbook.connection.MyDBConnection;

public class Exercise1 {
	static Connection con= MyDBConnection.connect();
	
	public static void main(String[] args) {
		display();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id:");
		int i= sc.nextInt();
		delete(i);
	}
	
	public static void display() {
		try {
			Statement s= con.createStatement();
			ResultSet rs= s.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println("ID= "+rs.getInt(1));
				System.out.println("First name= "+rs.getString(2));
				System.out.println("Last name= "+rs.getString(3));
				System.out.println("Email= "+rs.getString(4));
				System.out.println("Phone= "+rs.getString(5));
				System.out.println("Hire date= "+rs.getString(6));
				System.out.println("Designation= "+rs.getString(7));
				System.out.println("Salary= "+rs.getDouble(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(int id) {
		try {
			PreparedStatement s= con.prepareStatement("delete from employee where id=?");
			s.setInt(1, id);
			int i = s.executeUpdate();
			if(i>0) 
				System.out.println("deletion successful");
			else
				System.out.println("No rows deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
