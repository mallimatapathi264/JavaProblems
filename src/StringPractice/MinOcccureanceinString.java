package StringPractice;

import java.util.Arrays;

public class MinOcccureanceinString {
    public static void main(String[] args) {
//        String s = "javaavvajik";
//        char[] c = s.toCharArray();
//        int[]  charCount = new int[256]; // Assuming ASCII charset
//
//        // Count occurrences of each character
//        for (int i = 0; i < c.length; i++) {
//            char currentChar = c[i];    // Get the current character
//            int asciiValue = currentChar; // Get the ASCII value of the character
//            charCount[asciiValue]++;    // Increment the count at the ASCII index
//        }
//
//        // Print characters that occur exactly once along with their count
//        for (int i = 0; i < c.length; i++) {
//            char currentChar = c[i];    // Get the current character
//            int asciiValue = currentChar; // Get the ASCII value of the character
//            if (charCount[asciiValue] == 1) {
//                System.out.println(currentChar + " occurs " + charCount[asciiValue] + " time");
//                charCount[asciiValue] = 0; // Set count to 0 to avoid printing the same character again
//            }
//        }
    
    String s="javaavajik";
    char[] c = s.toCharArray();
    Arrays.sort(c);
   int count=0;
    for(int i=0;i<c.length-1;i++)
    {
    	if(c[i]==' ')continue;
    	char c1=c[i];
    	if(c1==c[i+1])
    	{
    		c[i+1]=' ';
    	}
    	else
    	{	count++;
    		System.out.println(c[i]+" "+count);
    		
    	}
    	count=0;
    	
    }
    }
}













