package com.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete2 {

	public static void main(String[] args) throws Exception {
		String name = "Aman";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage", "root", "goodtogo");
		PreparedStatement ps = con.prepareStatement("delete from data where name=?");

		ps.setString(1, name);

		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Data Deleted Successfully.");
		} else {
			System.out.println("Failed");
		}

	}

}
