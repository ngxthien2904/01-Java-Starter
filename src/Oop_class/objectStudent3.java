package Oop_class;

public class objectStudent3 {
	public static void main(String[] args) {
		Student st1 = new Student();

		Student st2 = new Student("Thien", 24);
		st2.setName("Xuan Thien");
		st2.setAge(25);
		System.out.println("Check obj: " + st2.getName() + " " + st2.getAge());
	}

}
