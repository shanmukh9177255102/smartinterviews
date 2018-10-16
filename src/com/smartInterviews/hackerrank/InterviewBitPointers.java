package com.smartInterviews.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class InterviewBitPointers {

	// merge 2 sorted list
	public static void mergeLists(int[] a,int[] b)
	{
		int al=a.length,bl=b.length;
		
		int[] c=new int[al+bl];
		
		int cp=al+bl-1;
		al--;bl--;
		
		while(cp>=0)
		{
			if(al>=0 && bl>=0)
			{
				if(a[al]>b[bl])c[cp--]=a[al--];
			    else c[cp--]=b[bl--];
			}
			else{
				if(al<0)c[cp--]=b[bl--];
				else c[cp--]=a[al--];
			}

		}
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+",");
		
	}
	
	
	public int removeElement(ArrayList<Integer> a, int b) {
        int count=0,i=0;
        while(i<a.size())
        {
            int j=i;
            
            while(a.get(i)==b)
            {i++;count++;}
            
            if(count>0)
            {
            	int t=a.get(i);
            	a.add(j,t);
            }
            j++;i++;
        }
       printCollection(a);
        return a.size();
    }
	
	// remove duplicates from sorted array
	public static void removeDuplicates(int a[])
	{
		int i=0,j=0;
		int k=a.length;
		
		while(i<k){
		
			// count & move to next no..
			while(i<(k-1) && a[i]==a[i+1])
				i++;
			if(i<k){
				a[j]=a[i];
			    j++;
			}
			i++;
		}
		
		for(i=0;i<j;i++)
			System.out.print(a[i]+",");
		
	}
	
	
	// intersection of sorted lists
	public static void intersectionLists(int[] a,int[] b)
	{
	     int ap=0,bp=0;
	     ArrayList<Integer> al=new ArrayList<>();
		// get first index a ,b
	 while(ap<a.length && bp<b.length)
	{	
		 System.out.println(ap+","+bp);
		if(a[ap]==b[bp]){al.add(a[ap]);ap++;bp++;}
		else
		{
			if(a[ap]>b[bp])bp++;
			else ap++;
		}
	}
		
		
		for(int i=0;i<al.size();i++)
			{
			System.out.print(al.get(i));
			if(i!=(al.size()-1))System.out.print(" ");
			else System.out.println();
			}
		
	}
	
	public static void printCollection(List<Integer> al)
	{
		for(int i=0;i<al.size();i++)
		{
		System.out.print(al.get(i));
		if(i!=(al.size()-1))System.out.print(" ");
		else System.out.println();
		}
	}
	
	//remove element from array
	public static int[] removeElement(int[] a,int ele)
	{
		LinkedList<Integer> al=new LinkedList<Integer>();
		for(int i=0;i<a.length;i++)if(a[i]!=ele)al.add(a[i]);
		printCollection(al);
		int[] b=new int[al.size()];
		for(int i=0;i<al.size();i++)b[i]=al.get(i);
		return b;
	}
	
	//sort by color
	
	
	// 3sum
	public static int sumthree(ArrayList<Integer> a,int k)
	{
		Collections.sort(a);int max=Integer.MAX_VALUE;
		for(int i=0;i<a.size()-2;i++)
			for(int j=i+1;j<a.size()-1;j++)
				{
				int temp=k-(a.get(i)+a.get(j));
				List<Integer> te=a.subList(j+1,a.size());
			    int val=Collections.binarySearch(te,temp);
				 if(val>=0)
				 {
					 return k;
					 }
				 else { 
					 int near=te.get(-val-1);
					 temp=a.get(i)+a.get(j)+near;
				     int ab=Math.abs(k-temp);
				     if(ab<max)max=ab;
				 }
				}
		return max;
	}
	
	// 3 sum 0
	
	
	//counting triangles
	
	
	//Diff k
	
	public static boolean diffk(ArrayList<Integer> a,int k)
	{
		Collections.sort(a);
			for(int j=0;j<a.size()-1;j++)
				{
				int temp=k+(a.get(j));
				if(Collections.binarySearch(a.subList(j+1,a.size()),temp)>-1)
				{
					return true;
				}
				}
		   return false;
	}
	
	
	//max continuous series of 1s
	
	
	// container with most water
	
	
	
	// binarySearch(arr,inclu_index,exc_index,value)
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={8,9};
		int[] b={3};
		int[] c={1,1,2,2,2,2,7,9,10};
		int[] d={3};
		//mergeLists(a, b);
		//removeDuplicates(a);
		//intersectionLists(b, d);
		//removeElement(c, 5);
		//System.out.println(Arrays.binarySearch(c,1,3,2));
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> bl=new ArrayList<>();
		al.add(21);
		al.add(22);
		al.add(23);
		
		al.add(null);
		bl.add(22);
		al.trimToSize();
		//al.removeAll(bl);
		//Collections.binarySearch(al.subList(0, 3),);
		System.out.println(al.size());
		

	}

}
