package ClassProblemsNew;
import java.util.Scanner;
public class RevFirstHalfString {
	public static void main(String[] args) {
		String s="java";
		Scanner scn= new Scanner(s);
		scn= scn.useDelimiter("");
		int count=0;
		String f="";
		String l="";
		while(scn.hasNext())
		{
			scn.next();
			count++;
		}
		//Resetting the Scanner:
		//After counting the characters, the scanner has reached the end of the string.
		//We need to reset the scanner to start from the beginning again to process the string.
		//This is done by reinitializing the scn object with new Scanner(s) and setting the delimiter again.
		 scn = new Scanner(s); 
	        scn.useDelimiter("");
		
		for(int i=0;i<count/2;i++)
		{
			f=scn.next()+f;
		}
		for(int i=count/2;i<count;i++)
		{
			l= l+scn.next();
		}
		//String finalResult=;
		System.out.println(f+l);
	}
}
