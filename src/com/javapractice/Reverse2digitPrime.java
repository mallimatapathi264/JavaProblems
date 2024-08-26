package com.javapractice;

public class Reverse2digitPrime 
{
	public static void isrevPrime(int[] a)
	{
		for(int i=0;i<a.length;i++) 
		{
			int n=a[i];			
			int c= count(n);
			if(c>1)
			{
				if(findprime(n))
				{
					int res= isrev(n);
			     	{
					System.out.println(res);
					}				
				}
			}
		}
	}
	private static boolean findprime(int n) 
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
		
		}
		return true;
	}
	public static int isrev(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem= n%10;
			rev= rev*10+rem;
			n/=10;
		}
		return rev;
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
	int[] a= {4,5,7,13,24,29,73,23};//o/p=31,92,37, 32 (primes are 13,29,73, 23};
	isrevPrime(a);
	}
}