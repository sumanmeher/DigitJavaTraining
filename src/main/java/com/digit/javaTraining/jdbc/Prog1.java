package com.digit.javaTraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Prog1 {
	public static Connection con;
	public static Statement stmt;

	public static void main(String[] args) throws Exception {
		try {
			//Step:1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			String url= "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String pwd = "admin@12345";
			
			//Step:2
			con = DriverManager.getConnection(url, user, pwd);
			
			if(con!=null) {
				System.out.println("Connection Established");
				
				//Step:3
				String sql="create table Student(id int,name varchar(60),school varchar(60),fname varchar(60),mname varchar(60),grade varchar(5))";
				
				//Step:4
				stmt=con.createStatement();
				
				//Step:5
				stmt.executeUpdate(sql);
				System.out.println("Table Created");
			}
			else {
				System.out.println("Connection Failed");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			//Step:6
			stmt.close();
			con.close();
		}

	}

}
