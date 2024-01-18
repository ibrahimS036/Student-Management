package com.JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo3 {

	public static void main(String[] args) {
		String s1 = "Nadeem";
		String s2 = "Nadeem@0086";
		String s3 = "Goa";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage", "root",
					"goodtogo");
			PreparedStatement ps = con.prepareStatement("insert into data values(?,?,?)");
			ps.setString(1, s1);
			ps.setString(2, s2);
			ps.setString(3, s3);
			int i = ps.executeUpdate();
			if (i > 0) {
				System.out.println("Data added Successfully.");
			} else {
				System.out.println("Failed.");
			}

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
