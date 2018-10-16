package com.smartInterviews.week5;

import java.util.Scanner;

public class WVC {

	static Scanner sc=new Scanner(System.in);
	
	public static int isVowel(char t)
	{
		if(t>=65 && t<=90)
			t+=32;
		if(t=='a'|| t=='e' || t=='i' || t=='o' || t=='u')
		return 1;
		return 0;
	}
	public static void count(String s)
	{
		int c=0,words=0,vowels=0,consonents=0;
		s=s.trim();
		for(int i=0;i<s.length();i++)
		{
			c=0;
			
			while(i<s.length() && s.charAt(i)==' '){c++;i++;}
			if(c>0)
			words++;
			
			if(i<s.length())
			{
			 char t=s.charAt(i);
			 if(t>=65 && t<=90)t+=32;
			if(t=='a'|| t=='e' || t=='i' || t=='o' || t=='u')vowels++;
			else consonents++;
			}
			
		}
		if(words>0)words++;
		System.out.println(words+" "+vowels+" "+consonents);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s="Hi there";
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		count(sc.nextLine());

	}

}
