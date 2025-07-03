package lab02;

import java.util.Scanner;

public class Bai04 {

	public static void giaiPhuongTrinhBacNhat() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a = ");
		int a = scanner.nextInt();

		System.out.print("b = ");
		int b = scanner.nextInt();

		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm x = %.3f", x);
		}
		scanner.close();
	}

	public static void giaiPhuongTrinhBacHai() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a = ");
		int a = scanner.nextInt();

		System.out.print("b = ");
		int b = scanner.nextInt();

		System.out.print("c = ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0) {
			giaiPhuongTrinhBacNhat();
		} else {
			int delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phương trình có nghiệm kép x = %.3f ", x);
			} else {
				double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
				double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
				System.out.printf("Phương trình có 2 nghiệm là x1 = %.3f và x2 = %.3f", x1, x2);
			}

		}

		scanner.close();

	}

	public static void tinhTienDien() {
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(">>      LỰA CHỌN TÍNH NĂNG     <<");
		System.out.println("++ --------------------------- ++");
		System.out.println("| 1. GIẢI PHƯƠNG TRÌNH BẬC NHẤT |");
		System.out.println("| 2. GIẢI PHƯƠNG TRÌNH BẬC HAI  |");
		System.out.println("| 3. TÍNH SỐ ĐIỆN               |");
		System.out.println("| 4. KẾT THÚC                   |");
		System.out.println("++ --------------------------- ++");

		System.out.printf("Nhập lựa chọn: ");
		int t = scanner.nextInt();

		switch (t) {
		case 1:
			System.out.println("Giải phương trình bậc nhất");
			giaiPhuongTrinhBacNhat();
			break;
		case 2:
			System.out.println("Giải phương trình bậc hai");
			giaiPhuongTrinhBacHai();
			break;
		case 3:
			System.out.println("Tính tiền điện");
			tinhTienDien();
			break;
		default:
			System.out.println("Đã thoát chương trình");
			System.exit(0);
		}

//		if (t == 1) {
//			System.out.println("Giải phương trình bậc nhất");
//
//			System.out.print("a = ");
//			int a = scanner.nextInt();
//			System.out.print("b = ");
//			int b = scanner.nextInt();
//
//			giaiPhuongTrinhBacNhat(a, b);
//		} else if (t == 2) {
//			System.out.println("Giải phương trình bậc hai");
//
//			System.out.print("a = ");
//			int a = scanner.nextInt();
//
//			System.out.print("b = ");
//			int b = scanner.nextInt();
//
//			System.out.print("c = ");
//			int c = scanner.nextInt();
//
//			giaiPhuongTrinhBacHai(a, b, c);
//		} else if (t == 3) {
//			System.out.println("Tính tiền điện");
//
//			System.out.print("Nhập số điện: ");
//			int a = scanner.nextInt();
//
//			tinhTienDien(a);
//		} else {
//			System.out.println("Kết thúc");
//		}
		scanner.close();
	}

}
