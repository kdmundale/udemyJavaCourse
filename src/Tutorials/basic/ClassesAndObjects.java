package Tutorials.basic;

public class ClassesAndObjects {
	public static void main(String[] args) {
		
		Person john = new Person("John");
		john.setAge(38);
		Person bob = new Person("Bob");
		bob.setAge(33);
		
		john.sayHelloTo(bob);
		bob.sayHelloTo(john);
		
		System.out.println(john.getName() + " is " + john.getAge() + " years old.");
	}
}
