import java.util.Scanner;

public class Bai5 {
	public String suaten(String a) {
		String b = "";
		a = a.trim();
		a = a.toLowerCase();
		String[] arr = a.split(" ");
		for (String s : arr) {
			if (!s.equals("")) {
				b += String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1) + " ";
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		Bai5 sua = new Bai5();
		System.out.println("Chuỗi sau khi sửa: " + sua.suaten(a));
	}
}
