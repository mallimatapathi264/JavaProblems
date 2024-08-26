package ClassProblemsNew;

import java.util.HashMap;
import java.util.Map;

public class WordsToNumber {
    private static final Map<String, Integer> WORDS_MAP = new HashMap<>();

    static {
        WORDS_MAP.put("zero", 0);
        WORDS_MAP.put("one", 1);
        WORDS_MAP.put("two", 2);
        WORDS_MAP.put("three", 3);
        WORDS_MAP.put("four", 4);
        WORDS_MAP.put("five", 5);
        WORDS_MAP.put("six", 6);
        WORDS_MAP.put("seven", 7);
        WORDS_MAP.put("eight", 8);
        WORDS_MAP.put("nine", 9);
        WORDS_MAP.put("ten", 10);
        WORDS_MAP.put("eleven", 11);
        WORDS_MAP.put("twelve", 12);
        WORDS_MAP.put("thirteen", 13);
        WORDS_MAP.put("fourteen", 14);
        WORDS_MAP.put("fifteen", 15);
        WORDS_MAP.put("sixteen", 16);
        WORDS_MAP.put("seventeen", 17);
        WORDS_MAP.put("eighteen", 18);
        WORDS_MAP.put("nineteen", 19);
        WORDS_MAP.put("twenty", 20);
        WORDS_MAP.put("thirty", 30);
        WORDS_MAP.put("forty", 40);
        WORDS_MAP.put("fifty", 50);
        WORDS_MAP.put("sixty", 60);
        WORDS_MAP.put("seventy", 70);
        WORDS_MAP.put("eighty", 80);
        WORDS_MAP.put("ninety", 90);
        WORDS_MAP.put("hundred", 100);
        WORDS_MAP.put("thousand", 1000);
        WORDS_MAP.put("lakh", 100000);
        WORDS_MAP.put("million", 1000000);
        WORDS_MAP.put("crore", 10000000);
    }

    public static int wordsToNumber(String words) {
        String[] tokens = words.toLowerCase().split("\\s+|-");
        int total = 0;
        int currentNumber = 0;

        for (String token : tokens) {
            if (WORDS_MAP.containsKey(token)) {
                int value = WORDS_MAP.get(token);
                
                if (value == 100 || value == 1000 || value == 100000 || value == 1000000 || value == 10000000) {
                    currentNumber *= value;
                } else {
                    currentNumber += value;
                }

                if (value >= 1000) {
                    total += currentNumber;
                    currentNumber = 0;
                }
            }
        }

        total += currentNumber;
        return total;
    }

    public static void main(String[] args) {
        String words = "ninety nine thousand";
        int number = wordsToNumber(words);
        System.out.println("The number is: " + number);
    }
}

