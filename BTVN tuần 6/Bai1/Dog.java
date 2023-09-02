package Bai1;

import java.util.Scanner;

public class Dog extends Animal{
	private String characted;
	public Dog() {
		
	}
	public Dog(String name, Byte age, Float weight, String characted) {
		super(name,age,weight);
		this.characted = characted;
	}
	public String getCharacted() {
		return characted;
	}
	public void setCharacted(String characted) {
		this.characted = characted;
	}
	public void input(Scanner sc) {
		super.input(sc);
		System.out.print("Nhập tính cách: ");
		characted = sc.nextLine();
	}
	public void output() {
		super.output();
		System.out.println("Tính cách của dog: " + this.characted);
	}
	@Override
	public void tiengKeu() {
		System.out.println("Tiếng kêu: Woof");
	}
}
