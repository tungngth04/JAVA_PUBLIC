package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số sv: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			Student s = new Student();
			System.out.println("Nhập thông tin sv thứ " + (i + 1) + ": ");
			s.input(sc);
			students.add(s);
		}
		
		System.out.println("Thông tin danh sách sv vừa nhập: ");
		System.out.println("");
		for (Student s : students) {
			s.output();
		}
		
	}
}
