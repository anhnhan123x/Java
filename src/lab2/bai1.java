package lab2;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ax + b = 0");

		System.out.println("Nhập a: ");
		int a = sc.nextInt();
		System.out.println("Nhập b: ");
		int b = sc.nextInt();
		sc.close();

		if (a == 0 && b == 0) {
			System.out.println("phuong trinh co vo so nghiem!");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem!");
		} else {
			double x = -b / a;
			System.out.println("x = " + x);
		}
		System.exit(0);
	}
}
