package TrungTH;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Chiều dài: ");
		int a = sc.nextInt();
		System.out.print("Chiều rộng: ");
		int b = sc.nextInt();
		sc.close();

		if (a <= b) {
			System.out.println("Nhập sai! Dài phải lớn hơn rộng");
			return;
		} else {
			int cv = (a + b) * 2;
			System.out.println("Chu vi bằng: " + cv);

			int dt = a * b;
			System.out.println("diện tích bằng: " + dt);

			System.out.println("Cạnh nhỏ nhất: " + Math.min(a, b));

		}
		return;

	}
}
