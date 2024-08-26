package ClassProblemsNew;

import java.util.HashMap;
import java.util.Map;

public class RomaintoNumbers {
    private static final Map<Character, Integer> ROMAN_MAP = new HashMap<>();

    static {
        ROMAN_MAP.put('I', 1);
        ROMAN_MAP.put('V', 5);
        ROMAN_MAP.put('X', 10);
        ROMAN_MAP.put('L', 50);
        ROMAN_MAP.put('C', 100);
        ROMAN_MAP.put('D', 500);
        ROMAN_MAP.put('M', 1000);
    }

    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = ROMAN_MAP.get(s.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        String roman = "XLVI";
        int number = romanToInt(roman);
        System.out.println("The number is: " + number);
    }
}

