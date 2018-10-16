package com.kony.hackerearth;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class EasyQueries {

	public static LinkedList<Integer> ll=new LinkedList<Integer>();
	static Scanner sc=new Scanner(System.in);
	
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	
	public static void setElement(int ele)
	{
		int i=Collections.binarySearch(ll, ele);
		if(i<0){
			ll.add(-i-1, ele);
		}
		
	}	
	
	public static void getIndex(int index)
	{
		int p,q,l=-1,r=-1;
		if(ll.size()!=0)
		{
		 int i=Collections.binarySearch(ll, index);
		
		 if(i==-1)
		 { if(ll.size()>0)r=ll.get(0);l=-1;}
		 else if(i<0)
		  {
			 p=-i-1;q=p-1;
			 if(p>=0 && p<ll.size())r=ll.get(p);
			 if(q>=0 && q<ll.size())l=ll.get(q);
		  }
		 else {
			 p=i+1;q=i-1;
			 if(p>=0 && p<ll.size())r=ll.get(p);
			 if(q>=0 && q<ll.size())l=ll.get(q);
		 }
		}
		System.out.println(l+" "+r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ns=s2iA(sc.nextLine().split(" "));
		int[] ip=s2iA(sc.nextLine().split(" "));
		int i;
		for(i=0;i<ip.length;i++)if(ip[i]!=0)setElement(i);
		for(i=0;i<ns[1];i++){
			int[] s=s2iA(sc.nextLine().split(" "));
			switch(s[0])
			{
				case 0:getIndex(s[1]);break;
				case 1:setElement(s[1]);break;
				
			}
		}
		

	}

}
