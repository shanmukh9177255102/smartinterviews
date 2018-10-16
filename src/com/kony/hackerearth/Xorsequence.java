package com.kony.hackerearth;

import java.util.Scanner;

public class Xorsequence {

	static int l,r,x,y,t,n,m,maxval=0,ans=0;
	static String inputString[];
	static int[] inputArr,counterArr;
	static Scanner sc=new Scanner(System.in);
	public static void computeLR()
	{
		int temp,a=1,b=1;
		temp=(ans * t);
		a+=(x+temp)%n;
		b+=(y+temp)%n;
		r=a>=b?a:b;
		l=a>=b?b:a;l--;r--;
		counterArr=new int[n];
		for(temp=0;temp<n;temp++)counterArr[temp]=-1;
	}
	
	public static int s2i(String str)
	{
		return Integer.parseInt(str);
	}
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=s2i(str[i]);
		return ret;
	}
	public static void startprocess()
	{
		for(int i=0;i<m;i++)
		{    
			inputString=sc.nextLine().split(" ");
			x=s2i(inputString[0]);
			y=s2i(inputString[1]);
			computeLR();
			//System.out.println("l:"+l+",r:"+r);
			maxval=0;
			findmaxXor(l,r);
			System.out.println(maxval);
			printCounterArr();
		}
		
	}
	public static void printCounterArr()
	{
		System.out.println("");
		for(int i=0;i<counterArr.length;i++)
		{
			System.out.print(counterArr[i]+"\t");
		}
		System.out.println("");
	}
	public static int findmaxXor(int start,int end)
	{
	if(start==end-1){
		return counterArr[start]=inputArr[end]^inputArr[end-1];
	}
	for(int i=start;i<end;i++)
	{
		if(counterArr[i]==-1)
		counterArr[i]=Math.max(inputArr[start] ^ findmaxXor(start+1, end),inputArr[start]^inputArr[start+1]);
        //System.out.println("start:"+start+",end:"+end+"="+counterArr[i]);
		maxval=maxval>=counterArr[i]?maxval:counterArr[i];
	}
	return 0;
	}
	// 5 3 0
	//8 6 2 4 5
	//0 4
	//0 2
	//2 4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			inputString=sc.nextLine().split(" ");
		inputArr=s2iA(sc.nextLine().split(" "));
		n=s2i(inputString[0]);
		m=s2i(inputString[1]);
		t=s2i(inputString[2]);
		startprocess();
		//System.out.println("--donme-"+ (8 ^ 6));
		sc.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
