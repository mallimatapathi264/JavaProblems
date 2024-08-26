package basicproblems;

public class ListofPalindromes {
    public static void main(String[] args) {
        String s = "banana";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPali(s, i, j)) {
                    count++;
                    System.out.println(s.substring(i, j + 1));
                }
            }
        }
        System.out.println("Total number of palindromic substrings: " + count);
    }
static boolean isPali(String s, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
