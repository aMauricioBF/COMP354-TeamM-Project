package project;

enum Operators{ //List of operators
	ADD, SUBSTRACT, MULTIPLY, DIVIDE, REMAINDER, IF, LOOP
}

public class Library {
	
	//Verifies that the operator is included in the library
	public boolean Contains(String operator) {
		for (Operators op : Operators.values()) {
			if (operator.equals(op.toString())) return true;
		}
		return false;
	}
	
	//Verifies the number of parameters
	public boolean rightParameters(String[] input) {
		switch(input[0]) {
		case "IF": //e.g. "IF < 2 ADD 3 5" or "IF < 2 ADD 3" 
			if (input.length == 5 || input.length == 6) return true;
			break;
		case "LOOP": //e.g. "LOOP < 2 ADD 3 5" or "LOOP < 2 ADD 3"
			if (input.length == 5 || input.length == 6) return true;
			break;
		default: //Remaining operators, e.g. "ADD 2 3" or "SUBSTRACT 6 2", etc.
			if(input.length == 2 || input.length == 3) return true;
		}
		return false;
	}

}
