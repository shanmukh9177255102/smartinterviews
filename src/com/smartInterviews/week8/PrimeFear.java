package com.smartInterviews.week8;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFear {

	static ArrayList<Boolean> primesList=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	
	public static void generateCummulativeCount()
	{
		
	}
	public static void generateModifiedPrimes()
	{
		int digitscontrl=1;
		int count=0;
		
		for(int i=2;i<primesList.size();i++)
		{
			if(primesList.get(i)==true){
				
			if((digitscontrl*10)<i)digitscontrl*=10;
			
			int sub=i%digitscontrl;
			if(primesList.get(sub)==true || i<10)
			{
				count++;
				System.out.println(i);
			}
			}
		}
		System.out.println("---count--"+count);
		
		
	}
	public static void generatePrimes(int no)
	{
		//1
		primesList.add(false);primesList.add(false);
		for(int i=2;i<=no;i++)
		primesList.add(true);
		
		for(int i=2;i<no;i++)
		{
			if(primesList.get(i)!=false)
			for(int j=(2*i);j<no;j=j+i)
			{
				//boolean b=primesList.get(j);
				primesList.set(j,false);
			}
		}
		
		generateModifiedPrimes();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generatePrimes(30);
		
		generatePrimes(5);
		int n=sc.nextInt();
		int[] q=new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			q[i]=sc.nextInt();
		    max=max>q[i]?max:q[i];
	    }
		
		generatePrimes(max);

	}

}
