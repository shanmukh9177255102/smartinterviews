package com.smartInterviews.week8;

import java.util.HashMap;

public class TreeViews {

	static HashMap<Integer,Integer> leftmap=new HashMap<>();
	static HashMap<Integer,Integer> topmap=new HashMap<>();
	static HashMap<Integer,Integer> rightmap=new HashMap<>();
	static HashMap<Integer,Integer> bottommap=new HashMap<>();
	static int maxlevel=0,minlevel=0;
	
	public static void leftView(Node h,int level)
	{
	
		if(h!=null)
		{
			if(level<minlevel || level>maxlevel)
		       {
				if(level<minlevel)minlevel=level;
				if(level>maxlevel)maxlevel=level;
				
		         leftmap.put(level,h.data);
		       }
		
		leftView(h.left, level+1);
		leftView(h.right, level+1);
	    }
		
	}
	
	public static void topView(Node h,int level)
	{
	
		if(h!=null)
		{
			if(level<minlevel || level>maxlevel)
		       {
				if(level<minlevel)minlevel=level;
				if(level>maxlevel)maxlevel=level;
				
		         topmap.put(level,h.data);
		       }
		
		topView(h.left, level-1);
		topView(h.right, level+1);
	    }
		
	}
	
	public static void rightView(Node h,int level)
	{
	
		if(h!=null)
		{
			if(rightmap==null)rightmap.put(0,h.data);
			if(level<minlevel || level>maxlevel)
		       {
				if(level<minlevel)minlevel=level;
				if(level>maxlevel)maxlevel=level;

				rightmap.put(level,h.data);
		       }
		
			rightView(h.right, level+1);
			rightView(h.left, level+1);
	    }
		
	}
	public static void bottomView(Node h,int level)
	{
	
		if(h!=null)
		{
			if(bottommap==null)bottommap.put(0,h.data);
			if(level<minlevel || level>maxlevel)
		       {
				if(level<minlevel)minlevel=level;
				if(level>maxlevel)maxlevel=level;
	
		       }
		        bottommap.put(level,h.data);
			bottomView(h.right, level-1);
			bottomView(h.left, level+1);
	    }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
