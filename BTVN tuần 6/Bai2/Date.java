package Bai2;

import java.util.Scanner;

public class Date {
	private Byte day,month;
	private int year;
	public Date() {
		
	}
	public Date(Byte day, Byte month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Byte getDay() {
		return day;
	}
	public void setDay(Byte day) {
		this.day = day;
	}
	public Byte getMonth() {
		return month;
	}
	public void setMonth(Byte month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void input(Scanner sc) {
		System.out.print("Nhập ngày: ");
		day = sc.nextByte();
		System.out.print("Nhập tháng: ");
		month = sc.nextByte();
		System.out.print("Nhập năm: ");
		year = sc.nextInt();
		sc.nextLine();
	}
	public void output() {
		System.out.println(day + "\\" + month + "\\" + year);
	}
}
