package Bai3;

import java.util.Scanner;

public class HangHoaDienTu extends HangHoa{
	private int thoiGianBaoHanh;
	private int congSuat;
	public HangHoaDienTu() {
		
	}
	public HangHoaDienTu(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL, int thoiGianBaoHanh, int congSuat) {
		super(maHang,tenHang,soLuong,donGia,dsVL);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public int getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhập thời gian bảo hành: ");
		thoiGianBaoHanh =sc.nextInt();
		System.out.print("Nhập công suất của " + tenHang + ": ");
		congSuat = sc.nextInt();
		sc.nextLine();
		System.out.println("------------------------------------");
	}
	public void xuat() {
		super.xuat();
		System.out.println("Thời gian bảo hành của " + tenHang + ": " + thoiGianBaoHanh);
		System.out.println("Công suất của " + tenHang + ": " + congSuat);
		System.out.println("------------------------------------");
	}
}
