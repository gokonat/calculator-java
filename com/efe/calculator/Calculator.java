/**
 * 
 */
package com.efe.calculator;

/**
 *  @author efe-inceoglu
 */
import java.util.ArrayList;

public class Calculator {
	
	private ArrayList<String> history = new ArrayList<>();
	
	public int sum(int num1, int num2) {
		history.add(num1 + " + " + num2 + "=" + (num1 + num2));
		return num1 + num2;
	}
	
	public double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	public int subtraction(int num1,int num2) {
		return num1 - num2;
	}
	
	public double subtraction(double num1, double num2) {
		return num1 - num2;
	}
	
	public int multiplication(int num1,int num2) {
		return num1 * num2;
	}
	
	public double multiplication(double num1 , double num2) {
		return num1 * num2;
	}
	
	public int divide(int num1,int num2) {
		return num1 / num2;
	}
	
	public double divide(double num1, double num2) {
		return num1 / num2;
	}
	
	public int absVal(int num) {
		return Math.abs(num);
	}
	
	public double absVal(double num) {
		return Math.abs(num);
		}
	
	public void showHistory() {
		System.out.println("Calculation History");
		for (String item : history) {
		System.out.println(item);
		}
	}
	
}
