package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng hành hoá gia dụng: ");
		int nGiaDung = sc.nextInt();
		sc.nextLine();
		ArrayList<HangHoaGiaDung> dsGiaDung = new ArrayList<>();
		for (int i = 0; i < nGiaDung; i++) {
			HangHoaGiaDung gd = new HangHoaGiaDung();
			System.out.println("Nhập thông tin hàng hoá thứ " + (i + 1) + ": ");
			gd.nhap(sc);
			dsGiaDung.add(gd);
		}
		
		System.out.print("Nhập số lượng hành hoá điện tử: ");
		int nDienTu = sc.nextInt();
		sc.nextLine();
		ArrayList<HangHoaDienTu> dsDienTu = new ArrayList<>();
		for (int i = 0; i < nDienTu; i++) {
			HangHoaDienTu dt = new HangHoaDienTu();
			System.out.println("Nhập thông tin hàng hoá thứ " + (i + 1) + ": ");
			dt.nhap(sc);
			dsDienTu.add(dt);
		}
		
		System.out.println("Danh sách hàng hoá gia dụng: ");
		for (HangHoaGiaDung gd : dsGiaDung) {
			gd.xuat();
		}
		
		System.out.println("Danh sách hàng hoá điện tử: ");
		for (HangHoaDienTu dt : dsDienTu) {
			dt.xuat();
		}
	}
}
