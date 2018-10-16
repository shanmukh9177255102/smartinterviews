package com.smartInterviews.week6;

import java.util.Arrays;

public class Algos {

	
	//camelcase  oneTwoThree
	public static void camelcase(String s)
	{
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<=90)count++;
		}
		System.out.println(count);
	}
	
	
	
	//strong pwd   l>=6 d C c !@#$%^&*()-+
	public static void passStrength(String s)
	{
		int len=0,dig=0,cap=0,sm=0,spl=0,count=0;
		
		int l=s.length();
		if(l>=6){len=1;count++;}
		
		for(int i=0;i<l;i++)
		{
			char c=s.charAt(i);
			
			// digit
			if(dig==0 && c>=48 && c<=57){dig=1;count++;}
			
			//cap
			if(cap==0 && c>=65 && c<=90){cap=1;count++;}
			
			//small
			if(sm==0 && c>=97 && c<=122){sm=1;count++;}
			
			// special..
			if(spl==0)
			if(c=='!' || c=='@' || c=='#' || c=='$' || c=='%' || c=='^' || c=='&' || c=='*' || c=='(' || c==')' || c=='-' || c=='+')
				{spl=1;count++;}
			
			if(count==5)break;
			
		}
		System.out.println(5-count);
	}
	
	//2characters.. alternating characters
	
	
	
	
	
	//ceaser cipher  char+k-rotation
	public static void ceasercipher(String s,int k)
	{
		char c;
		k=k%26;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			
			if(c>=65 && c<=90)
			 c=(char)(((c-'A')+k)%26 +'A');
			
			if(c>=97 && c<=122)
				c=(char)(((c-'a')+k)%26 +'a');
			System.out.print(c);
		}
	}
	
	
	
	//hackerrank string   if subsequence exists..
	
	
	
	
	
	
	//pangrams  ..all letters of alphabet are present in given string
	public static boolean pangrams(String s)
	{
		boolean[] b=new boolean[26];
		Arrays.fill(b, false);
		char c;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			
			if(c>=65 && c<=90)
			b[c-'A']=true;
			
			if(c>=97 && c<=122)
			b[c-'a']=true;
		}
		for(int i=0;i<26;i++)
		{
			if(b[i]==false)return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
