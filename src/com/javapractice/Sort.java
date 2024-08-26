package com.javapractice;

public class Sort {
	public static void main(String[] args) {
		int[] a= {2,4,1,3,5,0,9};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int n:a) {
			System.out.println(n);
		}
		
	}
	

}
