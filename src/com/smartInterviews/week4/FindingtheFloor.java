package com.smartInterviews.week4;

import java.util.Arrays;
import java.util.Scanner;

public class FindingtheFloor {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	public static int findFloor(int[] a,int k)
	{
		int li=a.length-1;
		if(a[0]>k)return Integer.MIN_VALUE;
		if(a[li]<k)return a[li];
		
		return bst(a,0,li,k);
		
	}
	
	public static int bst(int[] a,int l,int h,int k)
	{
		
		while(l<h)
		{
			//System.out.println(l+","+h);
			int m=l+(h-l)/2;
			if(a[m]>k)h=m;
			else 
			{
				if(a[m]==k)return k;
			    else  l=m+1;
			}
		}
		//System.out.println("l"+l);
		if(a[l]==k)return k;
		return a[l-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] a={-6,-1,-1,-1,5,10,15,20};
		//int[] b={-6,-3,-2,-2,-2,-2,3,8};
		
		int n=sc.nextInt();
		
		sc.nextLine();
		
		int[] ip=s2iA(sc.nextLine().split(" "));
		Arrays.sort(ip);
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		System.out.println(findFloor(ip,sc.nextInt()));

	}

}
