package Bai3;

import java.util.Scanner;

public class PhongMay {
	private String maPhong, tenPhong;
	private double dienTich;
	QuanLy x;
	May[] y;
	private Integer n;
	public PhongMay() {
		
	}
	public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, May[] y, Integer n) {
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.dienTich = dienTich;
		this.x = x;
		this.y = y;
		this.n = n;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public QuanLy getX() {
		return x;
	}
	public void setX(QuanLy x) {
		this.x = x;
	}
	public May[] getY() {
		return y;
	}
	public void setY(May[] y) {
		this.y = y;
	}
	public Integer getN() {
		return n;
	}
	public void setN(Integer n) {
		this.n = n;
	}
	public void Nhap(Scanner sc) {
		System.out.print("Nhập mã phòng: ");
		maPhong = sc.nextLine();
		System.out.print("Nhập tên phòng: ");
		tenPhong = sc.nextLine();
		System.out.print("Nhập diện tích: ");
		dienTich = sc.nextDouble();
		sc.nextLine();
		x = new QuanLy();
		System.out.println("Nhập thông tin quản lý: ");
		x.Nhap(sc);
		System.out.print("Nhập số lượng máy tính: ");
		n = sc.nextInt();
		sc.nextLine();
		y = new May[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin máy thứ " + (i + 1) + ": ");
			y[i] = new May();
			y[i].Nhap(sc);
			System.out.println("-------------------------------");
		}
	}
	public void Xuat() {
		System.out.println("Mã phòng: " + maPhong);
		System.out.println("Tên phòng: " + tenPhong);
		System.out.println("Diện tích của phòng: " + dienTich);
		System.out.println("Thông tin quản lý: ");
		x.Xuat();
		System.out.println("-----------------------------------");
		for (int i = 0; i < n; i++) {
			System.out.println("Thông tin máy thứ " + (i + 1) + ": ");
			y[i].Xuat();
			System.out.println("-------------------------------");
		}
	}
}
