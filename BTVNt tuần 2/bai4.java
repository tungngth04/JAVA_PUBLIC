import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số a: ");
		int a = sc.nextInt();
		System.out.print("Nhập vào số b: ");
		int b = sc.nextInt();
		System.out.print("Nhập vào số c: ");
		int c = sc.nextInt();
		System.out.println("Phương trình " + a + "x^4 + " + b + "x^2 + " + c + " có nghiệm là:");
		
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô nghiệm");
		}else if (a == 0) {
			double x = (double)-c/b;
			if (x < 0) {
				System.out.println("Phương trình vô nghiệm");
			}else if (x == 0) {
				System.out.println("Phương trình có nghiệm x = 0");
			}else {
				System.out.println("x1 = " + Math.sqrt(x));
				System.out.println("x2 = -" + Math.sqrt(x));
			}
		}else {
			double delta = b*b - 4*a*c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			}else if (delta == 0) {
				double t = (double)-b/(2*a);
				if (t > 0) {
					System.out.println("x1 = " + (Math.sqrt(t)));
					System.out.println(("X2 = -" + (Math.sqrt(t))));
				}else {
					System.out.println("Phương trình vô nghiệm");
				}
			}else {
				double t1 = (double)(-b - Math.sqrt(delta))/(2*a);
				double t2 = (double)(-b + Math.sqrt(delta))/(2*a);
				if (t1 > 0) {
					System.out.println("x1 = " + (Math.sqrt(t1)));
					System.out.println("x2 = -" + (Math.sqrt(t1)));
				}
				if (t2 > 0) {
					System.out.println("x1 = " + (Math.sqrt(t2)));
					System.out.println("x2 = -" + (Math.sqrt(t2)));
				}
				if (t1 < 0 && t2 < 0) {
					System.out.println("Phương trình vô nghiệm");
				}
			}
		}
	}
}
