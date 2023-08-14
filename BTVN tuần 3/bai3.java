import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a;
		System.out.print("Nhập vào số lượng mảng: ");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int tg = a[i];
						a[i] = a[j];
						a[j] = tg;
 				}
			}
		}
		System.out.print("Mảng đã sắp xếp là: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
