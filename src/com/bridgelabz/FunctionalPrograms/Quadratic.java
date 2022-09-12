package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = input.nextInt();
		System.out.println("Enter the value of b");
		int b = input.nextInt();
		System.out.println("Enter the value of c");
		int c = input.nextInt();
		// Calculating Delta Value
		int delta = b * b - 4 * a * c;
		// Calculating  Root1 & Root2 of X
		if (delta >= 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("The real roots of quadratic equation are " + x1 + " and " + x2);
		} else
			System.out.println("The roots of quadratic equation are Imaginary.");
	}
}