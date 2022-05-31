/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Xi Yulong
 * Student ID: 21018812
 * Class: W64M
 * Date/Time created: Tuesday 31-05-2022 12:43
 */

/**
 * @author 21018812
 *
 */
public class Calculator {
	public int add(int a, int b) {
		int total = a + b;
		if (a >= 0 && a <= 9999 && b >= 0 && b <= 9999) {
			total = a + b;
		}
		return total;
	}
	
	public int subtract(int a, int b) {
		int total = a - b;
		if (a >= 0 && a <= 9999 && b >= 0 && b <= 9999) {
			total = a - b;
		}
		return total;
	}
	
	public int divide(int a, int b) {
		int total = a / b;
		if (b == 0) {
			if (a >= 0 && a <= 9999 && b >= 0 && b <= 9999) {
				total = a / b;
			}
			throw new IllegalArgumentException();
		}
		return total;
	}
	
	public int multiply(int a, int b) {
		int total = a * b;
		if (a >= 0 && a <= 9999 && b >= 0 && b <= 9999) {
			total = a * b;
		}
		return total;
	}
}