package project;

import java.util.Scanner;

public class Translator {
	Calculator calculator = new Calculator();

	public void readInput(Scanner sc) {
		String input;

		while(true) {
			input = sc.nextLine().toUpperCase();
			if (input.indexOf("MAIN") == 0) break; //Returns to main menu
			
			try {
				toOperation(input);
			} catch(ArithmeticException e) { //Detects all the potential user errors
				System.out.println("division by 0");
			} catch(NumberFormatException e) {
				System.out.println("Number expected!");
			} catch(LibraryException e) {
				System.out.println("Operation not in library!");
			} catch (ParameterException e) {
				System.out.println("Wrong number of parameters");
			} catch (OperatorException e) {
				System.out.println("Wrong operator!");
			} catch (ConditionException e) {
				System.out.println("Wrong condition!");
			}
		}
	}

	//Transform the input into an array to send to our Calculator
	private void toOperation(String input) throws LibraryException, ParameterException, OperatorException, ConditionException {
		String[] inputArray = input.split(" ");
		calculator.verifyOperation(inputArray);
	}
	
	//Returns stored value
	public double getMemory() {
		return calculator.getMemory();
	}
}
