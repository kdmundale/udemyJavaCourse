package Tutorials.basic;

public class Loops {
	public static void main(String[] args) {
		
		forLoop();
		
		
	}
	
	static void whileLoop ( ) {
		
		int counter = 0;
		while(counter < 10) {
			counter = counter +1;
			System.out.println(counter);
		}
	}
	
	static void doWhile() {
		int counter = 10;
		
		do{
			counter = counter +1;
		} while (counter < 10);
	}
	
	static void forLoop() {
		
		for(int counter = 0; counter < 10; counter = counter + 1) {
			System.out.println(counter);
		}
		
	}
}
