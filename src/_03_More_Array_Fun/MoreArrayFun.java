package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] printstring = { "Uno", "Risk", "Monopoly", "Game of Life", "Cards Against Humanity" };
		MoreArrayFun MAF = new MoreArrayFun();
		MAF.reverseprintallstring(printstring);
		MAF.printallstring(printstring);
		MAF.printotherallstring(printstring);
		MAF.printrandomstring(printstring);
	}

	public void printallstring(String[] printstring) {

		for (int i = 0; i < printstring.length; i++) {
			System.out.println(printstring[i]);
		}
	}

	public void reverseprintallstring(String[] printstring) {

		for (int i = printstring.length - 1; i >= 0; i--) {
			System.out.println(printstring[i]);
		}
	}

	public void printotherallstring(String[] printstring) {

		for (int i = 0; i < printstring.length; i += 2) {
			System.out.println(printstring[i]);
		}
	}

	public void printrandomstring(String[] printstring) {
		
		Random stringorder = new Random();
		ArrayList<String> repeatprintstring = new ArrayList();
		for(int i = 0; i < printstring.length; i++) {
			repeatprintstring.add(printstring[i]);
			
			
		}
		for (int i = 0; i < printstring.length; i++) {
			int rand = stringorder.nextInt(repeatprintstring.size());
			System.out.println(repeatprintstring.get(rand));
			repeatprintstring.remove(rand);
			
		}
		
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

}
