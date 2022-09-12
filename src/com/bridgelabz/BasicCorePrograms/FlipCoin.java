package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times to flip the coin");
		int loopCount = sc.nextInt();
		int heads = 0, tails = 0;
		for (int i = 1; i <= loopCount; i++) {
			if (Math.random() < 0.5) {
				System.out.println("This is tails.");
				tails++;
			} else {

				System.out.println("This is heads.");
				heads++;
			}

		}
		double percentHeads = ((double) heads / loopCount) * 100;
		double percentTails = (double) tails / loopCount * 100;
		System.out.println("Percentage of heads is: " + percentHeads);
		System.out.println("Percentage of tails is: " + percentTails);
	}

}