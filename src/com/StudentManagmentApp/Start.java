package com.StudentManagmentApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome To Student Managment App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 to ADD  student");
			System.out.println("PRESS 2 to DELETE  student");
			System.out.println("PRESS 3 to DISPLAY  student");
			System.out.println("PRESS 4 to EXIT  student");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				System.out.println("Enter user name :");
				String name = br.readLine();

				System.out.println("Enter user phone :");
				String phone = br.readLine();

				System.out.println("Enter user city :");
				String city = br.readLine();

				Student st = new Student(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer) {
					System.out.println("Student is added successfully...");
				} else {
					System.out.println("Something went Wrong try again...");
				}
				System.out.println(st);

			} else if (c == 2) {
				System.out.println("Enter student id to delete:");
				int uderID = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(uderID);
				if (f) {
					System.out.println("Deleted successfully...");
				} else {
					System.out.println("Something went wrong....!");
				}
			} else if (c == 3) {
				StudentDao.showAll();

			} else if (c == 4) {
				break;
			} else {

			}
		}
		System.out.println("ThankYou for using my application...");
	}

}
