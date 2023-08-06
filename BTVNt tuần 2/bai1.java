import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên n: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == (n - 1)) {
				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}else {
				System.out.print("*");
				for (int j = 1; j < (n - 1); j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}
}

