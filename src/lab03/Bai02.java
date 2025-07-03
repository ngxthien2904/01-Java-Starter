package lab03;

import java.util.Scanner;

public class Bai02 {
// Viết ra bảng cửu chương của 1 số nhập vào.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập vào x = ");
		int x = scanner.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.printf("%d x %d = %d \n", x, i, x * i);
		}

		scanner.close();
	}
}
