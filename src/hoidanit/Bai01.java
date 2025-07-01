package hoidanit;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Tên sinh viên: ");
		String name = scanner.nextLine();

		System.out.printf("Điểm trung bình = ");
		float score = scanner.nextFloat();

		System.out.println(name + " có điểm " + score);
		scanner.close();
	}
}
