package Tutorials.basic;

import java.util.Iterator;

public class Arrays {
	public static void main(String[] args) {
		int x;
		int[] myArray;
		int[] otherArray;
		myArray = new int[50000];
		otherArray = new int[] {1,2,3,4,5,6,7,8,9};
		
		
//		myArray[0]=2;
//		myArray[1]=4;
//		myArray[2]=6;
//		myArray[3]=0;
		
		for(int counter =0; counter <50000; counter++) {
			myArray[counter]= counter;
		}
		
//		System.out.println(myArray[2]);
//		
//		for (int i = 0; i < myArray.length; i++) {
//			System.out.println(myArray[i]);
//		}
		
//		for(int number:myArray){
//			System.out.println(number);
//		}
		
		for(int number:otherArray) {
			System.out.println(number);
		}
	}
}
