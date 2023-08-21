import java.util.Scanner;

public class Bai1 {
	private int nsx;
	private String ms,ts,tg,nxb;
	
	public Bai1() {
		
	}
	public Bai1(String ms, String ts, String tg, String nxb, int nsx) {
		this.ms = ms;
		this.ts = ts;
		this.tg = tg;
		this.nxb = nxb;
		this.nsx = nsx;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public String getTg() {
		return tg;
	}
	public void setTg(String tg) {
		this.tg = tg;
	}
	public String getNxb() {
		return nxb;
	}
	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
	public int getNsx() {
		return nsx;
	}
	public void setNsx(int nsx) {
		this.nsx = nsx;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhập mã sách: "); 
		ms = sc.nextLine();
		System.out.print("Nhập tên sách: ");
		ts = sc.nextLine();
		System.out.print("Nhập tên tác giả: ");
		tg = sc.nextLine();
		System.out.print("Nhập nhà xuất bản: ");
		nxb = sc.nextLine();
		System.out.print("Nhập năm sản xuất: ");
		nsx = sc.nextInt();
	}
	public void hienThongTin() {
		System.out.printf("%-25s%-25s%-25s%-25s%-25d\n",ms,ts,tg,nxb,nsx);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số sách: ");
		int n = sc.nextInt();
		sc.nextLine();
		Bai1[] sachs = new Bai1[n];
		System.out.println("Nhập thông tin");
		for (int i = 0; i < n; i++) {
			Bai1 sach = new Bai1();
			System.out.println("Thông tin sách thứ " + (i + 1) + ": ");
			sach.nhapThongTin(sc);
			sachs[i] = sach;
			sc.nextLine();
		}
		System.out.printf("%-25s%-25s%-25s%-25s%-25s\n","Mã sách","Tên sách","Tác giả","Nhà xuất bản","Năm sản xuất");
		for (int i = 0; i < n; i++) {
			sachs[i].hienThongTin();
		}
	}
}
