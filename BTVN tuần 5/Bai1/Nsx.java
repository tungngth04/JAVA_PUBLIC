package Bai1;

import java.util.Scanner;

public class Nsx {
	private String maNSX;
	private String tenNSX;
	private String dcNSX;
	public Nsx() {
		
	}
	public Nsx(String maNSX, String tenNSX, String dcNSX) {
		this.maNSX = maNSX;
		this.tenNSX = tenNSX;
		this.dcNSX = dcNSX;
	}
	public void setMaNSX(String maNSX) {
		this.maNSX = maNSX;
	}
	public String getMaNSX() {
		return maNSX;
	}
	public void setTenNSX(String tenNSX) {
		this.tenNSX = tenNSX;
	}
	public String getTenNSX() {
		return tenNSX;
	}
	public void setDcNSX(String dcNSX) {
		this.dcNSX = dcNSX;
	}
	public String getDcNSX() {
		return dcNSX;
	}
	public void Nhap(Scanner sc) {
		System.out.print("Nhập mã nsx: ");
		maNSX = sc.nextLine();
		System.out.print("Nhập tên nsx: ");
		tenNSX = sc.nextLine();
		System.out.print("Nhập địa chỉ nsx: ");
		dcNSX = sc.nextLine();
	}
	public void xuat() {
		System.out.println("Mã nsx: " + maNSX);
		System.out.println("Tên nsx: " + tenNSX);
		System.out.println("Địa chỉ nsx: " + dcNSX);
	}
}
