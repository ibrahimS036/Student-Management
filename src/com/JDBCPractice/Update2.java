package com.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update2 {
	public static void main(String[] args) throws Exception {
		String Newname = "Aman";
		String city = "Mumbai";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage", "root", "goodtogo");
		PreparedStatement ps = con.prepareStatement("update data set name=? where city=?");

		ps.setString(1, Newname);
		ps.setString(2, city);

		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Data Updated Successfully.");
		} else {
			System.out.println("Failed.");
		}
	}

}
