package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x and y to calculate Euclidean distance : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		// math.pow to get the square of the number -user input
		final double p = 2;
		double x1 = Math.pow(x, p);
		double y1 = Math.pow(y, p);
		System.out.println("x1 and y1 are: " + x1 + " and " + y1);
		// adding value of x1 and y1,using math.sqrt to square-root the sum

		double d = x1 + y1;
		double edistance = Math.sqrt(d);
		System.out.println("Eculidean distance is: " + edistance);

	}

}