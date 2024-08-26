package com.javapractice;

public class pattern7 {
	
	public static void main(String[] args) {
		int n = 5;  // Number of rows
		int st = 1; // Initial stars
		int sp = n * 2 - 2; // Initial spaces
		
		// Ascending pattern
		for (int i = 1; i <= n; i++) {
			// Left side stars
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			// Spaces in the middle
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			// Right side stars
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			sp -= 2;
			st++;
			System.out.println();
		}
		
		// Descending pattern
		st = n;  // Reset stars
		sp = 0;  // Reset spaces
		for (int i = 1; i <= n; i++) {
			// Left side stars
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			// Spaces in the middle
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			// Right side stars
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			sp += 2;
			st--;
			System.out.println();
		}
	}
}
