package project;

import java.util.Scanner;

public class Console {
	Scanner sc = new Scanner(System.in);
	Translator translator = new Translator();
	
	Console(){
		System.out.println("Welcome to Simplex Calculator!!!\n");
		mainMenu();
	}
	
	//Display the Main Menu
	private void mainMenu() {
		String input;
		boolean exit = false;
		while(!exit) {
			System.out.println("This is the main menu. Choose your option: \n1. Do a calculation.\n2. See the stored value.\n3. Help!\n4. Exit.");
			input = sc.nextLine();
			
			switch(input) {
			case "1": //Main program
				translator.readInput(sc);
				break;
			case "2": //Show stored value
				System.out.println("The stored number is: " + translator.getMemory() + "\n");
				break;
			case "3": //Help menu, explains how the program works
				System.out.println("The Simplex Calculator is made to do some simple arithmetic using natural language! With the proper syntax, you can make a small algorithm to do some simple calculations! Here's how it works: "
						+ "\n\nThere are currently 5 basic operations that you can use, in addition to two logical operations. The 5 basic operations are: ADD, SUBSTRACT, MULTIPLY, DIVIDE and REMAINDER."
						+ "\nAll 5 share the same syntax: OPERATOR NUMBER NUMBER. Using these, the program will take the first number and do the correct operation with the second number. Here's an example:"
						+ "\n\"ADD 5 2\" will add 2 to 5 (5+2), which results to 7!"
						+ "\n\"DIVIDE 12 3\" will divide 12 by 3 (12/3), which results to 4!"
						+ "\nThese 5 operations can also accept a single number. In that case, the program will use the previous result as the first number. Like this:"
						+ "\n\"MULTIPLY 2\" will take our previous result (in our case 4) and multiply it by 2, giving us a result of 8!"
						+ "\n\nOur 2 logical operations are IF and LOOP. These two share a different syntax. Both start with the operator, followed by either < or >, and then a number. This will give us our logical expression."
						+ "\nThey both use our currently saved number (previous result) and verify whether it's smaller (<) or bigger (>) than the given number. You also have to write one of the basic 5 operation to do if the logical expression is true."
						+ "\nThe IF operator will do the basic operation once only if the expression is true. The LOOP operator will do the basic operation multiple times (up to 10) as long as the expression is true. Here are some examples:"
						+ "\n\"IF < 10 ADD 2 3\" since our previous result is 8, it is smaller than 10, so it will do the operation and give us a result of 5."
						+ "\n\"LOOP < 9 ADD 3\" since the result 5 is under 9, it will add 3, which results to 8. Then, since 8 is still smaller than 9, it will add 3 again. Our new result is 11, which is bigger than 9, so it will stop here."
						+ "\nRemember that can use both syntax of the basic operations, with either one or two numbers."
						+ "\nIf the logical expression is never true, it will simply return the previous result."
						+ "\n\nStarting a line with MAIN instead of an operator will bring you back to the main menu."
						+ "\n\nNow go have fun and do some calculations!\n");
				break;
			case "4": //Exit the program
				exit = true;
				break;
			default:
				System.out.println("Not a valid option!");
				break;
			}
		}
	}
}
