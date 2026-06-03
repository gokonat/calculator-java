/**
 * 
 */
package com.efe.calculator;

/**
 *  @author efe-inceoglu
 */
public class Calculator {
	
	public int sum(int num1, int num2) {
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
		if (num >= 0) {
			return num;
		}
		else {
			return num * -1;
		}
	}
	public double absVal(double num) {
		if (num >= 0.0) {
			return num;
		}
		else {
			return num * -1;
		}
		
	}
}
