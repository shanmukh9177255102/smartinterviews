package com.smartInterviews.week8;

import java.util.Scanner;

public class PrimeCoins {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int k=sc.nextInt();
			System.out.println(k%6==0?"Banta":"Santa");
		}

	}

}
