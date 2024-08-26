package com.javapractice;

public class Ptattern1 {
	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++) {
			if(i%2!=0)
			{
				int k= (i-1)*num+1;
				for(int j=1;j<=num;j++)
				{
					System.out.print(k+" ");
					k++;
				}
			}
			else
			{
				int k=num*i;
				for(int j=1;j<=num;j++)
				{
					System.out.print(k+" ");
					k--;
				}
			}
		System.out.println();
		}
		}
}
