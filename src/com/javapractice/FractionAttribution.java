package com.javapractice;

public class FractionAttribution {
	    /**
	     * Evaluates a fraction addition expression.
	     * @param expression The expression to evaluate, e.g., "-1/2+1/2+1/3".
	     * @return The result of the fraction addition in the form of a string, e.g., "1/3".
	     */
	    public String fractionAddition(String expression) {
	        // Variables to store the cumulative numerator and denominator
	        int num = 0; // Cumulative numerator
	        int denom = 1; // Cumulative denominator

	        // Split the expression into fractions using '/' and signs as delimiters
	        String[] nums = expression.split("/|(?=[+-])");
	        
	        // Iterate through the parts of the fraction expression
	        for (int i = 0; i < nums.length; i += 2) 
	        {
	        
	           int currNum = Integer.parseInt(nums[i]); // Current fraction's numerator
	            int currDenom = Integer.parseInt(nums[i + 1]); // Current fraction's denominator

	            // Compute the new numerator and denominator using cross multiplication
	            num = num * currDenom + currNum * denom;
	            denom *= currDenom;
	        }

	        // Compute the greatest common divisor (GCD) to simplify the fraction
	        int gcd = Math.abs(gcd(num, denom));

	        // Simplify the fraction by dividing both the numerator and denominator by the GCD
	        num /= gcd;
	        denom /= gcd;

	        // Return the result as a string in the format "numerator/denominator"
	        return num + "/" + denom;
	    }

	    /**
	     * Computes the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
	     * @param a First integer
	     * @param b Second integer
	     * @return The GCD of the two integers
	     */
	    private int gcd(int a, int b) {
	        return b == 0 ? a : gcd(b, a % b);
	    }

	    // Main method to test the fraction addition function
	    public static void main(String[] args) {
	    	FractionAttribution solution = new FractionAttribution();

	        // Test cases
	        String expression1 = "-1/2+1/2+1/3";
	        String expression2 = "1/3-1/2";
	        String expression3 = "-1/2+1/2";
	        String expression4 = "5/3+1/3";
	        solution.fractionAddition(expression1);
	        // Output results
	        //System.out.println("Result of expression1: " + solution.fractionAddition(expression1)); // Expected output: "1/3"
	        //System.out.println("Result of expression2: " + solution.fractionAddition(expression2)); // Expected output: "-1/6"
	        //System.out.println("Result of expression3: " + solution.fractionAddition(expression3)); // Expected output: "0/1"
	        //System.out.println("Result of expression4: " + solution.fractionAddition(expression4)); // Expected output: "2/1"
	    }
	}

