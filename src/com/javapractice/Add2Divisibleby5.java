package com.javapractice;

public class Add2Divisibleby5 {
public static void main(String[] args) {
	int a[] = {13,15,20,30,34,25};//o/p:17,22,32,27 the num which is divisible by 5, then add 2 that num and print
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%5==0)
		{
			System.out.println(a[i]+2);
		}
	}
}
}
