package Bai2;

import java.util.Scanner;

public class Person {
	protected String name;
	protected Byte age;
	protected String address;
	protected Date birthDay;
	public Person() {
		
	}
	public Person(String name, Byte age, String address, Date birthDay) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.birthDay = birthDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public void input(Scanner sc) {
		System.out.print("Nhập tên: ");
		name = sc.nextLine();
		System.out.print("Nhập tuổi: ");
		age = sc.nextByte();
		sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		address = sc.nextLine();
		birthDay = new Date();
		System.out.println("Nhập ngày sinh nhật: ");
		birthDay.input(sc);
	}
	public void output() {
		System.out.println("Tên: " + name);
		System.out.println("Tuổi: " + age);
		System.out.println("Địa chỉ: " + address);
		System.out.print("Ngày sinh nhật: ");
		birthDay.output();
	}
}
