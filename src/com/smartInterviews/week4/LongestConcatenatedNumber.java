package com.smartInterviews.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class NumberComp implements Comparator<String>{

	@Override
	public int compare(String X, String Y) {
		// first append Y at the end of X
        String XY=X + Y;
         
        // then append X at the end of Y
        String YX=Y + X;
         
        // Now see which of the two formed numbers 
        // is greater
        return XY.compareTo(YX) > 0 ? -1:1;
	}
	
}
public class LongestConcatenatedNumber {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	
	public static void longest(int[] a)
	{
		ArrayList<String> al=new ArrayList<>();
		int zeros=0;
		for(int i=0;i<a.length;i++)
		{ if(a[i]!=0)al.add(String.valueOf(a[i]));
		  else zeros++;
		
		}
		if(zeros<a.length)
		{
			Collections.sort(al,new NumberComp());
		    for(int i=0;i<al.size();i++)
			System.out.print(al.get(i));
		    while((zeros--)>0)System.out.print(0);
		}
		else System.out.print(0);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("40".compareTo("4"));
		//int[] a={49,73,58,30,72,44,78,23};
		//int[] b={69,9,57,60};
		//int[] c={40,4};
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		int m=sc.nextInt();
		sc.nextLine();
		int[] ip=s2iA(sc.nextLine().split(" "));
		longest(ip);
		System.out.println();
		}
		

	}

}
