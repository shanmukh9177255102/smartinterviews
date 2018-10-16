package com.kony.hackerearth;

import java.util.Arrays;
import java.util.HashMap;

public class MultipleCodes {

	public static long reverseBinary(long no){
		
		long point,result=0;
		while(no>0)
		{
		point=no & no-1;
		long p=(long) ((long)Math.log(no-point)/Math.log(2));
		result=(result | (31-p)<<1);
		no=point;
		}
		return result;
	}
	
	public static void TowersHanoi(int n,char st,char dst,char temp)
	{
		if(n==0)return;
		TowersHanoi(n-1, st, temp, dst);
		System.out.println("Move "+n+" from "+st+" to "+dst);
		TowersHanoi(n-1, temp,dst,st);
		
	}
	public static int swapAdjBits(int no)
	{
		int evenmask=0x55555555;
		
		int e=no & evenmask;
		int o=no & (1<<evenmask | 1);
	    int res= 1<<e | o>>1;
		return res;
	}
	public static void repeatedNo(int[] arr)
	{
		int i,j,res=0,ar=0;
		
		for(i=1;i<=arr.length-2;i++)
			res=res^i;
		for(j=0;j<arr.length;j++)
			ar=ar^arr[j];
		
		// xor of 2 repeating elements
		int p=0,q=0,temp=res^ar;
		
		int r=(int) (Math.log(temp-(temp & temp-1))/Math.log(2));
		//xor of all r-bit set & reset ->(p,q)
	
		for(i=0;i<arr.length;i++)
		{
		if((arr[i]>>r & 1) ==1)p=p^arr[i];
		else q=q^arr[i];
		}
		//System.out.println(p+","+q);
		
		int m=0,n=0;
		for(i=1;i<=arr.length-2;i++)
		{
			if((i>>r & 1) ==1)m=m^i;
			else n=n^i;
			
		}
		p=p^m;q=q^n;
		if(p<q)System.out.println(p+" "+q);
		else System.out.println(q+" "+p);
	}
	public static int countBubblesortSwaps(int[] arr)
	{
		int temp,count=0;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[i];arr[i]=arr[j];arr[j]=temp;
					count++;
				}
			}
		return count;
	}
	public static boolean sumOfPairs(int[] arr,int k)
	{
		int temp,start=0,end=arr.length-1;
		while(start<end){
			temp=arr[start]+arr[end];
			if(temp==k)return true;
			if(temp>k)end--;
			else start++;
		}
		return false;
	}
	public static int tripleDouble(int[] arr)
	{
		//every ele 3 times except 1 element which occurs 1 time..
		int len=arr.length;
		
		// xor of distinct elements of set..
		int i,j,o=1,e=0,bitlevel=0,evens,odds;
		int[] modarray = null;
		while(len!=1)
		{
			evens=0;odds=0;
		for(i=0;i<len;i++)
			odds+= o & (arr[i]>>bitlevel);
		
		if(odds==0 || odds==len){bitlevel++;continue;}
		if(odds%3==1)
		{
			modarray=new int[odds];j=0;
			for(i=0;i<len;i++)
			 if((arr[i]>>bitlevel & o) == 1)modarray[j++]=arr[i];
		}
	    if((len-odds)%3==1)
	    {
	    	modarray=new int[len-odds];j=0;
	    	for(i=0;i<len;i++)
			 if((arr[i]>>bitlevel & o) == 0)modarray[j++]=arr[i];
	    }
	    bitlevel++;
		arr=modarray;
		len=arr.length;
		if(len==1)return arr[0];
		}
		
		return 0;
	}
	
	// ip:5 15 3
	/*op: 
	 3
	 3 5
	 3 5 15
	 3 15
	 5
	 5 15
	 15
	 */
	public static void recursLexiOrder(int[] arr,int[] flags,int start,int curindex)
	{
		if(curindex==arr.length)return;
		flags[curindex]=1;
		for(int i=0;i<curindex+1;i++)
		{
			if(flags[i]==1 && curindex!=i)System.out.print(arr[i]+" ");
			if(flags[i]==1 && curindex==i)System.out.println(arr[i]);
		}
		//System.out.println();
		recursLexiOrder(arr, flags, start,curindex+1);
	    flags[curindex]=0;
		recursLexiOrder(arr, flags, start,curindex+1);
	    
	}
	public static void printLexiOrderUnsortedArr(int[] arr)
	{
		Arrays.sort(arr);
		int[] flags=new int[arr.length];
		recursLexiOrder(arr,flags,0,0);
	}
	
	public static void InsertionSortAdhoc(int[] a)
	{
		int i,j,k;
		for(i=0;i<a.length;i++)
		{
			
			for(j=0;j<a.length;j++)
			{
				
			}
		}
	}
	
	public static void SelectionSortAdhoc(int[] a)
	{
		int i,j,max,t,maxIndex;
		for(i=0;i<a.length;i++)
		{
			max=0;maxIndex=-1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
					maxIndex=j;
				}
			}
			if(maxIndex!=-1)
			{
			t=a[i];
			a[i]=a[maxIndex];
			a[maxIndex]=t;
			System.out.println(maxIndex+" "+i);
			}
		}
	}
	
	public static int BSR(int[] a,int l,int h,int ele)
	{
		if(l>=h) 
		{ 
			if(a[l]==ele)return h+1;
			if(l==0 && a[l]>ele)return 0;
			if(l==a.length-1 && a[l]<ele)return a.length;
			else return h+1;
		    
		}
		int m=l+(h-l)/2;
		if(a[m]==ele)return m;
		if(a[m]>ele)return BSR(a, l, m-1, ele);
		else return BSR(a, m+1, h, ele);
	}
	
	
	public static boolean tripletK(int[] a,int k)
	{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
				if(a[i]+a[j]<k)
				{
					if(BSTR(a,0,a.length-1,k-a[i]-a[j])!=-1)return true;
				}
		
		return false;
	}
	
	public static int BSTR(int[] a,int l,int h,int ele)
	{
		if(l>=h) 
		{ 
			return -1;    
		}
		int m=l+(h-l)/2;
		if(a[m]==ele)return m;
		if(a[m]>ele)return BSR(a, l, m-1, ele);
		else return BSR(a, m+1, h, ele);
	}
	public static boolean DifferenceK(int[] a,int k)
	{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(BSTR(a,0,a.length-1,k-a[i])!=-1)return true;
		}
		return false;
	}
	public static int powerGame(int[] a,int[] b)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		int i,j,rem=0,wins=0;
		int s=0,e=b.length-1;
		for(i=0;i<a.length;i++)
		{
			int bres=BSR(b,s,e,a[i]);
			System.out.println(bres+" from "+a[i]);
			int temp=bres-rem;
			if(temp>0)wins+=temp;
			rem=bres;
		}
		return wins;
	}
	public static void sortNosByFrquency(int[] a)
	{
		// -1000 a[i]  1000
		
		
	}
	
	
	public static void noOfOccurences(int[] a,int[] q)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			temp=hm.get(a[i]);
			if(hm.get(a[i])!=null)hm.put(a[i],1);
			else hm.put(a[i],temp+1);
		}
		
		for(int i=0;i<q.length;i++)
		{
			if(hm.get(q[i])!=null)System.out.println(hm.get(q[i]));
			else System.out.println(0);
		}
	}
	
	
	public static void flipFootball(int[] a)
	{
		int[] p=new int[118];
		int i,j,base;
		for(i=0;i<118;i++)p[i]=0;
		for(i=0;i<a.length;i++)
		{
			int r=0;
			base=a[i]+48;
			if(p[base]==0)p[base]=1;
			else
			{
			if(p[base+1]==0 || p[base-1]==0)
				{
				if(p[base+1]==0 && p[base-1]==0)
					p[base+1]=1;
				else if(p[base+1]==0)
					p[base+1]=1;
				else if(p[base-1]==0)
			    	p[base-1]=1;
				}
			    
			    else 
			    	{
			    	p[base]++;
			    	int rbase=base,lbase=base;
			    		// right..
			    		if(p[rbase+1]<(p[rbase]-1))
			    		  {
			    			while(p[rbase+1]<p[rbase] && p[rbase+1]>0)rbase++;
			    		    rbase++;
			    		    p[rbase]++;
			    		    p[base]--;
			    		  }	
			    	   else if((p[lbase-1])<(p[lbase]-1))
			    	  {
			    		// left..
			    		while(p[lbase]>p[lbase-1] && p[lbase-1]>0)lbase--;
			    		lbase--;
			    		p[lbase]++;p[base]--;
			    	  }
			    	}
			    	}
			}
		printFootBallSeq(p);
		}
		
		
		
		
	private static void printFootBallSeq(int[] p) {
		
		int i,j,maxindex=0,maxval=0,r=-1;
		for(i=0;i<118;i++)
		{
			if(p[i]==1)maxindex=i;
		    maxval=maxval>p[i]?maxval:p[i];
		    if(r==-1 && p[i]>0){ r=i;}
		}
		for(j=maxval;j>0;j--)
		{   
			for(i=r;i<=maxindex;i++)
			 {
				if(p[i]==j){System.out.print("O");p[i]--;}
			    else System.out.print(".");
			 }
			System.out.println();
			 
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,3,15};
		int[] np={3,4,3,3,2,2,2,4,4,0};
		int[] repno={1,3,2,3,4,6,5,5};//{1,5,2,8,1,4,7,4,3,6}
		int[] sadhoc={176,-272,-272,-45,269 ,-327 ,-945, 176};
		int[] football={0,1,2,1};//{0,0,0,20,20,20};//{0,1,2,1,1};
		int[] a={1,5,7,4};//{2,3};//{3,7,10};//
		int[] b={3,8,2,10};//{10,5};//{5,20,15};
		
		//System.out.println(tripleDouble(np));
		//printLexiOrderUnsortedArr(arr);
		//repeatedNo(repno);
		//SelectionSortAdhoc(sadhoc);
		//flipFootball(football);
		//System.out.println(powerGame(a, b));
		System.out.println(1<<30);

	}

}
