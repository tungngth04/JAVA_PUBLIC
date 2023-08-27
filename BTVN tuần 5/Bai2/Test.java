package Bai2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số sinh viên: ");
		int n = sc.nextInt();
		sc.nextLine();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ": ");
			Student student1 = new Student();
			student1.Input(sc);
			students[i] = student1;
		}
		for (int i = 0; i < n; i++) {
			students[i].Output();
		}
	}
	
	
}
