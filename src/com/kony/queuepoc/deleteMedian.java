package com.kony.queuepoc;

import java.util.ArrayList;
import java.util.Iterator;

public class deleteMedian {

	static int minlen=0,maxlen=0;
	static ArrayList<Integer> minHeap=new ArrayList<Integer>();
	static ArrayList<Integer> maxHeap=new ArrayList<Integer>();
	
	public static void printMinHeap(){
		System.out.println("--minHeap--");
		int len=minlen;
		Iterator<Integer> iter= minHeap.iterator();
		while(iter.hasNext()&& len>0){
			System.out.print(iter.next()+",");len--;
		}
		System.out.println("***");
	}
	
	public static void printMaxHeap(){
		System.out.println("--maxHeap--");int len=maxlen;
		Iterator<Integer> iter= maxHeap.iterator();
		while(iter.hasNext()&& len>0){
			System.out.print(iter.next()+",");len--;
		}
		System.out.println("***");
	}
	
    public static void buildMinHeap()
    {
    	for(int i=minlen-1;i>=minlen/2;i--)
    	{
    		minHeapify(i);
    		//printHeap();
    		
    	}
    	//printMinHeap();
    }
    public static void buildMaxHeap()
    {
    	for(int i=maxlen-1;i>=maxlen/2;i--)
    	{
    		maxHeapify(i);
    		//printHeap();
    		
    	}
    	//printMaxHeap();
    }
    public static int extractMax(){
    	//buildMaxHeap();
    	int temp=maxHeap.get(0);
    	maxHeap.set(0,maxHeap.get(maxlen-1));
    	maxHeap.set(maxlen-1,temp);
    	//maxlen--;
    	//buildMaxHeap();
    	//printHeap();
        return temp;	
    }
    public static int extractMin(){
    	//buildMinHeap();
    	int temp=minHeap.get(0);
    	minHeap.set(0,minHeap.get(minlen-1));
    	minHeap.set(minlen-1,temp);
    	//minlen--;
    	//buildMinHeap();
    	//printHeap();
        return temp;	
    }
    public static float extractMedian(){
    	if(minlen>maxlen){
    		return extractMin();
    	}
    	if(minlen<maxlen){
    		return extractMax();
    	}
    	else
    	{
    		return (float)(extractMax()+extractMin())/2;
    	}
    }

    public static void minHeapify(int i)
    {
    	int parentIndex,temp;
    	parentIndex=(i-1)/2;
		if(minHeap.get(parentIndex)>=minHeap.get(i)){
			temp=minHeap.get(i);
			minHeap.set(i,minHeap.get(parentIndex));
			minHeap.set(parentIndex,temp);
		}
		if(parentIndex>=1)
			minHeapify(parentIndex);
    }
    
    public static void maxHeapify(int i)
    {
    	int parentIndex,temp;
    	parentIndex=(i-1)/2;
		if(maxHeap.get(parentIndex)<=maxHeap.get(i)){
			temp=maxHeap.get(i);
			maxHeap.set(i,maxHeap.get(parentIndex));
			maxHeap.set(parentIndex,temp);
		}
		if(parentIndex>=1)
			maxHeapify(parentIndex);
    }
    
     // firsthalf -maxheap
    //secondhalf -minheap
    public static void addElementToHeap(int ele){
    	int temp;
    	if(maxlen==0 || minlen==0)
    	{
        if(maxlen ==0){maxHeap.add(ele);maxlen++;}
        else if(minlen ==0){minHeap.add(ele);minlen++;}
    	}
    	else
    		{
    		if(maxHeap.get(maxlen/2)>=ele)
    		{
    		maxHeap.add(maxlen,ele);maxlen++;
    	    }
    		else{
    		minHeap.add(minlen,ele);minlen++;
    		}
    		}
    	//System.out.println("len1:"+minlen+","+maxlen);
    	if(maxlen==minlen-1){
    	}
    	else{
    		if(maxlen<minlen){
    		while(maxlen<minlen){
    		temp=extractMin();
    		maxHeap.add(maxlen,temp);
    		maxlen++;minlen--;
    		//System.out.println(minlen+","+maxlen);
    	}
    		//System.out.println("lenMID:"+minlen+","+maxlen);
    	}
    	else if(minlen<maxlen-1)
    	{
    		while(minlen<maxlen-1){
        		temp=extractMax();
        		minHeap.add(minlen,temp);
        		minlen++;maxlen--;
        	}
    	}
    	}
    	buildMaxHeap();
    	buildMinHeap();
    	//System.out.println("len.."+minlen+","+maxlen);
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={9,5,6,7,3,2,1,4,8,10};
		for(int i=0;i<arr.length;i++)
		addElementToHeap(arr[i]);
		printMaxHeap();
		printMinHeap();
	   System.out.println(extractMedian());
	}

}
