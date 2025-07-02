package hoidanit;

import java.util.Scanner;

public class switch01 {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++--------------------++");
		System.out.println("| 1. Cộng              |");
		System.out.println("| 2. Trừ               |");
		System.out.println("| 3. Kết thúc          |");
		System.out.println("++--------------------++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là: ");

		int value = scanner.nextInt();

		switch (value) {
		case 1:
			System.out.println("Bạn đã chọn phép cộng");
			break;
		case 2:
			System.out.println("Bạn đã chọn phép trừ");
			break;
		default:
			System.out.println("Bạn đã thoát chương trình");
			System.exit(0);
		}
		scanner.close();
	}

}
