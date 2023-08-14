import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = sc.nextInt();
		int[] a;
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần thứ thứ " + i + ": ");
			a[i] = sc.nextInt();
		}
		System.out.print("Nhập vị trí thêm hoặc xoá: ");
		int vt = sc.nextInt();
		System.out.print("Nhập giá trị phần tử mới: ");
		int giatri = sc.nextInt();
		
		if (vt >= 0 && vt < n) {
			int[] a1;
			a1 = new int[n + 1];
			for (int i = 0; i <= n; i++) {
				if (i < vt) {
					a1[i] = a[i];
				}else if (i == vt) {
					a1[i] = giatri;
				}else {
					a1[i] = a[i - 1];
				}
			}
			System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(a1));
			
			
			 int[] a2 = new int[n - 1];
	            for (int i = 0; i < n - 1; i++) {
	                if (i < vt) {
	                    a2[i] = a[i];
	                } else {
	                    a2[i] = a[i + 1];
	                }
	            }
			System.out.print("Mảng sau khi xoá: " + Arrays.toString(a2));
		}else {
			System.out.println("Vị trí không hợp lệ!");
		}
	}
}
