package StringPractice;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		String s="s2m83j";
		int sum=0;
		Scanner scn= new Scanner(s);
		scn= scn.useDelimiter("");
	for(int i=0;i<s.length();i++)
	{
		char c= s.charAt(i);
		if(Character.isDigit(c))
		{
			sum+=Character.getNumericValue(c);

		}
	}
	System.out.println(sum);
	}

}
