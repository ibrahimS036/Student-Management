package com.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExm1 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "goodtogo");
			System.out.println(connection);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		System.out.println("Class Load Successfully.");
	}

}
