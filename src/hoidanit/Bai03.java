package hoidanit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Độ dài 1 cạnh của khối lập phương: ");
		float canh = scanner.nextFloat();

		System.out.println("Thể tích của khối lập phương: " + Math.pow(canh, 3));

		scanner.close();
	}

}
