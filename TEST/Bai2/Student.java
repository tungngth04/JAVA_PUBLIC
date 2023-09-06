package Bai2;

import java.util.Scanner;

public class Student extends Person{
	private int id;
	Address address;
	private double gpa;
	public Student() {
		
	}
	public Student(String name, int age, String gender, int id, Address address, double gpa) {
		super(name,age,gender);
		this.id = id;
		this.address = address;
		this.gpa = gpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public void input(Scanner sc) {
		super.input(sc);
		System.out.print("Nhập id sv: ");
		id = sc.nextInt();
		sc.nextLine();
		address = new Address();
		System.out.println("Nhập thông tin địa chỉ sv: ");
		address.input(sc);
		System.out.print("Nhập gpa sv: ");
		gpa = sc.nextDouble();
		sc.nextLine();
	}
	public void output() {
		super.output();
		System.out.println("ID sv: " + id);
		System.out.println("Thông tin sv vừa nhập: ");
		address.output();
		System.out.println("GPA sv: " + gpa);
	}
}
