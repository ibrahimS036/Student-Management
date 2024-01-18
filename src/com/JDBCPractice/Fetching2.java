package com.JDBCPractice;

import java.sql.*;

public class Fetching2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load the driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "goodtogo");
			if (con.isClosed()) {
				System.out.println("Connection is closed:");
			} else {
				System.out.println("Connnction is Created:");
			}

			PreparedStatement ps = con.prepareStatement("select * from register");
			ResultSet result = ps.executeQuery();

			while (result.next()) {
				String s1 = result.getString("city");
				System.out.println("City:" + s1);

				String s2 = result.getString("email");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
