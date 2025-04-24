package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	boolean validEquation = true;
    	double result = 0;
    		
    	double firstNumber = doubleValidation(scanner, "Enter the first number: ");
    		
    	System.out.print("Enter an operator (+, -, *, /, ^): ");
    	char operator = scanner.next().charAt(0);
    	
    	double secondNumber = doubleValidation(scanner, "Enter the second number: ");
    	
    	switch(operator){
    	
    		case '+' -> result = firstNumber + secondNumber;
    		
    		case '-' -> result = firstNumber - secondNumber;
    		
    		case '*' -> result = firstNumber * secondNumber;
    		
    		case '/' -> {
    			if (secondNumber != 0) {result = firstNumber / secondNumber;}
    			else {
    				System.out.println("Cannot divide by 0");
    				validEquation = false;
    				}
    		}
    	
    		case '^' -> result = Math.pow(firstNumber, secondNumber);
    		
    		default -> {
    			System.out.println("Invalid Operator...");
    			validEquation = false;
    			}
    	
    	}
    	
    	if(validEquation) {
    		System.out.println("Answer: " + result);
    	}
    	
    	scanner.close();
    
    }
    
    public static double doubleValidation(Scanner scanner, String prompt) {
    	
    	double userInput = 0;
    	boolean valid = false;
    	
    	while(!valid) {
    		
    		System.out.print(prompt);
    		if (scanner.hasNextDouble()) {
    			userInput = scanner.nextDouble();
    			scanner.nextLine();
    			valid = true;
    		}
    		else {
    			System.out.println("Invalid Input, try again...");
    			System.out.println();
    			scanner.next();
    		}
    		
    	}
    	
    	return userInput;
    	
    }

}
