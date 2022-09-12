package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a, b and c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c)
			System.out.println(a + " is the largest Number");

		else if (b >= a && b >= c)
			System.out.println(b + " is the largest Number");
		else
			System.out.println(c + " is the largest number");
	}
}