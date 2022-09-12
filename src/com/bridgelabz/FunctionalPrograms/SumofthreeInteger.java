package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;

public class SumofthreeInteger {

	static Scanner s = new Scanner(System.in);

	static void sum0count(int n) {
		// Array and Variable Declaration
		int[] arr = new int[n];
		int count = 0;
		// Taking array input from user
		System.out.println("Enter the values");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		//  Triplet which sum add to zero
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
					}
				}
			}
		}
		System.out.println("Total pairs are " + count);
	}

	public static void main(String[] args) {
		System.out.println("Enter no of inputs");
		int n = s.nextInt();
		sum0count(n);
	}
}