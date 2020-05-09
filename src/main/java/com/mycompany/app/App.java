package com.mycompany.app;

import java.util.Scanner;

public class App {
	public static void main(String[] args){
		System.out.println("10 + 29 = " + add(10, 29));
		// System.out.println("10 - 29 = " + subtract(10,29));
		// System.out.println("10 * 29 = " + (int)multiply(10,29));
		// System.out.println("10 / 29 = " + (int)divide(10,29));

			}

	public static int add(final int a, final int b) {
		return a + b;
	}
	
	// public static int subtract(final int a, final int b) {
	// 	return a - b;
	// }

	// public static long multiply(final int a, final int b) {
	// 	return a * b;
	// }

	// public static double divide(final int a, final int b) {
	// 	double result;
	// 	if (b == 0) {
	// 		throw new IllegalArgumentException("Divisor cannot divide by zero");
	// 	} else {
	// 		result = Double.valueOf(a)/Double.valueOf(b);
	// 	}
	// 	return result;
	// }
}



