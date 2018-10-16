package com.smartInterviews.hackerrank;

import java.util.Scanner;

public class ApowB {
	 static Scanner sc=new Scanner(System.in);
	    public static long[] s2iA(String str[])
	    {
	        long[] ret=new long[str.length];
	        for(int i=0;i<str.length;i++)
	            ret[i]=Long.parseLong(str[i]);
	        return ret;
	    }
	public static int aPowb(int a,int b,int c){
		      if(a>=0)a=a%c;
		      else while(a>0)a=(a+c)%c;
	        System.out.println(a+","+b);
	        if(b == 1)return a;
	        if(a == 1)return 1;
	        if(b == 0)return 1;
	        if(b%2!=0)return (int)((long)a*aPowb(a,b-1,c))%c;
	        else {
	        	long temp=aPowb(a,b/2,c)%c;
	              return (int)((long)(temp*temp)%c);
	        		}
	        
	    }
	    public static void main(String[] args) {
	        /*int t=sc.nextInt();
	        int i,j,temp,p,q;
	        sc.nextLine();
	        for(i=1;i<=t;i++){
	            long[] arr=s2iA(sc.nextLine().split(" "));
	            System.out.print(aPowb(arr[0],arr[1],arr[2]));
	            System.out.println("");
	        }*/
	    	int[] arr={71045970,41535484,64735492};
	    	System.out.print(aPowb(arr[0],arr[1],arr[2]));
	    }
}
