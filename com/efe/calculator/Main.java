/**
 * 
 */
package com.efe.calculator;

/**
 * 
 */
import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 * @author efe-inceoglu
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		Calculator calculate = new Calculator();
	
		
		boolean running = true;
		
	while (running) {
		
		System.out.println("Choose an operation (sum, subtraction, multiplication, divide, absval, history and exit):");
		String type = scnr.next();
		
		switch (type) {
		
		case "sum": {
			
			System.out.println("Type the 2 numbers that desired to sum");
			int num1 = scnr.nextInt();
			int num2 = scnr.nextInt();
			System.out.println("Result of summation is: " + calculate.sum(num1, num2));
			
			break;
		}
		case "history":
			calculate.showHistory();
		
			break;
			
		case "subtraction": {
			
			System.out.println("Type the 2 numbers that desired to subtract.");
			int num1 = scnr.nextInt();
			int num2 = scnr.nextInt();
			System.out.println("Result of subtraction is: " + calculate.subtraction(num1, num2));
			
			break;
		}
		case "multiplication": {
			
			System.out.println("Type the 2 numbers that desired to multiply.");
			int num1 = scnr.nextInt();
			int num2 = scnr.nextInt();
			System.out.println("Result of multiplication is: " + calculate.multiplication(num1, num2));
			
			break;
		}
		case "divide": {
			
			System.out.println("Type the 2 numbers that desired to divide.");
			int num1 = scnr.nextInt();
			int num2 = scnr.nextInt();
			
			if (num2 != 0) {
			System.out.println("Result of divide is: " + calculate.divide(num1, num2));
			}
			else {
				System.out.println("Cant divide by zero!");
			}
			break;
		}
		case "absval": {
			
			System.out.println("Type the number that desired to absolute value.");
			int num1 = scnr.nextInt();
			System.out.println("Result of absolute value of num is: " + calculate.absVal(num1));
			
			break;
		}
		
		case "exit":
			running = false;
			break;
		
		default:
			
			System.out.println("Unknown type.");
		}
		
		
	}
		
		
		
		
		scnr.close();
	}

}
