package com.smartInterviews.week4;

import java.util.Arrays;
import java.util.Scanner;

public class PowerGame {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	
	public static int powergame(int[] a,int[] b)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0,j=0,count=0;
		while(i<a.length)
		{
			if(a[i]>b[j]){
				
				//System.out.println(a[i]+","+a[j]);
				count++;j++;
				}
			
			i++;
			
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int p=sc.nextInt();
			sc.nextLine();
			int[] a=s2iA(sc.nextLine().split(" "));
			int[] b=s2iA(sc.nextLine().split(" "));
			System.out.println(powergame(a, b));
		}
				
				

	}

}
