package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Classroom cl = new Classroom();
		System.out.println("Nhập thông tin lớp và sv: ");
		cl.input(sc);
		System.out.print("Nhập tên sv cần tìm: ");
		String name2 = sc.nextLine();
		System.out.println("Thông tin lớp và sv vừa nhập: ");
		cl.output();
		System.out.println("Danh sách sv sau khi tìm kiếm: ");
		ArrayList<Student> tk = cl.searchByName(name2);
		for (Student s : tk) {
			s.output();
		}
	}
}
