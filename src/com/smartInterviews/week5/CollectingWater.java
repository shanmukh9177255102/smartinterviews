package com.smartInterviews.week5;

import java.util.Arrays;
import java.util.Scanner;

public class CollectingWater {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	public static void collect(int[] h)
	{
		int l=h.length;
		int[] maxL=new int[l];
		int[] maxR=new int[l];
		
		Arrays.fill(maxL,0);Arrays.fill(maxR,0);
		
		int maxLm=h[0],maxRm=h[l-1];
		for(int i=0,j=l-1;i<l;i++,j--)
		{
		       if(maxLm<h[i])maxLm=h[i];
		       if(maxRm<h[j])maxRm=h[j];
		       
		       maxL[i]=maxLm;
		       maxR[j]=maxRm;
		}
		long sum=0;
		for(int i=0;i<l;i++)
		{
			maxL[i]=Math.min(maxL[i],maxR[i])-h[i];
			sum+=maxL[i];
			
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] a={2,3,1,4,8,3,1,2,4,10,6,3,4,1,2,5,1,3};
		//collect(a);
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int m=sc.nextInt();
			sc.nextLine();
			int[] ip=s2iA(sc.nextLine().split(" "));
			collect(ip);
		}

	}

}
