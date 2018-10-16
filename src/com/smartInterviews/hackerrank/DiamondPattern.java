package com.smartInterviews.hackerrank;

import java.util.Scanner;

public class DiamondPattern {
	
	static Scanner sc=new Scanner(System.in);
	static StringBuilder sb;
	static int n;
	
	public static void printDiamond(int i,int j){
		while(i>=0)
		{
			sb.setCharAt(i,'*');sb.setCharAt(j,'*');
			System.out.println(sb);
			sb.setCharAt(i,' ');sb.setCharAt(j,' ');
			i--;j++;
		}
		i+=2;j-=2;
	
		while(i<=j)
		{
			sb.setCharAt(i,'*');sb.setCharAt(j,'*');
			System.out.println(sb);
			sb.setCharAt(i,' ');sb.setCharAt(j,' ');
			i++;j--;
		}
		
	}
	
	public static void main(String[] args) {
		
		int m=sc.nextInt();
		
		for(int k=1;k<=m;k++){
               int n=sc.nextInt();
               sb=new StringBuilder();
               for(int i=0;i<n;i++)sb.append(' ');
               System.out.println("Case #"+k);
               printDiamond(n/2,n/2);
		}
               sc.close();
               
	}

}
