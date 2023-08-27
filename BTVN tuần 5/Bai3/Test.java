package Bai3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhongMay phongMay = new PhongMay();
		System.out.println("Nhập thông tin phòng máy: ");
		phongMay.Nhap(sc);
		System.out.println("Thông tin phòng máy vừa nhập: ");
		phongMay.Xuat();
	}
}
