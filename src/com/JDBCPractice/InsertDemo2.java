package com.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo2 {

	public static void main(String[] args) throws Exception {
		String s1 = "naseem";
		String s2 = "naseem@654";
		String s3 = "naseem999";
		String s4 = "male";
		String s5 = "bihar";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "goodtogo");
		PreparedStatement ps = Con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, s1);
		ps.setString(2, s2);
		ps.setString(3, s3);
		ps.setString(4, s4);
		ps.setString(5, s5);

		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Data Added Successfully");
		} else {
			System.out.println("Failed");
		}

	}

}
