import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên dương n: ");
		int n = sc.nextInt();
		
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (double)1/i;
		}
		System.out.println("S = " + sum);
		
		int tich = 1;
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			tich *= i;
			tong += tich;
		}
		System.out.println("P = " + tong);
	}
}
