import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai1 {
	private Map<Integer, Integer> dem = new HashMap<Integer, Integer>();
	
	public Map<Integer, Integer> demSoLanXuatHien(int[] a){
		for (int phanTu : a) {
			if (dem.containsKey(phanTu)) {
				dem.put(phanTu, dem.get(phanTu) + 1);
			}else {
				dem.put(phanTu, 1);
			}
		}
		return dem;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = sc.nextInt();
		int[] a;
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			a[i] = sc.nextInt();
		}
		Bai1 dem = new Bai1();
		System.out.println(dem.demSoLanXuatHien(a));
		
	}
}
