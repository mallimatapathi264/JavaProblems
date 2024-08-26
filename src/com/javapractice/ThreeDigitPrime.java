package com.javapractice;

public class ThreeDigitPrime 
{
	public static void isPrime(int[] n)
	{
		for(int i=0;i<n.length;i++)
		{
		int a=n[i];
		int c=count(a);
	if(c>=3)
	{
		if(findPrime(a))
		{
			System.out.println(a);
		}	
	}
  }
}
	public static int  count(int n)
	{
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		return c;
	}
	public static boolean findPrime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) 
			return false;
		}
		return true;		
	}

	public static void main(String[] args) {
		int[] a= {1,4,3,4,5,11,23,14,101,102,103,105};//o/p: 101,103
		isPrime(a);
	}
}