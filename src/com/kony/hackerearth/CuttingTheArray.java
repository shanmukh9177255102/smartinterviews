package com.kony.hackerearth;

public class CuttingTheArray {

	public static int m=Integer.MAX_VALUE;
	public static int[] points;
	public static long divisors(int n)
	{
		long count=0,rt=(long)Math.sqrt(n);
		for(long i=1;i<=rt;i++)
		{
			if(n%i==0)count+=2;
		}
		if(Math.pow(rt,2)==n)count--;
		return count;
	}
	public static void computeSubset(int[] arr,int index,int[] cutpoints,int cutlen,int k)
	{
		if(cutlen==k)
		{	int j=0,sum=0,temp=0;
			for(int i=0;i<arr.length;i++)
			{	
			sum+=arr[i];
			if(j<cutlen && cutpoints[j]==(i+1)){ j++;temp+=divisors(sum);sum=0;}
			}
			temp+=divisors(sum);
		    if(m>temp){
		    	points=cutpoints;
		    	m=temp;
		    	for(int i=0;i<cutpoints.length;i++)System.out.print(cutpoints[i]+"#");
		    	System.out.println();
		    }
		    
		}
		else if(index < arr.length){
		// include
		cutpoints[cutlen]=index+1;
		computeSubset(arr,index+1,cutpoints,cutlen+1,k);
		
		computeSubset(arr,index+1,cutpoints,cutlen,k);
				}

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3};
		points=new int[1];
		computeSubset(arr,0,new int[arr.length],0,1);
		
		//for(int i=0;i<points.length;i++)System.out.println(points[i]);

	}

}
