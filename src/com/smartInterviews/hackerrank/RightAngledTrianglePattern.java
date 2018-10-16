package com.smartInterviews.hackerrank;

import java.util.Scanner;

public class RightAngledTrianglePattern {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int m=sc.nextInt();
		for(int o=1;o<=m;o++)
		{
			int n=sc.nextInt();
		char[] str=new char[n];
		for(int i=0;i<n;i++)str[i]=' ';
		System.out.println("Case #"+o+":");
		while(n>0){
			str[n-1]='*';
			System.out.println(str);
		    n--;
			
		}
		}
		sc.close();

	}

}
