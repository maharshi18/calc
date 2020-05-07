package com.mycompany.app;

import java.util.Scanner;

public class App {
	public static void main(String[] args){
		System.out.println("6 + 3 = " + add(6, 3));
		System.out.println("6 - 3 = " + subtract(6,3));
		System.out.println("6 * 3 = " + multiply(6,3));
		System.out.println("6 / 3 = " + divide(6,3));

		// Scanner reader = new Scanner(System.in);
		// boolean b = true;
		// while(b){
		// 	int result = 0;
		// 	System.out.println("Select which operation you want to make");
		// 	System.out.println("1:Add	2:Subtract	3:Multiply	4:division");
		// 	int op = reader.nextInt();
		// 	int n1=0;
		// 	int n2=0;

		// 	System.out.println("Enter the first number");
		// 	n1 = reader.nextInt();
		// 	System.out.println("Enter the second number");
		// 	n2 = reader.nextInt();
		// 	int ans = 0;
		// 	switch(op){
		// 		case 1:
		// 			ans = add(n1, n2);
		// 			System.out.println(ans);
		// 			break;
		// 		case 2:
		// 			ans = subtract(n1, n2);
		// 			System.out.println(ans);
		// 			break;
		// 		case 3:
		// 			ans = (int)multiply(n1, n2);
		// 			System.out.println(ans);
		// 			break;
		// 		case 4:
		// 			ans = (int)divide(n1, n2);
		// 			System.out.println(ans);
		// 			break;
		// 		default:
		// 			System.out.println("Select appropriate action");
		// 			break;
		// 	}
		// 	System.out.println("Do you want to continue? press 1");
		// 	int k = reader.nextInt();
		// 	if(k != 1){
		// 		b = false;
		// 	}
		// }
		
	}

	public static int add(final int a, final int b) {
		return a + b;
	}
	
	public static int subtract(final int a, final int b) {
		return a - b;
	}

	public static long multiply(final int a, final int b) {
		return a * b;
	}

	public static double divide(final int a, final int b) {
		double result;
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Double.valueOf(a)/Double.valueOf(b);
		}
		return result;
	}
}



