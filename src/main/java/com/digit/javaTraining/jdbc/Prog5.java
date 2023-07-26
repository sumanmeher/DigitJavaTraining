package com.digit.javaTraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prog5 {
	public static Connection con;
	public static Statement stmt;
	public static ResultSet resultSet;

	public static void main(String[] args) throws Exception {
		try {
			// Step:1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");

			String url = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String pwd = "admin@12345";

			// Step:2
			con = DriverManager.getConnection(url, user, pwd);

			if (con != null) {
				System.out.println("Connection Established");

				// Step:3
				String sql = "select * from student";

				// Step:4
				stmt = con.createStatement();
				resultSet = stmt.executeQuery(sql);

				while (resultSet.next() == true) {
					System.out.println(resultSet.getInt("id"));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getString("school"));
					System.out.println(resultSet.getString(4));
					System.out.println(resultSet.getString(5));
					System.out.println(resultSet.getString(6));
					System.out.println("----------");
				}
			}

			// Step:5

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// Step:6
			stmt.close();
			con.close();
		}

	}

}
