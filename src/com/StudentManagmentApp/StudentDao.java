package com.StudentManagmentApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
	public static boolean insertStudentToDB(Student st) {
		boolean f = false;

		{
			try {

				// jdbc code
				Connection con = ConnectionProvider.createC();
				String Q = "insert into students(sname,sphone,scity)values(?,?,?)";
				// prepareStatment
				PreparedStatement ps = con.prepareStatement(Q);
				// set the value of parameter
				ps.setString(1, st.getStudentName());
				ps.setString(2, st.getStudentPhone());
				ps.setString(3, st.getStudentCity());
				// execute
				ps.executeUpdate();
				f = true;

			} catch (Exception e) {

			}
			return f;
		}
	}

	public static boolean deleteStudent(int userId) {
		boolean f = false;

		{
			try {

				// jdbc code
				Connection con = ConnectionProvider.createC();
				String Q = "delete from students where sid=?";
				// prepareStatment
				PreparedStatement ps = con.prepareStatement(Q);
				// set the value of parameter
				ps.setInt(1, userId);

				// execute
				ps.executeUpdate();
				f = true;

			} catch (Exception e) {
				e.printStackTrace();

			}
			return f;

		}
	}

	public static void showAll() {
		boolean f = false;

		{
			try {

				// jdbc code
				Connection con = ConnectionProvider.createC();
				String Q = "select * from students;";
				java.sql.Statement stmt = con.createStatement();

				ResultSet set = stmt.executeQuery(Q);

				while (set.next()) {
					int id = set.getInt(1);
					String name = set.getString(2);
					String phone = set.getString(3);
					String city = set.getString("scity");

					System.out.println("Id:" + id);
					System.out.println("Name:" + name);
					System.out.println("Phone Number:" + phone);
					System.out.println("City:" + city);
					System.out.println("----------------------------------------");

				}

			} catch (Exception e) {
				e.printStackTrace();

			}

		}
	}
}
