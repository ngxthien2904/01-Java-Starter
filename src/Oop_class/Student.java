package Oop_class;

public class Student {
	// class attributes
	String name; // this.name
	int age; // this.age

	public Student() {

	}

	// Function overloading
	public Student(String name1, int age1) {
		this.name = name1;
		this.age = age1;

	}

	// class method (class function)
	public void learnJava() {
		System.out.println("??");
	}

	// Function overloading
//	public void learnJava(int a) {
//		System.out.println("??");
//	}

	int getAge() {
		return 25;
	}
}
