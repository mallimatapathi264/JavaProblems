package StringPractice;
public class TrimandStrip {
    public static void main(String[] args) {
        String s = "\u00A0    hello world     ";

        // Print each character's Unicode value
        for (char c : s.toCharArray()) {
            System.out.print((int) c + " ");
        }
        System.out.println();

        // Using trim() method
        String s2 = s.trim();
        System.out.println("Trimmed: '" + s2 + "'");

        // Using strip() method
        String s1 = s.strip();
        System.out.println("Stripped: '" + s1 + "'");
       
    }
}
