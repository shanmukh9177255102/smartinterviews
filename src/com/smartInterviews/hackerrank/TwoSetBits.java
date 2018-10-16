package com.smartInterviews.hackerrank;

import java.util.Scanner;

public class TwoSetBits {
	 static Scanner sc=new Scanner(System.in);
	 public static long aPowb(long a,long b){
	        //System.out.println(a+","+b);
	        if(b == 1)return a;
	        if(a == 1)return b;
	        if(b == 0)return 1;
	        if(b%2!=0)return a*aPowb(a,b-1)%1000000007;
	        else {
	        	long temp=aPowb(a,b/2);
	              return (temp*temp)%1000000007;
	        		}
	        
	    }
	 public static long computeN(long n)
	 {
		 long m=(long) Math.round(-1+Math.sqrt(1+(8*n))/2);
		 return m+1;
	 }
	 
	 public static void NthNo(long no){
		 
		 long temp=computeN(no);
		 
		 long ct=temp*(temp-1);ct=ct/2;
		 
		 long offset=no-ct;
		 
		 long output=1;
		 
		 //output=output<<temp;
		 output=aPowb(2,temp);
	
		  long op=1;
		 //op=op<<offset;
		 op=aPowb(2,offset);
		 op=(op | output);
	
		 System.out.println(op);

	 }
	 	 
	 public static void main(String[] args) {
	        int t=sc.nextInt();
	        int i;
	       
		 for(i=1;i<=t;i++){NthNo(sc.nextLong()-1);}	 
	 }
	          

}
