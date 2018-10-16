package com.kony.hackerearth;

import java.util.Scanner;

public class Pikachu1 {
	
	public static Scanner sc=new Scanner(System.in);

	public static int maxlenLinear(char a,char b){
		
		if(a==b)return 0;
		int val1=Math.abs(a-b);
		int val2=26-val1;
		return Math.min(val1,val2);
		
	}
	public static int count(char a,char b)
	{
		//System.out.println(a+","+b);
		int a2=a-13;
		int b2=b-13;
		int v1=maxlenLinear(a, b);
		int a_side=a >'M'? 2:1;
		int b_side=b >'M'? 2:1;
		
		if(a_side==b_side)
		{// System.out.println("v1:"+v1);
		return v1;
		}
		else  return Math.min(v1,1+count((char)(a>b?a2:a),(char)(a<b?b2:b)));
	}
	public static void main(String[] args) {
		
		int temp1,temp=0;
		
		
		int n=sc.nextInt();
		sc.nextLine();
		String a=sc.nextLine();
		String b=sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
		   temp1=count(a.charAt(i),b.charAt(i));
			temp+=temp1;
		}
		System.out.println(temp);
		
		//System.out.println(count('C', 'D'));
	}

}
