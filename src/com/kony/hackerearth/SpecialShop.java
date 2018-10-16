package com.kony.hackerearth;

import java.util.HashMap;
import java.util.Scanner;

public class SpecialShop {

	static Scanner sc=new Scanner(System.in);
	static HashMap<Integer,Double> hm=new HashMap<Integer,Double>();
	
	public static int[] toArray(String str){
		
		String[] p=str.split(" ");
		int[] input=new int[3];
		
	    for(int i=0;i<p.length;i++){
		input[i]=Integer.parseInt(p[i]);  
		
	  }
	  return input;
	}
	
	public static Double getPow(int n){
		
		Integer i=new Integer(n);
		if(hm.isEmpty() || !hm.containsKey(i))
		hm.put(i,Double.valueOf((Math.pow(n,2))));
		
		return hm.get(i);
	}
	public static void findMinPay(String input1){
		
		int[] input=toArray(input1);
		int temp,x=0;
		int N=input[0],A=input[1],B=input[2];
		Integer min=Integer.MAX_VALUE;
		
		
		for(int y=N;x<=N && y>=0;x++,y--){
			int mintemp=(int)((A * getPow(x)) + (B * getPow(y)));
			min=min<=mintemp?min:mintemp;
		}
		System.out.println(min);
	}
	
	
	public static void main(String[] args) {
	
		int t=sc.nextInt();
		String s=sc.nextLine();
		for(int i=0;i<t;i++)
		{
					s=sc.nextLine();
					findMinPay(s);
				
		}

	}

}
