package com.kony.hackerearth;

import java.util.ArrayList;
import java.util.Scanner;

public class Cars241 {
	
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Integer> al=new ArrayList<>();
	
	static int nCr(int n, int r) 
	{ 
	    return al.get(n) / (al.get(r) * 
	                  al.get(n - r)); 
	} 
	  
	// Returns factorial of n 
	public static void fact(int n) 
	{ 
	    int res = 1; 
	    al.add(1);
	    al.add(1);
	    for (int i = 2; i <= n; i++) 
	        {
	    	res = res * i; 
	        al.add(res);
	        }
	} 
	public static void main(String[] args) {
	
		int n=sc.nextInt();
		fact(n);
		int r,c=0;
		int[] a=new int[n];
		int[] cs=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
			
		int k=sc.nextInt();
		
		int sum=0,temp=0;
		for(int i=0;i<(n-k);i++)
		{
			if(a[i]!=0)	
			temp=nCr(n-i-1,k-1);
			//System.out.println(temp+" "+(n-i-1)+" "+(k-1));
			sum+=temp;
		}
		
		System.out.println(sum);	
		 
	}

}
