package com.kony.hackerearth;

import java.util.Scanner;

public class Pikachu2 {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int i,j;
        String[] s=sc.nextLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        String[] input=sc.nextLine().split(" ");
        int[] temp=new int[n];
        int[][] modifying=new int[n][n];
        for(i=0;i<n;i++){
        	int p=Integer.parseInt(input[i]);
        	modifying[0][i]=p;
        	temp[i]=p;
        }
        int count=1;
        System.out.print(modifying[0][0]+" ");
        
        for(i=1;i<=b;i++){
        	for(j=0;j<n-i;j++)
        	 { 
        		modifying[i][j]=modifying[i-1][j] | modifying[i-1][j+1];
        	 if(i==b)
        	 {
        		 if(count==n-1){System.out.print(modifying[i][j]);break;}
        		 else System.out.print(modifying[i][j]+" ");
        	     count++;
        	 }
        	 }
        	if(i!=b)
        	{
        		if(count==n-1)
        		{System.out.print(modifying[i][0]);break;}
        		else System.out.print(modifying[i][0]+" ");
        		count++;
        		}
        }
        
		sc.close();
	}

}
