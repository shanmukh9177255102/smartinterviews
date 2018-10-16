package com.smartInterviews.week6;

import java.util.HashMap;
import java.util.Map;

// 0's & 1's  . subarrays containing equal no of 0's & 1's

public class NoOfValidSubarrays {

	
	public static void validateSubarry(int[] a)
	{
		int[] cslr=new int[a.length];
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)a[i]=-1;
			if(i==0)cslr[i]=a[i];
			else cslr[i]=cslr[i-1]+a[i];
		}
		
		HashMap<Integer,Integer> hmlr=new HashMap<>();
		HashMap<Integer,Integer> hmrl=new HashMap<>();
		
		for(int i=0,j=a.length-1;i<a.length;i++,j--)
		{
			hmlr.put(cslr[i],i);
			hmrl.put(cslr[j],j);
		}
		
		int result=0;
	for(Map.Entry<Integer,Integer> t:hmrl.entrySet())
	{
		int k=t.getKey();
		int r=t.getValue();
		int l=hmlr.get(k);
		
		result=result>(r-l)?result:(r-l);
	}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
