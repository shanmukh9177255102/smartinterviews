package com.kony.hackerearth;

import java.util.Date;
import java.util.Scanner;

public class Maximumprofit {


	static int[] input;static boolean[] visited;static long[] dynArr;
	static int n,plotval;static long max=0;static long[] maxarr;
	static Date d1;
	static Date d2;
	public static void resetArr(int n)
	{
		dynArr=new long[n];
		visited=new boolean[n];
		max=0;
		for(int i=0;i<n;i++){dynArr[i]=0;visited[i]=false;}
	}
	public static int s2i(String str)
	{
		return Integer.valueOf(str);
	}
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=s2i(str[i]);
		return ret;
	}
	
	public static long fillArr(int index)
	{
		   int i=index;long sum=0;
		   //System.out.println("##index:"+index);
		   if(index < n && plotval>=input[i]){
			   //System.out.println("##enter..");
			if(visited[index]==false)
			{
				sum+=plotval-input[i];
				i++;
				sum+=fillArr(i);
				dynArr[index]=sum;
				max=max>=sum?max:sum;
				//System.out.println("dynArr["+index+"]:"+sum);
				visited[index]=true;
				return sum;
			}
			else return dynArr[index];
		   }
		   else 
			   {
			   //System.out.println("##out");
			   return 0;
			   }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ip=0,tests=sc.nextInt();
		//System.out.println(""+tests);
		sc.nextLine();
		while(ip<tests){
			d1= new Date();
		String[] inputString=sc.nextLine().split(" ");
		//System.out.println(inputString);
		n=s2i(inputString[0]);
		plotval=s2i(inputString[1]);
		resetArr(n);
		input=s2iA(sc.nextLine().split(" "));
		for(int i=0;i<n;i++)
		fillArr(i);
		//for(int i=0;i<5;i++)System.out.println(dynArr[i]+"\t");
		System.out.println(max);
		d2=new Date();
		System.out.println("time:"+(d2.getTime()-d1.getTime()));
		ip++;
		}
		sc.close();
	}

}
/*27
1
42
30
0
3
0
*/
