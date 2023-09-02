package Bai3;

import java.util.Scanner;

public class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected float soLuong;
	protected float donGia;
	protected VatLieu[] dsVL;
	public HangHoa() {
		
	}
	public HangHoa(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.dsVL = dsVL;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public float getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public VatLieu[] getDsVL() {
		return dsVL;
	}
	public void setDsVL(VatLieu[] dsVL) {
		this.dsVL = dsVL;
	}
	public void nhap(Scanner sc) {
		System.out.print("Nhập mã hàng: ");
		maHang = sc.nextLine();
		System.out.print("Nhập tên hàng: ");
		tenHang = sc.nextLine();
		System.out.print("Nhập số lượng hàng: ");
		soLuong = sc.nextFloat();
		System.out.print("Nhập đơn giá: ");
		donGia = sc.nextFloat();
		System.out.print("Nhập số lượng vật liệu: ");
		int n = sc.nextInt();
		sc.nextLine();
		dsVL = new VatLieu[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin vật liệu thứ " + (i + 1) + ": ");
			dsVL[i] = new VatLieu();
			dsVL[i].nhap(sc);
		}
	}
	public float tongTien() {
		return this.soLuong*this.donGia;
	}
	public void xuat() {
		System.out.println("Mã hàng: " + maHang);
		System.out.println("Tên hàng: " + tenHang);
		System.out.println("Số lượng: " + soLuong);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Tổng tiền: " + tongTien());
		for (int i = 0; i < dsVL.length; i++) {
			System.out.println("Thông tin vật liệu thứ " + (i + 1) + ": ");
			dsVL[i].xuat();
		}
	}
}
