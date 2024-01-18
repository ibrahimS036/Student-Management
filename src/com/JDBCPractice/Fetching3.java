package com.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class Fetching3 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage", "root", "goodtogo");
		PreparedStatement ps = con.prepareStatement("select * from data");
		ResultSet result = ps.executeQuery();
		while (result.next()) {
			String name = result.getString("name");
			System.out.println("Student Name:" + name);

			String email = result.getString("email");
			System.out.println("Student Email:" + email);

			String city = result.getString("city");
			System.out.println("Student City: " + city);
			System.out.println("--------------------------");
		}

	}

}
