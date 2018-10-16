package com.smartInterviews.week5;

import java.util.HashMap;
import java.util.HashSet;

public class PickingNumbers {
	
	public static int maxlenSeq(int[] a)
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		HashSet<Integer> hs=new HashSet<>();
		// inserted to hashmap..
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{int t=hm.get(a[i]);hm.put(a[i],t+1);}
			else
			{ hm.put(a[i],1);}
		}
		int maxv=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(!hs.contains(a[i]))
			{
				int cnt=hm.get(a[i]);
				hs.add(a[i]);
				int j=i;
				while(hm.containsKey(a[j]+1))
				{
					j++;
					hs.add(a[j]);
					cnt+=hm.get(a[j]);
				}
				if(cnt>maxv)maxv=cnt;
			}
		}
		
		return maxv;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
