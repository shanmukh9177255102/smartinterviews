package com.smartInterviews.week5;

import java.util.Scanner;

public class StringModulo {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	public static void stringMod(String N,String P)
	{
		
		long lp=Long.parseLong(P);
		long res=0;
		for(int i=0;i<N.length();i++)
		{
			res=res*10+(N.charAt(i)-'0');
			res=res%lp;
			//System.out.println(res);
		}
		
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stringMod("1085377843","81765943");
		//stringMod("8290826691135830692772803","95972011");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String[] ips=sc.nextLine().split(" ");
			stringMod(ips[0],ips[1]);
		}

	}

}
