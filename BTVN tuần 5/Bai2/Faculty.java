package Bai2;

import java.sql.Date;
import java.util.Scanner;

public class Faculty {
	private String nameFaculty,day;
	School x;
	public Faculty() {
		
	}
	public Faculty(String nameFaculty, String day, School x) {
		this.nameFaculty = nameFaculty;
		this.day = day;
		this.x = x;
	}
	public String getNameFaculty() {
		return nameFaculty;
	}
	public void setNameFaculty(String nameFaculty) {
		this.nameFaculty = nameFaculty;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public School getX() {
		return x;
	}
	public void setX(School x) {
		this.x = x;
	}
	public void Input(Scanner sc) {
		System.out.print("Nhập tên khoa: ");
		nameFaculty = sc.nextLine();
		System.out.print("Nhập ngày vào khoa: ");
		day = sc.nextLine();
		x = new School();
		System.out.print("Nhập tên trường: ");
		String nameSchool = sc.nextLine();
		System.out.print("Ngày vào trường: ");
		String date = sc.nextLine();
		x.setNameSchool(nameSchool);
		x.setDate(date);
		System.out.println("--------------------------------");
	}
	public void Output() {
		System.out.println("Tên khoa: " + nameFaculty);
		System.out.println("Ngày vào khoa: " + day);
		System.out.println("Tên trường: " + x.getNameSchool());
		System.out.println("Ngày vào trường: " + x.getDate());
		System.out.println("---------------------------------");
	}
}
