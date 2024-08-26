package com.javapractice;

public class ThreeDigitPalindrome {
	public static void isPali(int[] a){
		
		for(int i=0;i<a.length;i++)
		{
		int c=count(a[i]);
		
		if(c>=3)
		{	int n=a[i];
			int temp=n;
			int rev=0;
			
			while(n>0)
			{
				int rem=n%10;
				rev=rev*10+rem;
				n/=10;
			}
			
			if(rev==temp)
			{
				System.out.println(temp);
			}
		}
	}
}


public static int  count(int a) 
{
		int count=0;
		while(a>0)
		{
			a/=10;
			count++;
		}
		return count;
	  }
	
public static void main(String[] args) {
	int[] a= {1,213,4,212,11,43,33,121};//212,121
	isPali(a);
	}
}
		
