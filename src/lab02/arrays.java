package lab02;

import java.util.Arrays;

public class arrays {
	public static void main(String[] args) {
		String[] clubs = { "Mu", "Man", "Liver" };
		clubs[0] = "Ars"; // thay đổi giá trị trong mảng

		String[] a = new String[5];
		a[0] = "1";

		System.out.println("gia tri a[1] la: " + a[1]);

		System.out.println("run here array" + Arrays.toString(clubs)); // hiển thị mảng

		System.out.println("run here array with length " + clubs.length); // chieu dai cua mang

		System.out.println("run here array first element: " + clubs[0]);

		System.out.println("run here array second element: " + clubs[1]);

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (int i = 0; i < cars.length; i++) { // duyệt tất cả phần tử của mảng
			System.out.println(cars[i]);
		}
	}

}
