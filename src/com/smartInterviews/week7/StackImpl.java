package com.smartInterviews.week7;

import java.util.ArrayList;
import java.util.Scanner;

public class StackImpl {

	static Scanner sc=new Scanner(System.in);
	static ArrayList<Integer> st=new ArrayList<>();
	static int top=-1;
	
	public static void pushOp(int e)
	{
		top++;
		st.add(top,e);
	}
	
	public static void popOp()
	{
		if(top>=0)
		{
			System.out.println(st.get(top));
		    top--;
		}
		else{
			System.out.println("Empty");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
			String[] arg=sc.nextLine().split(" ");
			switch(arg[0])
			{
			case "push":pushOp(Integer.parseInt(arg[1]));break;
			case "pop":popOp();break;
			}
		}
		
		

	}

}
