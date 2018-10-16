package com.smartInterviews.hackerrank;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MatrixMult {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
    public static void printM(int[][] a,int m){
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(j==m-1)System.out.println(a[i][j]);
				else System.out.print(a[i][j]+" ");
			}
		}
	}
	
	public static long aPowb(long a,long b){
		
		if(b==1)return a;
		if(b==0)return 1;
		if(b%2!=0)return a*aPowb(a,b-1);
		else return aPowb(aPowb(a, b/2),2);
		
	}
    public static long flipBits(long a,long b){
		
    	long p,q,count=0;
    	while(a>0|| b>0){
    		 p= a & 1;
    		 q= b & 1;
    		 count+=(p ^ q);
    		 a=a>>1;b=b>>1;
    	}
    	return count;
	}
    public static int reverseBits(int no){
    	
    	
    	return 0;
    }
	
	public static long lcm(long a,long b){
		
		return (a*b)/gcd(a,b);
	}
	public static long gcd(long a,long b){
		
		if(a==b || a%b==0 || b==1)return b;
		if(b>a)return gcd(b,a);
		else return gcd(a%b,b);
	}
	
	
	public static int NonRepNumber(int[] arr,int n){
		
		int res=n,r=arr[0];
		for(int i=1;i<n;i++){
			r^=arr[i];
		}
		n--;
		while(n!=1){
			res^=n;
			n--;
		}
		
		return r^res;
	}
	public static void printSpiral(){
	
		int i=0,j=0;
		int order=Integer.parseInt(sc.nextLine());
		if(order==1){System.out.println(sc.nextLine()); }
		else{
			int[][] a=new int[order][order];
			boolean[][] b=new boolean[order][order];
		for(j=0;j<order;j++)a[j]=s2iA(sc.nextLine().split(" "));j=0;
		
		//core logic
		while(true)
		{
			if(j+1==order)break;
		  //System.out.println(i+","+j);
		if(b[i][j+1]){if(order%2!=0)System.out.println(a[i][j]);break;}
		
		// L-R
		while(j<order && !b[i][j]){System.out.print(a[i][j]+" ");b[i][j]=true;j++;}j--;i++;
		
		// T-B
		while(i<order && !b[i][j]){System.out.print(a[i][j]+" ");b[i][j]=true;i++;}i--;j--;
		
		//R-L
		while(j>=0 && !b[i][j])   {System.out.print(a[i][j]+" ");b[i][j]=true;j--;}i--;j++;
		
		//B-T
		while(i>=0 && !b[i][j])   {System.out.print(a[i][j]+" ");b[i][j]=true;i--;}i++;j++;
		}
	
		}
	}
	
	public static void printM(int[][] res,int r,int c){
		
		for(int i=0;i<r;i++)
			{
			for(int j=0;j<c;j++)
			
				{
				  System.out.print(res[i][j]);
		          if(j!=c-1)System.out.print(" ");
				}
			if(i!=r-1)System.out.println("");
				
	}
	}
	public static void multiply(int a[][],int b[][],int n1,int m1,int n2,int m2){
		
		int[][] c=new int[n1][m2];
		for(int i=0;i<n1;i++)
			for(int j=0;j<m2;j++)
				for(int k=0;k<n2;k++)
					c[i][j]+=(a[i][k]*b[k][j]);
		
		printM(c,n1,m2);
	}
	
	public static void matrixMultiplication(){
		int j;
		int[] order1=s2iA(sc.nextLine().split(" "));
		int[][] a=new int[order1[0]][order1[1]];
		for(j=0;j<order1[0];j++)a[j]=s2iA(sc.nextLine().split(" "));
		
		int[] order2=s2iA(sc.nextLine().split(" "));
		int[][] b=new int[order2[0]][order2[1]];
		for(j=0;j<order2[0];j++)b[j]=s2iA(sc.nextLine().split(" "));
	
		multiply(a, b, order1[0],order1[1],order2[0], order2[1]);
	}
	
	public static void printDiagonal(){
		int j,i,gbli,gblj,counter=0;
		int order=Integer.parseInt(sc.nextLine());
		int[][] a=new int[order][order];
		for(j=0;j<order;j++)a[j]=s2iA(sc.nextLine().split(" "));
		gbli=0;gblj=order-1;
		while(true){
			counter=0;
			i=gbli;j=gblj;
			while(j<order && i<order){ counter+=a[i][j];j++;i++;}
			System.out.print(counter);
			if(gbli==order-1)break;
			else System.out.print(" ");
			if(gblj==0)gbli++;
			else gblj--;
			
		}
	}
    public static String binaryRepresentation(int no){
		
		StringBuilder sb=new StringBuilder();
		int temp;
		if(no==0)return "0";
		while(no!=0){
			temp =no & 1;
			sb.append(temp);
			no=no>>1;
		}
		
		return sb.reverse().toString();
	}
    public static String isPowerOf2(long no){
		
		long res= no & no-1;
		return res==0?"True":"False";
	}
 // Function to return trailing 
 // 0s in factorial of n
 public static int findTrailingZeros(long n)
 {
     // Initialize result
     int count = 0;
  
     // Keep dividing n by powers of 
     // 5 and update count
     for (int i = 5; n / i >= 1; i *= 5)
         count += n / i;
  
     return count;
 }
 
    public static  int[] stick(int[] a)
    {
    	TreeMap<Integer,Integer> t=new TreeMap<Integer,Integer>();
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	for(int i=0;i<a.length;i++)
    	{
    		if(t.get(a[i])!=null)
    		{
    			t.put(a[i],t.get(a[i])+1);
    		}
    		else t.put(a[i],1);
    	}
    	
    	//for(Map.Entry<Integer, Integer> m:t.entrySet())System.out.println(m.getKey()+","+m.getValue());
    	int stickcut;
    	while(t.size()>0)
    	{
    		stickcut=0;
    		Map.Entry<Integer, Integer> temp=(Entry<Integer, Integer>) t.entrySet().toArray()[0];
    		int k=temp.getKey();
    		int val=temp.getValue();
    		t.remove(k);
    		stickcut+=val;
    		TreeMap<Integer,Integer> tr=new TreeMap<Integer,Integer>();
    		for(Map.Entry<Integer, Integer> m:t.entrySet())
        		{
    			//System.out.println(m.getKey()+","+m.getValue());
    			int tem=m.getKey();
    			int v=m.getValue();
    			stickcut+=v;
    			if(tem-k>0)tr.put(tem-k,v);
        		}
    		al.add(stickcut);
    		t=tr;
    	}
    	int[] arr = new int[al.size()];
        for(int i=0;i<al.size();i++)
        	arr[i]=al.get(i);
        return arr;
    }
	public static void main(String[] args) {
		//int t=sc.nextInt();
		int i,j,temp,p,q;
		
		//for(i=1;i<=t;i++){		System.out.println(findTrailingZeros(sc.nextInt()));}
		
          int[] n=new int[]{1,2,3,4,3,3,2,1};
          stick(n);
	}

}
