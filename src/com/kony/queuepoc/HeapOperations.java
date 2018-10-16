package com.kony.queuepoc;

public class HeapOperations {

	static int minHeap[],maxHeap[],minlen,maxlen,minTomaxIndex,maxTominIndex;
	public static void printHeap(){
		for(int i=0;i<maxHeap.length;i++){
			System.out.print(maxHeap[i]+",");
		}
		System.out.println("");
	}
    public static void buildMinHeap()
    {
    	for(int i=minlen-1;i>=minlen/2;i--)
    	{
    		minHeapify(i);
    		//printHeap();
    		
    	}
    }
    public static void indexInMinHeap(int maxEle){
    	for(int i=minlen-1;i>=minlen/2;i++){
    		if(minHeap[i]==maxEle)maxTominIndex=i;
    	}
    }
    public static void indexInMaxHeap(int minEle){
    	for(int i=maxlen-1;i>=maxlen/2;i++){
    		if(maxHeap[i]==minEle)minTomaxIndex=i;
    	}
    }
    public static void buildMaxHeap()
    {
    	//int len=minHeap.length;
    	for(int i=maxlen-1;i>=maxlen/2;i--)
    	{
    		maxHeapify(i);
    		//printHeap();
    		
    	}
    }
    public static int deleteMax(){
    	
    	int temp=maxHeap[0];
    	maxHeap[0]=maxHeap[maxlen-1];
    	maxHeap[maxHeap.length-1]=temp;
    	maxlen--;
    	buildMaxHeap();
    	//printHeap();
        return temp;	
    }
    public static int deleteMin(){
    	int temp=minHeap[0];
    	minHeap[0]=minHeap[minlen-1];
    	minHeap[minHeap.length-1]=temp;
    	minlen--;
    	buildMinHeap();
    	//printHeap();
        return temp;	
    }
    public static void minHeapify(int i)
    {
    	int parentIndex,temp;
    	parentIndex=(i-1)/2;
		if(minHeap[parentIndex]>=minHeap[i]){
			temp=minHeap[i];
			minHeap[i]=minHeap[parentIndex];
			minHeap[parentIndex]=temp;
		}
		if(parentIndex>=1)
			minHeapify(parentIndex);
    }
    public static void maxHeapify(int i)
    {
    	int parentIndex,temp;
    	parentIndex=(i-1)/2;
		if(maxHeap[parentIndex]<=maxHeap[i]){
			temp=maxHeap[i];
			maxHeap[i]=minHeap[parentIndex];
			maxHeap[parentIndex]=temp;
		}
		if(parentIndex>=1)
			maxHeapify(parentIndex);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempArr[]={10, 9, 1, 2 ,3 ,4 ,5, 6, 7, 8};
		minHeap=tempArr;minlen=minHeap.length;
		maxHeap=tempArr;maxlen=maxHeap.length;
		buildMaxHeap();
		//buildMaxHeap();
		while(maxlen>0)System.out.println(deleteMax());
		//printHeap();
          
	}
}
