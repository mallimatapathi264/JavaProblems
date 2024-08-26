package com.javapractice;

public class OccuranceofEachElement {
	public static void main(String[] args) 
	{
		  int[] a= {1,2,1,3,1,6,3};
		  for(int i=0;i<a.length;i++) 
		  { 
		  int count=1; int temp=a[i]; 
		  if(temp==' ') continue; 
		  for(int j=i+1;j<a.length;j++)  
		  {  
			  if(a[i]==a[j]) 
			{ 
			  count++; 
			 a[j]=' ';
		  }
		} 
		System.out.println(temp+"-"+count); 	
	}
  }	 
}