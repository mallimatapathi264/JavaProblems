package basicproblems;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        // Create a HashSet to store characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        int maxLength = 0;
        int left = 0;

        // Iterate through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If a duplicate character is found, move the left pointer to the right until no duplicates
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character to the set and update the maximum length
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Example string
        String s = "abcabcbb";

        int result = lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}
