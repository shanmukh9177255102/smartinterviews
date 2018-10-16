package com.kony.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class MedianArrays {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	
	public static int swaps(int[] a,int[] b,int N)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		
		int count=0,cnt=N-1;
		int ap=0,bp=0;
		while(count<cnt)
		{
			if(a[ap]<b[bp])ap++;
			else bp++;
			count++;
		}
		
		if(ap>bp)return cnt-ap+1;
		if(bp>ap)return cnt-bp+1;
		if(ap==bp)return (a[ap-1]==b[bp-1])?0:-1;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={1,2,3,3,5,6,7};//{2,3};//{3,7,10};//
		int[] b={4,6,8,8,9,9,9};//{10,5};//{5,20,15};
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int l=sc.nextInt();
			sc.nextLine();
			a=s2iA(sc.nextLine().split(" "));
			b=s2iA(sc.nextLine().split(" "));
		    System.out.println(swaps(a,b,l));
		}

	}

}
