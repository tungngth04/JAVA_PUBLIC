package Bai1;

import java.util.Scanner;

public class Animal {
	protected String name;
	protected Byte age;
	protected Float weight;
	public Animal() {
		
	}
	public Animal(String name, Byte age, Float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
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
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public void input(Scanner sc) {
		System.out.print("Nhập tên: ");
		name = sc.nextLine();
		System.out.print("Nhập tuổi: ");
		age = sc.nextByte();
		System.out.print("Nhập cân nặng: ");
		weight = sc.nextFloat();
		sc.nextLine();
	}
	public void output() {
		System.out.println("Tên: " + name);
		System.out.println("Tuổi: " + age);
		System.out.println("Cân nặng: " + weight);
	}
	public void tiengKeu() {
		System.out.println("Animal sound");

	}
}
