package Oop_class;

public class objectStudent {
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Khai báo object và gán giá trị
		Student st1 = new Student(); // Constructor
		st1.name = "Thien";
		st1.age = 24;
		System.out.println("Student: " + st1.name + "\n" + "age: " + st1.age);
	}
}
