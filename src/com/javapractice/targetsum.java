package com.javapractice;

public class targetsum {
	public static void main(String[] args) {
	   int[] a= {};
	   for(int i=0;i<a.length-1;i++) {
		   for(int j=i+1;j<a.length;j++) {
			   if(a[i]+a[j]==8) {
				   System.out.println(i+" "+j);
			   }
		   }
	   }
	}

}
