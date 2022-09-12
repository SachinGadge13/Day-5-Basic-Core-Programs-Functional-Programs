package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Power value till the table of 2 has to be printed");
		int N = sc.nextInt();
		int a = 2, count = 1, result = 1;
		if (N > 30)
			N = 30;
		if (N == 0)
			result = 1;
		if (N <= 30) {
			while (count <= N) {
				result = result * a;
				System.out.println(a + " to the power " + count + " is " + result);
				count++;
			}
		}
	}
}