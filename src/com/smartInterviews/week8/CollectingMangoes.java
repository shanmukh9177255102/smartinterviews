package com.smartInterviews.week8;

import java.util.Scanner;
import java.util.Stack;


/*
2
7
A 10
A 5
Q
A 100
Q
R
Q
6
A 5
Q
R
Q
R
R
 */
public class CollectingMangoes {

	static Scanner sc=new Scanner(System.in);
	static Stack<Integer> nostack;
	static Stack<Integer> maxstack;
	static int maxval=Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ele=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			nostack=new Stack<Integer>();
			maxstack=new Stack<Integer>();
			maxval=Integer.MIN_VALUE;
			int k=sc.nextInt();
			sc.nextLine();
			System.out.println("Case "+(i+1)+":");
			for(int j=0;j<k;j++)
			{
				
				String[] ips=sc.nextLine().split(" ");
				
		         switch(ips[0].charAt(0))
		        {
		
		    case 'A':
			ele=Integer.parseInt(ips[1]);
			nostack.push(ele);
			maxval=maxval>=ele?maxval:ele;
		    maxstack.push(maxval);
		    break;
		
		    case 'R':
		   if(!maxstack.isEmpty())
		   {
		   nostack.pop();
		   maxstack.pop();
		   }
		    break;
		
		     case 'Q':
		      
		      System.out.println(maxstack.isEmpty()?"Empty":maxstack.peek());
		       break;
		}
		
			}
		}

	}

}
