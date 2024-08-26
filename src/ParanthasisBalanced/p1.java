package ParanthasisBalanced;
import java.util.Scanner;
/*Remove unbalanced parentheses in a given expression.

Example 1:

Input: ((abc)((de))

Output: ((abc)(de))

Example 2:

Input: (a(b)))(c(d)

Output: (a(b))(cd)

Example 3:

Input: (((ab)

Output: (ab)
*/
public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        
        int open = 0, close = 0;

        // Using StringBuilder for efficient string manipulation
        
        StringBuilder sb= new StringBuilder(str);
        // Forward pass to remove invalid closing parentheses
        for (int start = 0; start < len; start++) {
            if (sb.charAt(start) == '(') {
                open++;
            } else if (sb.charAt(start) == ')') {
                open--;
            }

            if (open < 0) {
                sb.setCharAt(start, '\0'); // Mark the character for removal
                open = 0;
            }
        }

        // Backward pass to remove invalid opening parentheses
        for (int end = len - 1; end >= 0; end--) {
            if (sb.charAt(end) == ')') {
                close++;
            } else if (sb.charAt(end) == '(') {
                close--;
            }

            if (close < 0) {
                sb.setCharAt(end, '\0'); // Mark the character for removal
                close = 0;
            }
        }

        // Output the result, skipping marked characters
        for (int ind = 0; ind < sb.length(); ind++) {
            if (sb.charAt(ind) != '\0') {
                System.out.print(sb.charAt(ind));
            }
        }
    }
}
