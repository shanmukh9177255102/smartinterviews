package com.smartInterviews.hackerrank;

import java.util.Scanner;

public class RotateMatrix90 {
	
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
	public static void main(String[] args) {
		
		int t=sc.nextInt();
		int i,j,temp,p,q;
		sc.nextLine();
		for(i=1;i<=t;i++){
			
			int m=Integer.parseInt(sc.nextLine());
			int[][] a=new int[m][m];
			int[][] trans=new int[m][m];
			
			for(j=0;j<m;j++)a[j]=s2iA(sc.nextLine().split(" "));
			
			for(int r=0;r<m;r++)
			for(int s=0;s<m;s++)
			trans[r][s]=a[s][r];
		
			System.out.println("Test Case #"+i+":");
			a=trans;
			
			for(int ip=0;ip<m;ip++)
			{
				p=0;q=m-1;
				while(p<q){
					temp=a[ip][p];a[ip][p]=a[ip][q];a[ip][q]=temp;p++;q--;
				}
			}
			printM(a,m);
			
			
			
		}
		
	
		
		

	}

}
