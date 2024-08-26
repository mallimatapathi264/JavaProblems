package basicproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ascendingorder {
public static void main(String[] args) {
	String s="ramana";
	/*ArrayList<Character> ts = new ArrayList<>();
	for(int i=0;i<s.length();i++)
	{
		ts.add(s.charAt(i));
	}
	 Collections.sort(ts);
	for(Character s1: ts)
	{
		System.out.println(s1);
	}
}
}   */
	
	String s1="";
	Scanner scn = new Scanner(s);
	scn= scn.useDelimiter("");
	while(scn.hasNext())

{	 
		s1=scn.next()+s1;
		
}
	System.out.println(s1);

	}
}
