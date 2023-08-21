import java.util.Scanner;

public class Bai3 {
	private String msv,hoTen;
	private float diemToan, diemLy, diemHoa;
	
	public Bai3() {
		
	}
	public Bai3(String msv, String hoTen, float diemToan, float diemLy, float diemHoa) {
		this.msv = msv;
		this.hoTen = hoTen;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	public String getMsv() {
		return msv;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(int diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(int diemLy) {
		this.diemLy = diemLy;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhập MSV: ");
		msv = sc.nextLine();
		System.out.print("Nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.print("Nhập điểm toán: ");
		diemToan = sc.nextFloat();
		System.out.print("Nhập điểm lý: ");
		diemLy = sc.nextFloat();
		System.out.print("Nhập điểm hoá: ");
		diemHoa = sc.nextFloat();
	}
	public void xuatThongTin() {
		System.out.printf("%-25s%-25s%-25s%-25s%-25s\n",msv,hoTen,diemToan,diemLy,diemHoa);
	}
	public float diemTB() {
		float diemTB = (this.diemToan + this.diemLy + this.diemHoa)/3;
		return diemTB;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số sinh viên: ");
		int n = sc.nextInt();
		sc.nextLine();
		Bai3[] sinhViens = new Bai3[n];
		for (int i = 0; i < n; i++) {
			Bai3 sinhVien = new Bai3();
			System.out.println("Thông tinh sinh viên thứ " + (i + 1) + ":");
			sinhVien.nhapThongTin(sc);
			sinhViens[i] = sinhVien;
			sc.nextLine();
		}
		System.out.printf("%-25s%-25s%-25s%-25s%-25s\n","Mã sinh viên","Họ tên","Điểm toán","Điểm lý","Điểm hoá");
		for (Bai3 sv : sinhViens) {
			sv.xuatThongTin();
		}
		for (Bai3 sv : sinhViens) {
			System.out.println("Điểm trung bình của sinh viên có mã sinh viên " + sv.getMsv() + " là: " + sv.diemTB());
		}
	}
}
