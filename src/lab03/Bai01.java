package lab03;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		// Viết chương trình nhập vào số nguyên a. Hiển thị kết quả số đấy có phải là số
		// nguyên tố không?
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập vào a = ");
		int a = scanner.nextInt();
		scanner.close();

		if (a < 2) {
			System.out.println("a không là số nguyên tố");
			return;
		}

		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("a là số nguyên tố");
		} else {
			System.out.println("a không là số nguyên tố");
		}
	}
}
