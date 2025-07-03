package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai03 {
// Viết phương trình nhập vào 1 mảng số nguyên bất kỳ.
// - Sắp xếp và xuất mảng vừa nhập ra màn hình
// - Xuất phần tử có giá trị nhỏ nhất và lớn nhất
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số phần tử trong mảng: ");
		int a = scanner.nextInt();
		int[] numbers = new int[a];

		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Nhập phần tử %d của mảng: ", i);
			numbers[i] = scanner.nextInt();
		}
		System.out.println("Mảng đã nhập là: " + Arrays.toString(numbers));

// - Sắp xếp các phần tử
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println("Mảng sau khi sắp xếp là: " + Arrays.toString(numbers));

// - Xuất phần tử có giá trị nhỏ nhất và lớn nhất
		int minNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (minNumber > numbers[i]) {
				minNumber = numbers[i];
			}
		}
		System.out.println("min: " + minNumber);

		int maxNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (maxNumber < numbers[i]) {
				maxNumber = numbers[i];
			}
		}
		System.out.println("max: " + maxNumber);

	}
}
