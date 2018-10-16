package com.smartInterviews.week5;

import java.util.Scanner;

public class SumOfSubarrays {

	static int[] cs;
	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	public static void constructCSA(int[] a)
	{
		cs=new int[a.length];
		
		cs[0]=a[0];
		
		for(int i=1;i<a.length;i++)
			cs[i]=cs[i-1]+a[i];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=sc.nextInt();
		sc.nextLine();
		int[] ip=s2iA(sc.nextLine().split(" "));
		
		constructCSA(ip);
		
		int m=sc.nextInt();
		int res=0;
		for(int i=0;i<m;i++)
		{
			int p=sc.nextInt();
			int q=sc.nextInt();
			
			if(p==0)res=cs[q];
			else if(p==q)res=cs[p];
			else res=cs[q]-cs[p-1];
			System.out.println(res);
		}

	}

}
