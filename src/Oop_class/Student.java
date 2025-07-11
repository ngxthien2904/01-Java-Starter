package Oop_class;

public class Student {
	// class attributes
	private String name; // this.name
	private int age; // this.age

	public Student() {

	}

	// Function overloading
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() { // get: để lấy giá trị private ánh xạ ra bên ngoài class
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) { // set: để cập nhật lại giá trị private
		this.name = name;
	}

	public void setAge(int age) { // set: để cập nhật lại giá trị private
		this.age = age;
	}
}
