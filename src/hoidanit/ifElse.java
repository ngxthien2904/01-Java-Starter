package hoidanit;

import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) {
//		Viết chương trình cho phép nhập vào số tiền thuế (đơn vị triệu đồng) và in ra kết quả:
//			- Dưới 10M: Không đóng thuế
//			- 10M - 15M: Thuế 10%
//			- 15M - 30M: Thuế 20%
//			- Trên 30M: Thuế 50%
//		Ví dụ: 25M -> in ra kết quả "thuế 20%"
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhập số tiền thuế: ");
		int tax = scanner.nextInt();

		if (tax < 10) {
			System.out.println("Không đóng thuế");

		} else if (10 <= tax && tax <= 15) {
			System.out.println("Thuế 10%");

		} else if (15 < tax && tax <= 30) {
			System.out.println("Thuế 20%");

		} else {
			System.out.println("Thuế 50%");
		}
		scanner.close();
	}

}
