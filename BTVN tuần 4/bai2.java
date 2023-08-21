import java.util.Scanner;

public class Bai2 {
	private int chieuDai, chieuRong;
	
	public Bai2() {
		
	}
	public Bai2(int chieuDai, int chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhập chiều dài: ");
		chieuDai = sc.nextInt();
		System.out.print("Nhập chiều rộng: ");
		chieuRong = sc.nextInt();
	}
	public void veHCN() {
		for (int i = 0; i < chieuRong; i++) {
			for (int j = 0; j < chieuDai; j++) {
				System.out.print("*");
			}
				System.out.println("");
		}
	}
	public float chuVi() {
		float chuVi = (this.chieuDai + this.chieuRong)*2;
		return chuVi;
	}
	public float dienTich() {
		float dienTich = this.chieuDai*this.chieuRong;
		return dienTich;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bai2 HCN = new Bai2();
		HCN.nhapThongTin(sc);
		System.out.println("Hình vẽ");
		HCN.veHCN();
		System.out.println("Chu vi hình chữ nhật là: " + HCN.chuVi());
		System.out.println("Diện tích hình chữ nhật là: " + HCN.dienTich());
	}
}
