package com.kony.hackerearth;

import java.util.Scanner;

public class FindB {
	
	static Scanner sc=new Scanner(System.in);
	static int A[]=new int[102];
	static int B[]=new int[102];
	static int C[]=new int[102];
	
	public static int[] toArray(String str){
		int k,min=100,max=0;
		String[] p=str.split(" ");
		int[] input=new int[102];
	    for(int i=0;i<p.length;i++){
	    	k=Integer.parseInt(p[i]);
		input[k]=1;  
		min=min>=k?k:min;
		max=max>=k?max:k;
	  }
	    input[0]=min;
	    input[101]=max;
	  return input;
	}
	
	

	public static void main(String[] args) {
		
		int alen=sc.nextInt();
		sc.nextLine();
		A=toArray(sc.nextLine());
		int clen=sc.nextInt();
		sc.nextLine();
		C=toArray(sc.nextLine());
		int bmin=C[0]-A[0],bmax=C[101]-A[101];
		for(int x=A[0];x<=A[101];x++){
			for(int y=bmin;y<=bmax;y++)
			{
				if(C[x+y]==1)B[y]=1;
			}
		}
		
		for(int i=bmin;i<=bmax;i++)
		  if(i==bmax)System.out.print(i);
		  else if(B[i]==1)System.out.print(i+" ");

	}

}
