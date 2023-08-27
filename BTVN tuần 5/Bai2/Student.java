package Bai2;

import java.util.Scanner;

public class Student {
	private String name, class1;
	private double score;
	Faculty y;
	public Student() {
		
	}
	public Student(String name, String class1, double score, Faculty y) {
		this.name = name;
		this.class1 = class1;
		this.score = score;
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClass1() {
		return class1;
	}
	public void setClass1(String class1) {
		this.class1 = class1;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Faculty getY() {
		return y;
	}
	public void setY(Faculty y) {
		this.y = y;
	}
	public void Input(Scanner sc) {
		System.out.print("Nhập tên sinh viên: ");
		name = sc.nextLine();
		System.out.print("Nhập lớp của sinh viên: ");
		class1 = sc.nextLine();
		System.out.print("Nhập điểm của sinh viên: ");
		score = sc.nextDouble();
		sc.nextLine();
		y = new Faculty();
		y.Input(sc);
	}
	public void Output() {
		System.out.println("Tên sinh viên: " + name);
		System.out.println("Lớp của sinh viên: " + class1);
		System.out.println("Điểm của sinh viên: " + score);
		y.Output();
	}
}
