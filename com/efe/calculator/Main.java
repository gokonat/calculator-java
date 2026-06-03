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
		
		Calculator Calculate = new Calculator();
		
		System.out.println("Type the numbers please (2 numbers at a time).");
		int num1 = scnr.nextInt();
		int num2 = scnr.nextInt();
		
		System.out.println("Type the calculation type you want , first digit will be taken for absVal.(sum, subtraction, multiplication, divide and absval).");
		String type = scnr.next();
		
		if (type.equals("sum")) {
			System.out.println("Result of summation is: "+Calculate.sum(num1 , num2));
		}
		else if (type.equals("subtraction")) {
			System.out.println("Result of subtraction is: "+Calculate.subtraction(num1, num2));
		}
		else if (type.equals("multiplication")) {
			System.out.println("Result of multiplication is: "+Calculate.multiplication(num1, num2));
		}
		else if  (type.equals("divide")) {
			System.out.println("Result of divide is: "+Calculate.divide(num1, num2));
		}
		else if (type.equals("absval")) {
			System.out.println("Result of absolute value of num is: "+Calculate.absVal(num1));
		}
		else {
			System.out.println("Unknown type");
		}
		
		
		
		
		
		
		
		scnr.close();
	}

}
