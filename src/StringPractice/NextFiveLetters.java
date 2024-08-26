package StringPractice;

import java.util.Scanner;

public class NextFiveLetters {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        if (!Character.isLetter(letter)) {
            System.out.println("Please enter a valid letter.");
            return;
        }

        for (int i = 1; i <26; i++) {
            char nextLetter = (char) (letter + i);

            if (Character.isUpperCase(letter)) {
                if (nextLetter > 'Z') {
                    nextLetter = (char) ('A' + (nextLetter - 'Z' - 1));
                }
            } else if (Character.isLowerCase(letter)) {
                if (nextLetter > 'z') {
                    nextLetter = (char) ('A' + (nextLetter - 'z' - 1));
                }
            }

            System.out.print(nextLetter);
        }
        System.out.println();
    }
}
