package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	boolean validEquation = true;
    	double result = 0;
    		
    	System.out.print("Enter the first number: ");
    	double firstNumber = scanner.nextDouble();
    		
    	System.out.print("Enter an operator (+, -, *, /, ^): ");
    	char operator = scanner.next().charAt(0);
    	
    	System.out.print("Enter the second number: ");
    	double secondNumber = scanner.nextDouble();
    	
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

}