package Bai3;

import java.util.Scanner;

public class VatLieu {
	private String ten, mauSac;
	private int doCung;
	public VatLieu() {
		
	}
	public VatLieu(String ten, String mauSac, int doCung) {
		this.ten = ten;
		this.mauSac = mauSac;
		this.doCung = doCung;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public int getDoCung() {
		return doCung;
	}
	public void setDoCung(int doCung) {
		this.doCung = doCung;
	}
	public void nhap(Scanner sc) {
		System.out.print("Nhập tên vật liệu: ");
		ten = sc.nextLine();
		System.out.print("Nhập màu sắc của vật liệu: ");
		mauSac = sc.nextLine();
		System.out.print("Nhập độ cứng của vật liệu: ");
		doCung = sc.nextInt();
		sc.nextLine();
	}
	public void xuat() {
		System.out.println("Vật liệu: " + ten);
		System.out.println("Màu sắc: " + mauSac);
		System.out.println("Độ cứng: " + doCung);
	}
}
