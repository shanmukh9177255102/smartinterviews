package com.kony.sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class Quicksort {
      static ArrayList<Integer> input=new ArrayList<Integer>();
      static int pivotIndex=0;

      public static void printArray(){
  		System.out.println("--Array--");
  		Iterator<Integer> iter= input.iterator();
  		while(iter.hasNext()){
  			System.out.print(iter.next()+",");
  		}
  		System.out.println("***");
  	}
	public static int partition(int start,int end)
	{
		
		System.out.println(start+".."+end);
		pivotIndex=(start+end)/2;
		System.out.println("pivot:"+input.get(pivotIndex));
		int temp,pivotEle=input.get(pivotIndex);
		while(start<end)
		{
		while(input.get(start)<=pivotEle)start++;
		while(input.get(end)>pivotEle)end--;
		if(start<end)
		{
		temp=input.get(start);
		input.set(start,input.get(end));
		input.set(end,temp);
		}
		}
		
		input.set(pivotIndex,input.get(end));
		input.set(end,pivotEle);
		System.out.println("--");
		//printArray();
		//System.out.println("start:"+start+",end:"+end+",pivot:"+pivotIndex);
		//System.out.println("startItem:"+input.get(start)+",endItem:"+input.get(end)+",pivot:"+input.get(pivotIndex));
		/*temp=input.get(end);
		input.set(end,input.get(pivotIndex));
		input.set(start,temp);*/
		printArray();
		return end;
	}
	
	public static void quicksortFun(int start,int end){
		if(start<end)
		{
		int part=partition(start,end);
		System.out.println("part:"+part);
		quicksortFun(start,part-1);
		quicksortFun(part+1,end);
		}
	}
	
	public static void main(String[] args) {
	
	int[] arr={9,4,6,2,7,5,3,10};
	for(int i:arr)input.add(i);
	quicksortFun(0,input.size()-1);
	//printArray();
	}

}
