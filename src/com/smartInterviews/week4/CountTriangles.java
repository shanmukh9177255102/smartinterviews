package com.smartInterviews.week4;

import java.util.Arrays;
import java.util.Scanner;

public class CountTriangles {
	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	
	public static void countT(int[] a)
	{
		int i,j,k,count=0,sum=0,n=a.length;
		
		Arrays.sort(a);
		
		for(i=0;i<n-2;i++)
		{
			k=i+2;
			
			for(j=i+1;j<n;++j)
			{
				sum=a[i]+a[j];
				
				while(k<n && a[k]<sum)++k;
				
			    	count+=(k-j-1);
		
			    //System.out.println("count#:"+count+" k "+k+" j "+j);
			}
			//System.out.println("count:"+count);
		}
		
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={20,23,59,67,72,83};
		int[] b={2,4,8,10,10,12};
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		    int m=sc.nextInt();
		    sc.nextLine();
		    int[] ip=s2iA(sc.nextLine().split(" "));
		    countT(ip);
		}

	}

}
