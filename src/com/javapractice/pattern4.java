package com.javapractice;

public class pattern4 {
	
	public static void main(String[] args) {
		int n=5;
		int st=1;
		int sp=n*2-2;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=st;j++)
		{
			System.out.print("*");
		}
		for(int j=1;j<=sp;j++)
		{
			System.out.print("-");
		}
		for(int j=1;j<=st;j++)
		{
			System.out.print("*");
		}
		sp=sp-2;
		st++;
		System.out.println();
	  }
   }
}
/*public class StarP1 {

public static void main(String[] args) {
	int n=4;
	int l=1;
	int sp=2*n-2;
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=l;j++)
		{
			System.out.print("*");
		}
		for(int j=1;j<=sp;j++)
		{
			System.out.print("-");
		}
		for(int j=1;j<=l;j++)
		{
			System.out.print("*");
		}
		sp=sp-2;
		l++;
		System.out.println();
	}
	
	
}

}*/