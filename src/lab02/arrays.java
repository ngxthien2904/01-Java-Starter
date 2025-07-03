package lab02;

import java.util.Arrays;

public class arrays {
	public static void main(String[] args) {
		int[] clubs = { 29, 0, 4, 2, 1, 9 };

		System.out.println(Arrays.toString(clubs)); // hiển thị mảng

		// Sắp xếp thủ công
		for (int i = 0; i < clubs.length - 1; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] < clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(clubs));

//		Arrays.sort(clubs); // method sắp xếp
//		System.out.println("run here array" + Arrays.toString(clubs));
	}

}
