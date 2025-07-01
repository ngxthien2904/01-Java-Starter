package hoidanit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Độ dài 1 cạnh của khối lập phương: ");
		float canh = scanner.nextFloat();

		double TheTich = Math.pow(canh, 3);
		System.out.println("Thể tích của khối lập phương: " + TheTich);

		scanner.close();
	}

}
