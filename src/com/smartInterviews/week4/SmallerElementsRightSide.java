package com.smartInterviews.week4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SmallerElementsRightSide {

	static int count=0;
	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	
	public static void bsearchRotated(int[] a)
	{
		
		int l=0,h=a.length-1;
		int m=(l+h)/2;
		while(a[l]>a[h])
		{
			
			if(a[m]>a[h])l=m+1;
			else h=m-1;
		}
	}
	public static int last(List<Integer> arr, int low, int high, int x, int n)
	{
	    if (high >= low)
	    {
	        int mid = low + (high - low)/2;
	        if (( mid == n-1 || x < arr.get(mid+1)) && arr.get(mid) == x)
	            return mid;
	        else if (x < arr.get(mid))
	            return last(arr, low, (mid -1), x, n);
	        else
	            return last(arr, (mid + 1), high, x, n);
	    }
	    return -1;
	}
	
	public static int smallestelements(int[] a)
	{
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		int count=0;
		HashMap<Integer,Integer> indmap=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> id=new HashMap<>();
		int fk;
		for(int i=a.length-1;i>=0;i--)
		{
			
			// add ele to treemap..
			id.put(a[i],i);
			if(tm.isEmpty())
				{
				tm.put(a[i],1);
				indmap.put(i,0);
				}
			
			else if(tm.containsKey(a[i]))
			{
				int t=tm.get(a[i])+1;
				tm.put(a[i],t);
			}
			else tm.put(a[i],1);
			
			
			// find floor key..
			Object floorkey=tm.floorKey(a[i]-1);
			
			System.out.println("fk:"+floorkey+","+(a[i]-1));
			
			if(floorkey!=null)
			{
				fk=(int)floorkey;
			
			// get its already computed..value..
		    
		    
		    int y=id.get(floorkey);
		    int indval=indmap.get(y);
		    System.out.println("--indval--"+indval);
		    System.out.println("---");
			int indmapval=indmap.get(y)+tm.get(floorkey);
			System.out.println(indmapval);
			
			// save its value to respective index..
			indmap.put(i,indmapval);
			
			count+=indmap.get(i);
			
			System.out.println(i+"##"+indmap.get(i));
			}
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={4,10,54,11,8};
		int[] b={15,35,25,10,15,12};
		
		System.out.println(smallestelements(a));
		/*
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		int m=sc.nextInt();
		sc.nextLine();
		int[] q=s2iA(sc.nextLine().split(" "));
        System.out.println(smallestelements(q));
		}
		*/
        
        
	}

}
