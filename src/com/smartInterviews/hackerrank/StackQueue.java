package com.smartInterviews.hackerrank;

import java.util.Scanner;

public class StackQueue {

	static Scanner sc=new Scanner(System.in);
	
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	
	public static long computeArr(int[] arr,int k)
	{
		int i,j;
		long[] fr=new long[arr.length];
		long[] rf=new long[arr.length];
		
		fr[0]=arr[0];rf[arr.length-1]=arr[arr.length-1];
		
		for(i=1,j=arr.length-2;i<arr.length;i++,j--)
		{
			fr[i]=(fr[i-1]+(long)arr[i]);
			rf[j]=(rf[j+1]+(long)arr[j]);
			//System.out.println("i"+i);
		}
		
		//System.out.println("----");
		
		//for(i=0;i<arr.length;i++){	System.out.print(fr[i]+"#");}
		//System.out.println();
		//for(i=0;i<arr.length;i++){	System.out.print(rf[i]+"#");}
		long max=0;
		for(i=0;i<arr.length && (arr.length-k+i+1)<arr.length;i++)
		{
			long temp=fr[i]+rf[arr.length-k+i+1];
			max=max>temp?max:temp;
			//System.out.println(fr[i]+","+rf[arr.length-k+i+1]);
		
		}
		return max;
	}
	
	public static int minString(String s)
	{
		int[] n=new int[26];
		int i,max=0;
		
		for(i=0;i<26;i++)n[i]=0;
		for(i=0;i<s.length();i++)
			n[s.charAt(i)-'a']++;
		for(i=0;i<26;i++)max=max>=n[i]?max:n[i];
		
		return s.length()-max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nk[]=s2iA(sc.nextLine().split(" "));
		int result=0;
		int n=nk[0],k=nk[1];
		int tempArr[]=s2iA(sc.nextLine().split(" "));//{10, 9, 1, 2 ,3 ,4 ,5, 6, 7, 8};
		System.out.println(computeArr(tempArr,k));
		
		//int n=Integer.parseInt(sc.nextLine());
		//System.out.println(minString(sc.nextLine()));

	}

}
