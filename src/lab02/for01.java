package lab02;

public class for01 {
	public static void main(String[] args) {
		// Vòng lặp for
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("===========");
		// Vòng lặp while
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		System.out.println("===========");
		// Vòng lặp do while
		int k = 0;
		do {
			System.out.println(k);
			k++;
		} while (k < 5);
	}

}
