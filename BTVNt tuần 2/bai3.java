import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên dương n: ");
		int n = sc.nextInt();
		
		if (n < 2) {
			System.out.println(n + " không là số nguyên tố");
		}else {
			for (int i = 2; i*i < n; i++) {
				if (n % i == 0) {
					System.out.println(n + " không là số nguyên tố");
					return;
				}
			}
			System.out.println(n + " là số nguyên tố");
		}
	}
}
