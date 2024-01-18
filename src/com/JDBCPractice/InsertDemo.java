package com.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		String name1 = "aqib";
		String email1 = "aqib@799";
		String password1 = "aqib666";
		String gender1 = "male";
		String city1 = "rajasthan";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "goodtogo");
		PreparedStatement ps = con.prepareStatement("insert into register values('" + name1 + "','" + email1 + "','"
				+ password1 + "','" + gender1 + "','" + city1 + "')");
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Data Added Successfully.");
		} else {
			System.out.println("Failed.");
		}
	}

}
