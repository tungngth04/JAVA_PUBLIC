package Bai2;

import java.util.Scanner;

public class Student extends Person{
	private String id,class1,school;
	public Student() {
		
	}
	public Student(String name, Byte age, String address, Date birthDay, String id, String class1, String school) {
		super(name,age,address,birthDay);
		this.id = id;
		this.class1 = class1;
		this.school = school;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClass1() {
		return class1;
	}
	public void setClass1(String class1) {
		this.class1 = class1;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void input(Scanner sc) {
		System.out.print("Nhập id sv: ");
		id = sc.nextLine();
		System.out.print("Nhập lớp sv: ");
		class1 = sc.nextLine();
		System.out.print("Nhập trường sv học: ");
		school = sc.nextLine();
		System.out.println("Nhập thông tin sv: ");
		super.input(sc);
		System.out.println("-------------------------------");
	}
	public void output() {
		System.out.println("Id sv: " + id);
		System.out.println("Lớp sv: " + class1);
		System.out.println("Trường sv học: " + school);
		System.out.println("Thông tin sv: ");
		super.output();
		System.out.println("-------------------------------");
	}
	

}
