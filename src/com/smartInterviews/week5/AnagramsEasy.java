package com.smartInterviews.week5;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsEasy {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	
	public static String checkAnagrams(String a,String b)
	{
	  int[] ac=new int[26];
	  
	  Arrays.fill(ac,0);
	  int e=0;
	  for(int i=0;i<a.length();i++)
	  {
		  if(ac[a.charAt(i)-'a']==0)e++;
		  ac[a.charAt(i)-'a']++;
	  }
	  
	  for(int i=0;i<b.length();i++)
	  {
		  ac[b.charAt(i)-'a']--;
		  if(ac[b.charAt(i)-'a']<0)return "False";
		  if(ac[b.charAt(i)-'a']==0)e++;
	  }
	  
	  return e==0?"True":"False";
	  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String[] ips=sc.nextLine().split(" ");
			System.out.println(checkAnagrams(ips[0],ips[1]));
		}
	}

}
