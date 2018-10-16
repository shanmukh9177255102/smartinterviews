package com.smartInterviews.week4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FindingFrequency {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	
	public static void frequency(int[] ip,int[] q)
	{
		Arrays.sort(ip);
		int[] sq=new int[q.length];
		HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int i=0;i<q.length;i++)
			{sq[i]=q[i];hm.put(q[i],-1);}
		
		Arrays.sort(sq);
		int t,qi=0,ai=0,c=0;
		while(qi<q.length && ai<ip.length)
		{
			t=sq[qi];
			c=0;
			
			while(ai<ip.length && t>ip[ai])ai++;
			while(ai<ip.length && t==ip[ai]){c++;ai++;}
			
			if(c>0)hm.put(t,c);
			
			qi++;
		}
		
		for(int i=0;i<q.length;i++)
		{
			t=hm.get(q[i])>0?hm.get(q[i]):0;
			System.out.println(t);
		}
		
		
	}
	public static void main(String[] args) {
	
		//int[] a={-6,10,-1,20,-1,15,5,-1,15};
		//int[] q={-1,10,8,15,20};
		
		int n=sc.nextInt();
		sc.nextLine();
		int[] ip=s2iA(sc.nextLine().split(" "));
		int m=sc.nextInt();
		int[] q=new int[m];
		for(int i=0;i<m;i++)
		q[i]=sc.nextInt();
		frequency(ip, q);

	}

}
