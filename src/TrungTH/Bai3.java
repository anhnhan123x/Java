package TrungTH;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cạnh hình lập phương: ");
		int a = sc.nextInt();
		sc.close();

		System.out.println("Thể tích hình lập phương: " + Math.pow(a, 3)); // a mũ 3
	}
}
