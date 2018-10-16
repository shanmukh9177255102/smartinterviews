package com.kony.hackerearth;

import java.util.Scanner;

public class AreaRectangle {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	public static int rectangleArea(int[] r1,int[] r2)
	{
		// point-1
	       int a=r1[0],b=r1[1],c=r1[2],d=r1[3];
	    // point-2
	       int p=r2[0],q=r2[1],r=r2[2],s=r2[3];
	       
	       // no area..condition
	       if((a<p && c<p) || (a>p && c>p) || (b<q && d<q) || (b>q && d>q))return 0;
	    //x area
	     
	    	 int xstrip=Math.max(a,p)-Math.min(c,r);
	       
	    //y area
	    	   
	    	 int ystrip=Math.max(b,q)-Math.min(d,s);
	       
	       
	       
	       return (xstrip * ystrip);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int m=sc.nextInt();
			sc.nextLine();
			int[] a=s2iA(sc.nextLine().split(" "));
			int[] b=s2iA(sc.nextLine().split(" "));
			System.out.println(rectangleArea(a,b));
		}
		

	}

}
