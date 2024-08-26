package basicproblems;

import java.util.Scanner;

  public class SIngleSpace {
	  public static void main(String[] args) {
	  String s="   i    am    good";
            			
  String res=""; 
 for(int i=0;i<s.length();i++) 
 { 
   char c=s.charAt(i);
   if(c!=' ') res+=c; 
   else 
   { 
	   char c1=s.charAt(i+1); 
	   if(c1!=' ')  res+=c; 
   } 
 }
 System.out.println(res);
	
   }
}
 
		
		
		 