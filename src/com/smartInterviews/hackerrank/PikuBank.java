package com.smartInterviews.hackerrank;

import java.util.Scanner;

public class PikuBank {

     static Scanner sc=new Scanner(System.in);
	
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	public static long cal(int d,int a,int m,int b,long X){
		
		long mplusone=(a*m)+b;
		
		X-=d;
		
		long maxMplusone=X/mplusone;
		//System.out.println("m"+maxMplusone);
		long remainingMonths=(X%mplusone);
		if(remainingMonths%a==0){
			remainingMonths=remainingMonths/a;
		}
		else remainingMonths=remainingMonths/a+1;
		//  2+(4*5)+3+(4*5)+3+5
		//System.out.println("r"+remainingMonths);
		return (maxMplusone*(m+1))+remainingMonths;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
			{
			int nk[]=s2iA(sc.nextLine().split(" "));
			
			System.out.println(cal(nk[0],nk[1],nk[2],nk[3],nk[4]));
			}

	}

}
