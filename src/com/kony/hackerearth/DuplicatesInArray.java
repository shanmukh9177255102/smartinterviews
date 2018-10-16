package com.kony.hackerearth;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicatesInArray {
	static long masterNos=0,stackMdata=0;
    static Queue<Integer> q=new LinkedList<Integer>();
	public static void markNumber(int no){
		long temp=masterNos>>no;
		int val=(int)(temp & 1);
		if(val!=0)
			{
			//System.out.println("existing.."+no);
			long temp1=stackMdata>>no;
			if(( temp1 & 1)==0){
				//q.add(no);
				
				stackMdata=(temp1 | 1) << no | stackMdata;
			};
			//stackMdata=stackMdata 
			masterNos=temp<<no | masterNos;
			}
		else
		{
			temp=temp | 1;
			//q.add(no);
			System.out.println(no);
			masterNos=temp<<no | masterNos;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int arr[]={5,2,4,2,3,4,5,4,5,5};
		for(i=0;i<arr.length;i++){
			markNumber(arr[i]);
		}

	}
}
