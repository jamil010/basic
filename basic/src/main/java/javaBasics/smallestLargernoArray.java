package javaBasics;

public class smallestLargernoArray {

	public static void main(String[] args) {
   
		
		int numbers[]  = {40,2,20 ,34,65,74,21,13,9,67,80,5};
		System.out.println(numbers.length);
		
		int smallest = numbers[0];
		int largest = numbers [0];
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] < smallest) smallest = numbers[i];
			if(numbers[i] > largest)  largest = numbers[i];
		}
		System.out.println("the smaller no is " +smallest);
		System.out.println("the larger no is "+ largest);
			
		}
		
		
	}


