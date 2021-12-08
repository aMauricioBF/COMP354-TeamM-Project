package project;

import java.util.Arrays;

public class Calculator {
	private Library library = new Library();
	private double memory = 0; //Saved memory/previous answer

	//Verifies that the operation is valid
	public void verifyOperation(String[] input) throws LibraryException, ParameterException, OperatorException, ConditionException {
		if(library.Contains(input[0])) { //Must be in the library
			if (library.rightParameters(input)) { //Must have the right amount of parameters 

				if(input[0].equals("IF") || input[0].equals("LOOP")) { //Verify 2nd operator
					if(input[3].equals("IF") || input[3].equals("LOOP")) { //2nd operator can't be IF or LOOP
						throw new OperatorException();
					} else {
						String[] subOperation = Arrays.copyOfRange(input, 3, input.length); //2nd part of the input; the basic operation
						if(library.Contains(subOperation[0])) {
							if(library.rightParameters(subOperation)) {
								memory = doOperation(input);
								System.out.println(memory);
							} else {
								throw new ParameterException();
							}
						} else {
							throw new LibraryException();
						}
					}

				} else {
					memory = doOperation(input);
					System.out.println(memory);
				}
			} else {
				throw new ParameterException();
			}
		} else {
			throw new LibraryException();
		}
	}

	//Uses the user input to do the operations
	private double doOperation(String[] input) throws ConditionException {
		switch(input[0]) {
		case "IF": //Does the basic operation if the boolean expression is true
			if (input[1].equals("<")) {

				if (memory <= Double.parseDouble(input[2])) {
					String[] subOperation = Arrays.copyOfRange(input, 3, input.length);
					memory = doOperation(subOperation);
					return memory;
				} else return memory;

			} else if(input[1].equals(">")) {

				if (memory >= Double.parseDouble(input[2])) {
					String[] subOperation = Arrays.copyOfRange(input, 3, input.length);
					memory = doOperation(subOperation);
					return memory;
				} else return memory;

			} else { //Must have < or > as 2nd character
				throw new ConditionException();
			}
		case "LOOP": //Loops and does the basic operation as long as the boolean expression is true
			int iteration = 1;

			if (input[1].equals("<")) {
				String[] subOperation = Arrays.copyOfRange(input, 3, input.length);
				while(memory <= Double.parseDouble(input[2])) {
					memory = doOperation(subOperation);
					System.out.println(memory);
					if (iteration++ >= 10) break;
				}
				return memory;
			} else if(input[1].equals(">")) {
				String[] subOperation = Arrays.copyOfRange(input, 3, input.length);
				while(memory >= Double.parseDouble(input[2])) {
					memory = doOperation(subOperation);
					System.out.println(memory);
					if (iteration++ >= 10) break; //Only allow 10 iterations on the loop.
				}
				return memory;
			} else { //Must have < or > as 2nd character
				throw new ConditionException();
			}
		case "ADD": //Cases below are the basic operations
			if (input.length == 3) {
				System.out.println(Double.parseDouble(input[1]) + " + " + Double.parseDouble(input[2]));
				memory = Double.parseDouble(input[1]) + Double.parseDouble(input[2]);
			} else {
				System.out.println(memory + " + " + Double.parseDouble(input[1]));
				memory = memory + Double.parseDouble(input[1]);
			}
			return memory;
		case "SUBTRACT":
			if (input.length == 3) {
				System.out.println(Double.parseDouble(input[1]) + " - " + Double.parseDouble(input[2]));
				memory = Double.parseDouble(input[1]) - Double.parseDouble(input[2]);
			} else {
				System.out.println(memory + " - " + Double.parseDouble(input[1]));
				memory = memory - Double.parseDouble(input[1]);
			}
			return memory;
		case "MULTIPLY":
			if (input.length == 3) {
				System.out.println(Double.parseDouble(input[1]) + " * " + Double.parseDouble(input[2]));
				memory = Double.parseDouble(input[1]) * Double.parseDouble(input[2]);
			} else {
				System.out.println(memory + " * " + Double.parseDouble(input[1]));
				memory = memory * Double.parseDouble(input[1]);
			}
			return memory;
		case "DIVIDE":
			if (Double.parseDouble(input[input.length-1]) == 0) throw new ArithmeticException(); //Doesn't allow division by 0
			if (input.length == 3) {
				System.out.println(Double.parseDouble(input[1]) + " / " + Double.parseDouble(input[2]));
				memory = Double.parseDouble(input[1]) / Double.parseDouble(input[2]);
			} else {
				System.out.println(memory + " / " + Double.parseDouble(input[1]));
				memory = memory / Double.parseDouble(input[1]);
			}
			return memory;
		case "REMAINDER":
			if (input.length == 3) {
				System.out.println(Double.parseDouble(input[1]) + " % " + Double.parseDouble(input[2]));
				memory = Double.parseDouble(input[1]) % Double.parseDouble(input[2]);
			} else {
				System.out.println(memory + " % " + Double.parseDouble(input[1]));
				memory = memory % Double.parseDouble(input[1]);
			}
			return memory;
		}
		return 0;
	}

	public double getMemory() {
		return memory;
	}
}
