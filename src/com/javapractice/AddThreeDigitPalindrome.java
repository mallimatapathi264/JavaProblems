package com.javapractice;

public class AddThreeDigitPalindrome 
{
	public static void isPali(int[] n)
	{	
		for(int i=0;i<n.length;i++)
		{
			int a= n[i];
			int temp=a;
			int rev=0;
			int c=iscount(a);
		if(c>=3)
		{
			while(a>0) {
			int rem= a%10;
			rev= rev*10+rem;
			a/=10;
		}
			int sum=0;
		if(rev==temp)
		{	while(rev>0) {
			
			int r=rev%10;
			sum+=r;
			rev/=10;
		}
		System.out.println(sum);
	  }
	}
  }
}
	public  static int iscount(int i) {
		// TODO Auto-generated method stub
		int c=0;
		while(i>0)
		{
			i/=10;
			c++;
		}
		//System.out.println(c);
		return c;
}
	public static void main(String[] args) {
		int[] n= {413,22,513,525,412,515};//12(525-5+2+5), 11(515=5+1+5)
		isPali(n);
	}

}
