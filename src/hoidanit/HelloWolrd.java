package hoidanit;

import java.util.Scanner;

public class HelloWolrd {

	public static void main(String[] args) {

//		int a = 6;
//		int b = 9;
//		int c = Math.max(a, b);
//		System.out.println("Max = " + c);

		Scanner scanner = new Scanner(System.in);

		System.out.printf("First number = ");
		int firstNumber = scanner.nextInt();

		System.out.printf("Second number = ");
		int secondNumber = scanner.nextInt();

		System.out.println("Min = " + Math.min(firstNumber, secondNumber));

		scanner.close();

	}
}
