package com.digit.javaTraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Prog4 {
	public static Connection con;
	public static PreparedStatement pstmt;

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
				String sql = "update student set name = ? where id= ?";

				// Step:4
				pstmt = con.prepareStatement(sql);
				Scanner sc = new Scanner(System.in);
				
				
				
				
			}

			// Step:5

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// Step:6
			pstmt.close();
			con.close();
		}

	}

}
