package com.kony.hackerearth;

import java.util.Scanner;

public class ModulofermatesTheorem {

	static Scanner sc=new Scanner(System.in);
	static int p,count=0,l=0;
	static int[][] X;
	
	public static int power(int a1,int b){
		int t=a1,a=a1;
		X[a1][1]=a1;
		if(X[a1][b-1]!=0)
		    X[a1][b]=(X[a1][b-1]*a1)%p;
				return X[a1][b];
	}
	
	public static int expdigit(int no,int pow){
	
		int[][] a={ {0},{1},{2,4,8,6},{3,9,7,1},{4,6},{5},{6},{7,9,3,1},{8,4,2,6},{9,1}};
		
		int r=no%10;
		int len=a[r].length;
		
		return a[r][pow%len];
		
	}
	public static int po(int k){
		
	 int xval,yval,zval;
	 
	 for(int z=1;z<p;z++)
	 {
		 zval=expdigit(z,k);
	 for(int x=1;x<p;x++)for(int y=1;y<p;y++)
	 { 
		 if((z%2==0 && ((x%2==0 && y%2==0) || (x%2!=0 && y%2!=0))) || (zval%2!=0 && (x%2!=0 || y%2!=0)))
				 { 
			xval=expdigit(x,k);
	        yval=expdigit(y,k);
	        if(zval%p==(xval + yval)%p)
	        {
	        	//System.out.println("x:"+x+",y:"+y+",z:"+z);
		        //System.out.println("xval:"+xval+",yval:"+yval+",zval:"+zval);
	            return 1;
	        }
				
				 }
	 }	
	 }
	 return 0;
	}
	public static void main(String[] args) {
	
	   String[] s=sc.nextLine().split(" ");
	   p=Integer.parseInt(s[0]);
	   l=Integer.parseInt(s[1]);
	   X=new int[p+2][l+2];
	   for(int k=1;k<=l;k++){
		   //System.out.println("####k:"+k+"###############");
		   count+=po(k);
	   }
	   System.out.println(count);

	}

}
