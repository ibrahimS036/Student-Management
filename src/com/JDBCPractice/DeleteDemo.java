package com.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {

	public static void main(String[] args) throws Exception {

		String s = "naseem@654";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "goodtogo");
		PreparedStatement ps = con.prepareStatement("delete from register where email=?");
		ps.setString(1, s);
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Data Deleted Syccessfully.");
		} else {
			System.err.println("Deletion Failed.");
		}
	}

}
