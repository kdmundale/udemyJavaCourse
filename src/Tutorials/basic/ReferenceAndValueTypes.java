package Tutorials.basic;

public class ReferenceAndValueTypes {
	
	public static void main(String[] args) {
		
		//byte, short, int, long, float, double, boolean, char
		
		int x = 5;
		addOneTo(x);
		
		System.out.println(x);
		
		Person john;
		john = new Person("john");
		john.setAge(20);
		
		celebrateBirthday(john);
		System.out.println(john.getAge());
		
		
	}
	
	private static void celebrateBirthday(Person person) {
		person.setAge(person.getAge()+1);
		
	}
    //manipulate a copy of the value passed
	static void addOneTo(int number) {
		number = number +1;
	}
}
