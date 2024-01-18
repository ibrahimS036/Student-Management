package com.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchingDataFromDB {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "goodtogo");
		PreparedStatement ps = con.prepareStatement("select * from register");
		ResultSet result = ps.executeQuery();
		while (result.next()) {
			
			String name1 = result.getString("name");
			System.out.println("Names:" + name1);
			
			String name6 = result.getString("id");
			System.out.println("id:" + name6);

			String name2 = result.getString("email");
			System.out.println("email:" + name2);

			String name3 = result.getString("password");
			System.out.println("Password:" + name3);

			String name4 = result.getString("gender");
			System.out.println("Gender:" + name4);

			String name5 = result.getString("city");
			System.out.println("City:" + name5);
			System.out.println("---------------");
		

		}
	}

}
