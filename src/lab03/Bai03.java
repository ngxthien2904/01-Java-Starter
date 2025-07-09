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
		// Cach 1
//		for (int i = 0; i < numbers.length - 1; i++) {
//			for (int j = i + 1; j < numbers.length; j++) {
//				if (numbers[i] < numbers[j]) {
//					int temp = numbers[i];
//					numbers[i] = numbers[j];
//					numbers[j] = temp;
//				}
//			}
//		}

		// Cach 2
		Arrays.sort(numbers);
		System.out.println("Mảng sau khi sắp xếp là: " + Arrays.toString(numbers));

// - Xuất phần tử có giá trị nhỏ nhất và lớn nhất
		// Cach 1
//		int minNumber = numbers[0];
//		for (int i = 0; i < numbers.length; i++) {
//			if (minNumber > numbers[i]) {
//				minNumber = numbers[i];
//			}
//		}
//		System.out.println("min: " + minNumber);
//
//		int maxNumber = numbers[0];
//		for (int i = 0; i < numbers.length; i++) {
//			if (maxNumber < numbers[i]) {
//				maxNumber = numbers[i];
//			}
//		}
//		System.out.println("max: " + maxNumber);

		// Cach 2:
//		System.out.println("max = " + numbers[numbers.length - 1]);
//		System.out.println("min = " + numbers[0]);

		// Cach 3
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			max = Math.max(max, numbers[i]);
		}
		System.out.println("Max = " + max);

		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			min = Math.min(min, numbers[i]);
		}
		System.out.println("Min = " + min);

	}
}
