package com.javapractice;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a= {4};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	
		{
			System.out.println("index of key is "+search(a,7));
		}
	}
	public static int search(int[] a, int key) {
		if(a.length==0) return -1;
		if(a.length==1)  return a[0] == key ? 0 : -1;
		int st=0;
		int end=a.length-1;
		
		while(st<=end)
		{
			int mid=(st+end)/2;

			if(key==a[mid])
			{
				return mid;
			}
			else if(key>a[mid])
			{
				st=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
	}
}
