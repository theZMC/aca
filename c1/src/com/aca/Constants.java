package com.aca;

/*
	A program to demonstrate constant variables.
*/

public class Constants {

	public static void main(String[] args) {
		// Constant score values.
		final int TOUCHDOWN		= 6;
		final int CONVERSION	= 1;
		final int FIELDGOAL		= 3;

		// Calculate points scored.
		int td		= 4 * TOUCHDOWN;		// 4 * 6 = 24
		int pat 	= 3 * CONVERSION;		// 3 * 1 = 3
		int fg 		= 2 * FIELDGOAL;		// 2 * 3 = 6
		int total	= ( td + pat + fg);		// 24 + 3 + 6 = 33

		// Output calculated total.
		System.out.println("Score: " + total);
	}
}
