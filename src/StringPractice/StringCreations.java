package StringPractice;

import java.util.stream.Stream;

public class StringCreations {
	  public static void printCharSequence(CharSequence seq) {
	        System.out.println("Character sequence: " + seq.toString());
	    }
	  
	public static void main(String[] args) {
		String s1= new String("abcd");
		String s="abcde";
		StringBuilder s3= new StringBuilder("hleool");
	StringBuilder res= new	StringBuilder(s).reverse();
	System.out.println(res);
 	}

}
