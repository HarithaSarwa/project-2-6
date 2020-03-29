package com.java.learning.arithcal;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int a = 0, b = 0, choice = 0;
		float result = 0;
		/* scanner class object to read values */
		Scanner inputvariable = new Scanner(System.in);

		int i = 0;
		while (i == 0) {

			System.out.print("\n1: Addition.\n2: Subtraction.");
			System.out.print("\n3: Multiplication.\n4: Divide.");
			System.out.print("\n5: Remainder.\n6: Exit.\n");

			System.out.print("\nEnter your choice for corresponding number: ");
			choice = inputvariable.nextInt();

			if (choice >= 1 && choice <= 5) {

				System.out.print("Enter first number: ");
				a = inputvariable.nextInt(); //
				System.out.print("Enter second number: ");
				b = inputvariable.nextInt();

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

				}

				System.out.println("Result is: " + result);
			} else if (choice == 6) {
				i = 6;
				System.out.println("\n exit");
			} else
				System.out.println("An Invalid Choice!!!\n");
		}
	}

}
