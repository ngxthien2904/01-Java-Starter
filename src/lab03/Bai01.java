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
		for (int i = 2; i <= a; i++) {
			if (a % i == 0) {
				System.out.println("Ước số khác:" + i);
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.printf("%d là số nguyên tố", a);
		} else {
			System.out.printf("%d không là số nguyên tố", a);
		}
	}
}
