package com.smartInterviews.hackerrank;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Frequency implements Comparator<Map.Entry<Integer,Integer>>
{

	
	@Override
	public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b) {
		// TODO Auto-generated method stub
		
		int p=a.getValue();
		int q=b.getValue();
		
		if(p==q)return a.getKey()-b.getKey();
		return p-q;
	}

}

public class SortByFrequency {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	public static void main(String[] args) {
		
		/*HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		   for(int j=0;j<k;j++)
           {
               if(hm.get(ip[j])==null)hm.put(ip[j],1);
               else{
                   int t=hm.get(ip[j]);
                   hm.put(ip[j],t+1);
               }
               
           }*/
		System.out.println("iuhyu");
       
	}

}
