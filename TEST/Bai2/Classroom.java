package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
	private int classId;
	private int numberOfStudent;
	ArrayList<Student> listStudent = new ArrayList<>();
	public Classroom() {
		
	}
	public Classroom(int classId, int numberOfStudent, ArrayList<Student> listStudent) {
		this.classId = classId;
		this.numberOfStudent = numberOfStudent;
		this.listStudent = listStudent;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
	public ArrayList<Student> getListStudent() {
		return listStudent;
	}
	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}
	public void input(Scanner sc) {
		System.out.print("Nhập mã lớp: ");
		classId = sc.nextInt();
		System.out.print("Nhập số sv: ");
		numberOfStudent = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numberOfStudent; i++) {
			Student s = new Student();
			System.out.println("Nhập thông tin sv thứ " + (i + 1) + ": ");
			s.input(sc);
			listStudent.add(s);
			System.out.println("---------------------------------------");
		}
	}
	public void output() {
		System.out.println("Mã lớp: " + classId);
		System.out.println("Lớp có: " + numberOfStudent + " sv");
		System.out.println("Danh sách sv vừa nhập: ");
		for (Student s : listStudent) {
			s.output();
			System.out.println("--------------------------------------");
		}
	}
	public ArrayList<Student> searchByName(String name){
		ArrayList<Student> news = new ArrayList<>();
		for (Student s : listStudent) {
			if (s.getName().equals(name)) {
				news.add(s);
			}
		}
		return news;
	}
}
