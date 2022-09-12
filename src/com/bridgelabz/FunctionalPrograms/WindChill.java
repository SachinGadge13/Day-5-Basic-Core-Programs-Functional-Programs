package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of temperature in Fahrenheit:");
		double t = sc.nextDouble();
		System.out.println("Enter the value of wind speed in miles per hour");
		double v = sc.nextDouble();
		// valid   conditions  
		if (t < 50 && v > 3 && v < 120) {
			// Formula
			double windchill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16));
			System.out.println("Wind chill factor is:" + windchill);
		} else
			System.out.println("Out of range values!");
	}
}