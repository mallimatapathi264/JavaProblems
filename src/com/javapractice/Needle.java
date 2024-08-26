package com.javapractice;

public class Needle {
	public static void main(String[] args) {
		String s="sadbutsad";
		String needle="sad";
	int res=nedd(s, needle);
	System.out.println(res);
	}
	public static int nedd(String s, String needle) 
	{
	
		if(s.startsWith(needle) && (s.endsWith(needle))) return 0;
		else return -1;
	}
}