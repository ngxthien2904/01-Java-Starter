package hoidanit;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Chiều dài = ");
		float chieuDai = scanner.nextFloat();

		System.out.printf("Chiều rộng = ");
		float chieuRong = scanner.nextFloat();

		System.out.println("Chu vi hình chữ nhật là: " + (chieuDai + chieuRong) * 2);
		System.out.println("Diện tích hình chữ nhật là: " + chieuDai * chieuRong);
		System.out.println("Cạnh nhỏ nhất là: " + Math.min(chieuDai, chieuRong));

		scanner.close();
	}

}
