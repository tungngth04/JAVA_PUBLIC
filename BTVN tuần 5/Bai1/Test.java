package Bai1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hang hang = new Hang();
		System.out.println("Nhập thông tin của mặt hàng:");
		hang.Nhap(sc);
		System.out.println("Thông tin của mặt hàng vừa nhập");
		hang.xuat();
	}
}
