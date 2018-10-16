package com.kony.hackerearth;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class minComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		
		if(arg0==arg1)return 0;
		else return arg0>arg1?1:-1;
	}
	
}
class maxComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		
		if(arg0==arg1)return 0;
		else return arg0<arg1?1:-1;
	}
	
}

public class CureSkinHiring {
	static Queue<Integer> query=new LinkedList<Integer>();
	static HashMap<Integer,Long> hm=new HashMap<Integer, Long>(); 
	static PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(new maxComparator());
	static PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>(new minComparator());
    static int minlen=0,maxlen=0,sum=0;
	public static void printMinHeap(){
		System.out.println("--minHeap--");
		int temp;
		Iterator<Integer> iter= minHeap.iterator();
		while(iter.hasNext()){
			temp=iter.next();
			sum+=temp;
			System.out.print(temp+",");
			
		}
		System.out.println("***");
	}
	public static void printArry(){
		System.out.println("--maxHeap--");
		while(!query.isEmpty())
		System.out.println(hm.get(query.poll()));
	}
	public static void addAndDeleteEle(){
		int min=minHeap.poll();
		int max=maxHeap.poll();
		int temp=Math.abs(max-min);
		maxHeap.add(temp);minHeap.add(temp);
		maxHeap.remove(min);minHeap.remove(max);
		sum=sum+temp-max-min;
	}
	
	public static void readInput(){
		Scanner s = new Scanner(System.in);int temp,i,max=0;
        String[] name = s.nextLine().split(" ");
        String[] input=s.nextLine().split(" ");
        for(i=0;i<input.length;i++)
		{
         temp=Integer.valueOf(input[i]);
		 maxHeap.add(temp);
		 minHeap.add(temp);
		 sum+=temp;
		 }
        for(i=0;i<Integer.parseInt(name[1]);i++)
        	{
        	temp=s.nextInt();
        	max=max>=temp?max:temp;
        	query.add(temp);
        	}
        for(i=0;i<max;i++){
        	addAndDeleteEle();
           hm.put(i+1,(long)sum);
        }
        printArry();
        s.close();
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readInput();

	}
}
