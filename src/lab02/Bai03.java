package lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số điện: ");
		int a = scanner.nextInt();

		if (0 <= a && a <= 100) {
			int x = a * 1000;
			System.out.println("Số tiền điện: " + x);
		} else {
			int x = a * 1000 + (a - 100) * 1500;
			System.out.println("Số tiền điện: " + x);
		}

		scanner.close();
	}

}
