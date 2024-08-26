package StringPractice;

public class Minoccurance {
	    public static void main(String[] args) {
	        String word = "javaaaraa";
	        findMinOccurrenceCharacter(word);
	    }

	    public static void findMinOccurrenceCharacter(String word) {
	        if (word == null || word.isEmpty()) {
	            System.out.println("The input string is empty or null");
	            return;
	        }

	        int[] charCounts = new int[256]; // Assuming ASCII characters

	        // Count occurrences of each character
	        for (int i = 0; i < word.length(); i++) {
	            charCounts[word.charAt(i)]++;
	        }

	        // Find the minimum occurrence count
	        int minCount = Integer.MAX_VALUE;
	        for (int i = 0; i < charCounts.length; i++) {
	            if (charCounts[i] > 0 && charCounts[i] < minCount) {
	                minCount = charCounts[i];
	            }
	        }

	        // Print all characters with the minimum occurrence count
	        for (int i = 0; i < charCounts.length; i++) {
	            if (charCounts[i] == minCount) {
	                System.out.println("Character with minimum occurrence: " + (char)i);
	                System.out.println("Number of occurrences: " + charCounts[i]);
	            }
	        }
	    }
	}
