import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("chanh: ");
		int a = sc.nextInt();
		System.out.print("táo: ");
		int b = sc.nextInt();
		System.out.print("lê: ");
		int c = sc.nextInt();
		
		int chanh = 0;
		for (int i = a; i >= 0; i--) {
			if (2*i <= b && 4*i <= c) {
				chanh = i;
				break;
			}
		}
		int sum = chanh + chanh*2 + chanh*4;
		System.out.println("Tổng số quả tối đa: " + sum + " (Chanh: " + chanh +", Táo : " + 2*chanh + ", Lê: " + 4*chanh + ")");
	}
}
