package Bai3;

import java.util.Scanner;

public class QuanLy {
	private String maQL, hoTen;
	public QuanLy() {
		
	}
	public QuanLy(String maQL, String hoTen) {
		this.maQL = maQL;
		this.hoTen = hoTen;
	}
	public String getMaQL() {
		return maQL;
	}
	public void setMaQL(String maQL) {
		this.maQL = maQL;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void Nhap(Scanner sc) {
		System.out.print("Nhập mã của quản lý: ");
		maQL = sc.nextLine();
		System.out.print("Nhập họ tên của quản lý: ");
		hoTen = sc.nextLine();
	}
	public void Xuat() {
		System.out.println("Mã của quản lý: " + maQL);
		System.out.println("Họ tên của quản lý: " + hoTen);
	}
}
