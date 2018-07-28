package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {

	public static void main(String[] args) {
		Random infinte = new Random();
		// 1. make an array of 5 Strings
		String[] x = { "Franciso", "Judge", "Faith", "Dawson", "Taylor" };
		// 2. print the third element in the array
		System.out.println(x[2]);
		// 3. set the third element to a different value
		x[2] = "Elise";
		// 4. print the third element again
		System.out.println(x[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < x.length; i++) {
			x[i] = "Julius";
		}

		// 6. use a for loop to print all the values in the array
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		// BE SURE TO USE THE ARRAY'S length VARIABLE

		// 7. make an array of 50 integers
		int[] y = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int j = 0; j < y.length; j++) {
			y[j] = infinte.nextInt(3000);
			System.out.println(y[j]);
		}
		

		// 9. without printing the entire array, print only the smallest number on the
		// array
		
		
		// 10 print the entire array to see if step 8 was correct
			
		// 11. print the largest number in the array.

		// 12. print only the last element in the array

	}
}
