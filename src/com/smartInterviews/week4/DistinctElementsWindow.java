package com.smartInterviews.week4;

import java.util.HashMap;
import java.util.Scanner;

public class DistinctElementsWindow {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	public static void DistinctEle(int[] m,int k)
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(m[0], 1);
		
		for(int i=1;i<k;i++)
		{
			if(hm.containsKey(m[i])){
				int t=hm.get(m[i])+1;
				hm.put(m[i],t);
			}
			else  hm.put(m[i],1);
	
		}
		System.out.print(hm.size()+" ");
		int maxl=hm.size();
		int j=0;
		for(int i=k;j<(m.length-k);i++,j++)
		{
			//System.out.println("in"+i);
           // delete previous..
			int t=hm.get(m[j]);
			t--;
			if(t==0)hm.remove(m[j]);
			else hm.put(m[j], t);
			
			// add new ..
			if(hm.containsKey(m[i]))
			{
				t=hm.get(m[i])+1;
				hm.put(m[i],t);
			}
			else{
				hm.put(m[i],1);
			}
			
			
			if(maxl<hm.size())maxl=hm.size();
			System.out.print(hm.size()+" ");
			
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			int[] m=s2iA(sc.nextLine().split(" "));
			int[] ip=s2iA(sc.nextLine().split(" "));
			
			DistinctEle(ip,m[1]);
			System.out.println();
		}

	}

}
