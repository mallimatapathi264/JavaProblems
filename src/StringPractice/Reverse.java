package StringPractice;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
		/*
		 * String s = "java is good"; String[] s2 = s.split(" "); // Split the sentence
		 * into words String s1 = ""; // To store the final reversed string
		 * 
		 * for (String re : s2) { // Create a new StringBuilder for each word
		 * StringBuilder sb = new StringBuilder(re);
		 * 
		 * // Reverse the word sb.reverse();
		 * 
		 * // Add the reversed word to the result string, followed by a space s1 +=
		 * sb.toString() + " "; }
		 * 
		 * // Trim the last space and print the result s1 = s1.trim();
		 * System.out.println(s1);
		 */
    	int[] n= {5,1,4,6,3,7,2};
    	int l=4;
    	Arrays.sort(n);
    	System.out.println(n.length);
    
    }
}
