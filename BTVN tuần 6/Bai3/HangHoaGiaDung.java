package Bai3;

import java.util.Scanner;

public class HangHoaGiaDung extends HangHoa{
	private String chucNang;
	public HangHoaGiaDung() {
		
	}
	public HangHoaGiaDung(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL, String chucNang) {
		super(maHang,tenHang,soLuong,donGia,dsVL);
		this.chucNang = chucNang;
	}
	public String getChucNang() {
		return chucNang;
	}
	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Nhập chức năng của " + tenHang + ": ");
		chucNang =sc.nextLine();
		System.out.println("------------------------------------");
	}
	public void xuat() {
		super.xuat();
		System.out.println("Chức năng của " + tenHang + ": " + chucNang);
		System.out.println("------------------------------------");
	}
	
	
}
