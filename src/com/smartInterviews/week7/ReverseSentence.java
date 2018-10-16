package com.smartInterviews.week7;

import java.util.Stack;

public class ReverseSentence {

	
	
	public static void reverseSentence(String ip)
	{
		
		Stack<String> s=new Stack<>();
		String[] arg=ip.split(" ");
		for(int i=0;i<arg.length;i++)
			s.push(arg[i]);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.size();i++)
		{
			sb.append(s.pop()+" ");
		}
		
		System.out.println(sb.toString());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
