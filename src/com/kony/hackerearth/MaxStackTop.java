package com.kony.hackerearth;

import java.util.Scanner;

public class MaxStackTop {
	
	
	public static int n,k;
    public static long max=-1;
	public static Scanner sc=new Scanner(System.in);
	
    public static long toArray(String str){
		
		long temp;
		String[] p=str.split(" ");
		if(k==1){ if(p.length>1) return Long.parseLong(p[1]);else return max;}
		
	    if(k>n)k=n-1;
	    if(n==k)k=n-2;
	    for(int i=0;i<=k;i++){
	    	temp=Long.parseLong(p[i]);
	    	max=max>=temp?max:temp;
	  }
	  return max;
	}

	public static void main(String[] args) {
		
		String[] nl=sc.nextLine().split(" ");
		
		n=Integer.parseInt(nl[0]);
		k=Integer.parseInt(nl[1]);
		
		String input=sc.nextLine();
		
		System.out.println(toArray(input));
		sc.close();

	}
}
