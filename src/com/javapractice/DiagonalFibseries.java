package com.javapractice;

public class DiagonalFibseries {

public static void main(String[] args) {
	
	int[][] a= {{1,2,3},{1,2,3},{1,2,3}};
	
	
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i][i];
	
		if(a.length%2!=0 && i== a.length/2)
		{
			continue;
		}
		sum+= a[i][a.length-i-1];
	}
	System.out.println(sum);
}
}
