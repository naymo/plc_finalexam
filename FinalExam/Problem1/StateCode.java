package FinalExam_Code;

public class StateCode {
	
	public static void main(String[] args) {
		parser("lowToHigh");
		parser("\"Here is my string\"");
		parser("5000");
		parser("10.7E45");
		parser("5001f");
		parser("42.00");
	}
	
	public static void parser(String input) {
		char[] spread = new char[input.length()];
		//check the first char to see what it is
		int switchCase = -1;
		boolean isVariable = false;
		boolean isString = false;
		if(Character.isLetter(input.charAt(0))) {
			isVariable = true;
			switchCase = 1;
		}
		
		if(input.charAt(0) == '\"') {
			switchCase = 2;
		}
		
		if(Character.isDigit(input.charAt(1))) {
			switchCase = 3;
		}
		
		switch(switchCase) {
		case 1:
			System.out.println("Is a variable");
			for(int i = 0; i < input.length(); i++) {
				spread[i] = input.charAt(i);
			}
			System.out.println(new String(spread));
			break;
		case 2:
			System.out.println("Its a string");
			for(int i = 0; i < input.length(); i++) {
				if(i == input.length() - 1 && input.charAt(i) != '\"') {
					error(input, "String", "No quotes to close");				
				}
				spread[i] = input.charAt(i);
			}
		case 3:
			int i = 0;
			if(!input.matches("[0-9]+")) {
				while(i < input.length()) {
					spread[i] = input.charAt(i);
					if((input.charAt(i) == '.') && (i == input.length() - 1)) {
						error(input, "float", "Ending in decimal is not allowed");
					}
					if(Character.isLetter(input.charAt(i)) && ((input.charAt(i) != 'E')  && (input.charAt(i) != 'f'))) {
						error(input, "float", "Invalid character - " + input.charAt(i));
					}
					if((input.charAt(i) == 'E')  && (i == (input.length() - 1))) {
						error(input, "float", "Cannot end with E");
					}
					if((input.charAt(i) == 'f') && !(i == (input.length() - 1))) {
						error(input, "float", "f is not placed at the end of this float");
					}
					i++;
				}
				if(i == input.length()) {
					System.out.println(new String(spread) + "is a floating-point");
				}
			}

			else {
				while(i < input.length()) {
					spread[i] = input.charAt(i);
					i++;
				}
				System.out.println(new String(spread) + " is an int");
			}
			
			break;
		default:
			System.out.println("Invalid input");
		}
	}
	
	public static void error(String input, String type, String info) {
		System.out.println("There was an error with " + input + "." + "It is not correctly formatted for " + type + "." + "Info: " + info);
	}

}
