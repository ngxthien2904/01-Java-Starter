package hoidanit;

import java.util.Scanner;

public class HelloWolrd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Your name is: ");
		String name = scanner.nextLine();
		System.out.printf("Your age: ");
		int age = scanner.nextInt();
		System.out.println("My name is: " + name + ", age: " + age);
		scanner.close();
	}
}
