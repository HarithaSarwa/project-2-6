package com.java.learning.arithcal;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * int a=10,b=20,sum; sum = a+b;
		 * 
		 * System.out.println("Addition operation");
		 * System.out.println("Sum of a and b is " +sum);
		 */

		int a, b, choice;
		float result = 0;
		/* scanner class object to read values */
		Scanner inputvariable = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a = inputvariable.nextInt(); //
		System.out.print("Enter second number: ");
		b = inputvariable.nextInt();

		System.out.print("\n1: Addition.\n2: Subtraction.");
		System.out.print("\n3: Multiplication.\n4: Divide.");
		System.out.print("\n5: Remainder.\n6: Exit.");

		System.out.print("\nEnter your choice: ");
		choice = inputvariable.nextInt();

		switch (choice) {
		case 1:
			result = (a + b);
			break;
		case 2:
			result = (a - b);
			break;
		case 3:
			result = (a * b);
			break;
		case 4:
			result = (float) ((float) a / (float) b);
			break;
		case 5:
			result = (a % b);
			break;
		default:
			System.out.println("An Invalid Choice!!!\n");
		}
		if (choice >= 1 && choice <= 5)
			System.out.println("Result is: " + result);

	}

}
