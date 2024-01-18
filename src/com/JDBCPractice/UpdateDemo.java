package com.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {

	public static void main(String[] args) throws Exception {
		String s1 = "Banglore";
		String s2 = "ubaid@321";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "goodtogo");
		PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
		ps.setString(1, s1);
		ps.setString(2, s2);

		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Correction Done Succesfully.");
		} else {
			System.out.println("Correction Failed.");
		}
	}

}
