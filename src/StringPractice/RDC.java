package StringPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RDC {
	    public static void main(String[] args) {
	        String s = "javaaaaa";
	        findMinOccurrenceCharacters(s);
	    }

	    public static void findMinOccurrenceCharacters(String s) {
	        if (s == null || s.isEmpty()) {
	            System.out.println("The input string is empty or null");
	            return;
	        }

	        // Use a HashMap to count occurrences of each character
	        Map<Character, Integer> map = new HashMap<>();
	        for (char c : s.toCharArray()) {
	           map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        // Find the minimum occurrence count
	        int minCount = Integer.MAX_VALUE;
	        for (int count : map.values()) {
	            if (count < minCount) {
	                minCount = count;
	            }
	        }

	        // Collect all characters with the minimum occurrence count
	        List<Character> minChars = new ArrayList<>();
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            if (entry.getValue() == minCount) {
	                minChars.add(entry.getKey());
	            }
	        }

	        // Print the result
	        System.out.println("Characters with minimum occurrence: " + minChars);
	        System.out.println("Number of occurrences: " + minCount);
	    }
	}

