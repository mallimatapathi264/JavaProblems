package com.javapractice;

public class pattern5 {
	public static void main(String[] args) {
		int n=5;
		int st=n;
		int sp=0;
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
			for (int j = 1; j <= st; j++) {
				System.out.print("*");
			}
			st--;
			sp+=2;
			System.out.println();
		}
	}
}
