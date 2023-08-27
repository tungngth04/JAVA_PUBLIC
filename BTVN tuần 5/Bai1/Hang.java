package Bai1;

import java.util.Scanner;

public class Hang {
	private String maHang, tenHang;
	Nsx x;
	public Hang() {
		
	}
	public Hang(String maHang, String tenHang, Nsx x) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.x = x;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setX(Nsx x) {
		this.x = x;
	}
	public Nsx getX() {
		return x;
	}
	public void Nhap(Scanner sc) {
		System.out.print("Nhập mã hàng: ");
		maHang = sc.nextLine();
		System.out.print("Nhập tên hàng: ");
		tenHang = sc.nextLine();
		x = new Nsx();
		x.Nhap(sc);
	}
	public void xuat() {
		System.out.println("Mã hàng: " + maHang);
		System.out.println("Tên hàng: " + tenHang);
		x.xuat();
	}
}
