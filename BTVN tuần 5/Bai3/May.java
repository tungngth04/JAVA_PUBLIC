package Bai3;

import java.util.Scanner;

public class May {
	private String maMay, tenMay, tinhTrang;
	public May() {
		
	}
	public May(String maMay, String tenMay, String tinhTrang) {
		this.maMay = maMay;
		this.tenMay = tenMay;
		this.tinhTrang = tinhTrang;
	}
	public String getMaMay() {
		return maMay;
	}
	public void setMaMay(String maMay) {
		this.maMay = maMay;
	}
	public String getTenMay() {
		return tenMay;
	}
	public void setTenMay(String tenMay) {
		this.tenMay = tenMay;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public void Nhap(Scanner sc) {
		System.out.print("Nhập mã máy: ");
		maMay = sc.nextLine();
		System.out.print("Nhập tên máy: ");
		tenMay = sc.nextLine();
		System.out.print("Nhập tình trạng máy: ");
		tinhTrang = sc.nextLine();
	}
	public void Xuat() {
		System.out.println("Mã máy: " + maMay);
		System.out.println("Tên máy: " + tenMay);
		System.out.println("Tình trạng máy: " + tinhTrang);
	}
}
