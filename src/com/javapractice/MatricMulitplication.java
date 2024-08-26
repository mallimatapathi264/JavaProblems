package com.javapractice;

public class MatricMulitplication {
public static void main(String[] args) {
	int[][] a= {{1,2,3},{1,2,3},{1,2,3}};
	
	int[][] b= {{1,2,3},{1,2,3},{1,2,3}};

	int[][] c=new int[a.length][a.length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			for(int k=0;k<a.length;k++)
			{
				c[i][j]+=a[i][k]*b[k][j];
			}
		}
	}
	for(int[] j:c)
	{
		for(int m:j)
		{
			System.out.print(m/6+" ");
		}
		System.out.println();
	}
}
}
