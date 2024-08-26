package com.javapractice;

public class WordLength {
	public static void main(String[] args) {
		String s="hello world welocme";
		String[] sp= s.split(" ");
		int l=0;
		String lw="";
		for(int i=0;i<sp.length;i++)
		{
			if(sp[i].length()>l)
			{
				l=sp[i].length();
				lw=sp[i];	
			}
		}
		System.out.print(l+" "+lw);
	
	}
}
