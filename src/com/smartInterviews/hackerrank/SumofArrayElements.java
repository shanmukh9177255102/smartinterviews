package com.smartInterviews.hackerrank;

import java.util.Scanner;

public class SumofArrayElements {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
             int m=sc.nextInt();
		       sc.nextLine();
		       
		      for(int k=1;k<=m;k++){
		    	  long temp=0;
               int n=sc.nextInt();sc.nextLine();
               
               String[] s=sc.nextLine().split(" ");
               for(int i=0;i<n;i++)
                temp+=Long.parseLong(s[i]);
               System.out.println(temp);
               
		}
               sc.close();
	}

}
