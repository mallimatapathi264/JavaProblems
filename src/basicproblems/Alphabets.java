package basicproblems;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet:");
        char c = sc.next().charAt(0);
        String res = "";
   
        if (Character.isLowerCase(c)) 
        {
            res = getCharacters(c, 'z', 5);
            if (res.length() < 5) 
            {
                res += getCharacters('A', 'Z', 5 - res.length());
            }
        } else if (Character.isUpperCase(c)) 
        {
            res = getCharacters(c, 'Z', 5);
            if (res.length() < 5) 
            {
                res += getCharacters('a', 'z', 5 - res.length());
            }
        }
        System.out.println(res);
    }
    public static String getCharacters(char start, char end, int limit) 
    {
        StringBuilder result = new StringBuilder();
        for (char i = start; i <= end && result.length() < limit; i++) 
        {
            result.append(i);
        }
        return result.toString();
    }
}
    
   