package Bai1;

import java.util.Scanner;

public class Cat extends Animal{
	private String color;
	private String preferences;
	private String ownerName;
	public Cat() {
		
	}
	public Cat(String name, Byte age, Float weight, String color, String preferences, String ownerName) {
		super(name,age,weight);
		this.color = color;
		this.preferences = preferences;
		this.ownerName = ownerName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPreferences() {
		return preferences;
	}
	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void input(Scanner sc) {
		super.input(sc);
		System.out.print("Nhập màu: ");
		color = sc.nextLine();
		System.out.print("Nhập sở thích: ");
		preferences = sc.nextLine();
		System.out.print("Nhập tên chủ sở hữu: ");
		ownerName = sc.nextLine();
	}
	public void output() {
		super.output();
		System.out.println("Màu: " + color);
		System.out.println("Sở thích: " + preferences);
		System.out.println("Tên chủ sở hữu: " + ownerName);
	}
	@Override
	public void tiengKeu() {
		 System.out.println("Tiếng kêu: Meow");
	}
}
