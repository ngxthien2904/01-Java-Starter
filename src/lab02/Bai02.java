package lab02;

import java.util.Scanner;

public class Bai02 {
	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phương trình có nghiệm x = %.3f", x);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a = ");
		int a = scanner.nextInt();

		System.out.print("b = ");
		int b = scanner.nextInt();

		System.out.print("c = ");
		int c = scanner.nextInt();

		System.out.printf("Giải phương trình bậc hai %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0) {
//			if (b == 0 && c == 0) {
//				System.out.println("Phương trình vô số nghiệm");
//			} else if (b == 0 && c != 0) {
//				System.out.println("Phương trình vô nghiệm");
//			} else {
//				float x = (float) -c / b;
//				System.out.printf("Phương trình có nghiệm %.3f", x);
//			}
			giaiPhuongTrinhBacNhat(b, c);
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

}
