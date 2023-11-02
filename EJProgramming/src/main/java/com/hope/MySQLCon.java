package com.hope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.oracle.wls.shaded.org.apache.regexp.recompile;

//Class which establishes a connection to the database
public class MySQLCon {
	
	
	//Connection to the database is established for admin login
	//using their username and password
	//The information associated with the account is found using SQL
	public int adminLogin(String username, String password) {
		int user_row_count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb", "root", null);
			Statement stmt = con.createStatement();
			String sql = "SELECT COUNT(*) AS adminUserCount FROM adminUsers where username = '" + username + "' AND pass = '" + password + "'";
			System.out.println(sql);
			ResultSet r = stmt.executeQuery(sql);
			r.next();
			user_row_count = r.getInt("adminUserCount");
			r.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return user_row_count;
	}
	
	//Connection to the database is established for student login
	//using their username and password
	//The information associated with the account is found using SQL
	public int studentLogin(String username, String password) {
		int user_row_count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb", "root", null);
			Statement stmt = con.createStatement();
			String sql = "SELECT COUNT(*) AS studentUserCount FROM studentUsers where username = '" + username + "' AND pass = '" + password + "'";
			System.out.println(sql);
			ResultSet r = stmt.executeQuery(sql);
			r.next();
			user_row_count = r.getInt("studentUserCount");
			r.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return user_row_count;
	}
	
	//Connection to the database is established for instructor login
	//using their username and password
	//The information associated with the account is found using SQL
	public int instructorLogin(String username, String password) {
		int user_row_count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb", "root", null);
			Statement stmt = con.createStatement();
			String sql = "SELECT COUNT(*) AS instructorUserCount FROM instructorUsers where username = '" + username + "' AND pass = '" + password + "'";
			System.out.println(sql);
			ResultSet r = stmt.executeQuery(sql);
			r.next();
			user_row_count = r.getInt("instructorUserCount");
			r.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return user_row_count;
	}
	
	//Connection to the database is established for student course registration
	//using the courseName and courseId
	//The information associated with the account is found using SQL
	public void studentCourseRegister(String courseName, int courseId) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb", "root", null);
			Statement stmt = con.createStatement();
			String qlString = "UPDATE STUDENT SET STUDENT_COURSE = '" + courseName + "'";
			System.out.println(qlString);
			ResultSet r = stmt.executeQuery(qlString);
			r.next();
			r.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
