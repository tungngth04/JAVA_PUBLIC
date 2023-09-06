package Bai2;

import java.util.Scanner;

public class Person {
	protected String name;
	protected int age;
	protected String gender;
	public Person() {
		
	}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void input(Scanner sc) {
		System.out.print("Nhập tên sv: ");
		name = sc.nextLine();
		System.out.print("Nhập tuổi sv: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập giới tính sv: ");
		gender = sc.nextLine();
	}
	public void output() {
		System.out.println("Tên sv: " + name);
		System.out.println("Tuổi sv: " + age);
		System.out.println("Giới tính sv: " + gender);
	}
}
