package com.kony.hackerearth;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class nosIndex{
	int no;int index;
	public nosIndex(int no,int index) {
		// TODO Auto-generated constructor stub
		this.no=no;this.index=index;
	}
};
public class sortNosOnZerosInBinary implements Comparator<nosIndex>{
	static int arr[]={5,4,1,2,12,14,7},auxarr[];

		@Override
		public int compare(nosIndex o1, nosIndex o2) {
			
			return auxarr[o1.index]-auxarr[o2.index];
		}
	public static int countZeros(int no){
		int count;
		count=0;
		while(no>0)
			{
				count += (no & 1)==0?1:0;
				no=no>>1;
			}
			//System.out.println(count);
			return count;
	}
	public static void main(String[] args) {
		//countZeros(10);
		int i;
		List<nosIndex> l=new LinkedList<nosIndex>();
		auxarr=new int[arr.length];
		for(i=0;i<auxarr.length;i++){
			auxarr[i]=countZeros(arr[i]);
			l.add(new nosIndex(arr[i],i));
		}
		//System.out.println("size:"+l.size());
		Collections.sort(l,new sortNosOnZerosInBinary());
		for(nosIndex k:l){
			System.out.println(k.no);
		}
	}
}
