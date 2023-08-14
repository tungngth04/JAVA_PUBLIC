import java.util.Scanner;

public class Bai4 {
	public static boolean kiemtradoixung(String chuoi) {
		int len = chuoi.length();
		for (int i = 0; i < len; i++) {
			if (chuoi.charAt(i) != chuoi.charAt(len - 1 -i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chuỗi: ");
		String chuoi = sc.nextLine();
		if (kiemtradoixung(chuoi) == true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
