package com.smartInterviews.week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	int depth;
	Node left;
	Node right;
	
	public Node(int data) {
		super();
		this.data = data;
		this.depth=0;
		this.left=null;
		this.right=null;
	};
	
	public int getHeight(Node h)
	{
		if(h!=null){
			
			return Math.max(getHeight(h.right),getHeight(h.left))+1;
		}
		
		return 0;
	}
	
	public void depthofNodes(Node h,int curDepth)
	{
		if(h!=null)
		{
			h.depth=curDepth+1;
			depthofNodes(h.left, curDepth+1);
			depthofNodes(h.right, curDepth+1);
		}
		
	}
	
}


public class TreeTraversels {

	static HashMap<Integer,ArrayList<Integer>> vertical=new HashMap<>();
	static HashMap<Integer,Integer> leftview=new HashMap<>();
	static HashMap<Integer,Integer> rightview=new HashMap<>();
	
	public static boolean isFullBinary(Node h){
		
		if(h!=null)
		{
			if((h.left==null && h.right==null) || (h.left!=null && h.right!=null))
				return isFullBinary(h.left) && isFullBinary(h.right);
			else
				return false;
		}
		return true;
	}
	
   public static boolean isCompleteBinary(Node h){
	   
	   if(h!=null)
	   {
		   boolean l=isCompleteBinary(h.left);
		   boolean r=isCompleteBinary(h.right);
		   
		   if(!l && r)
			   return false;
	   }
	   
		return false;
	}
	public static void bottomupLevelOrder(Node h)
	{
		
		
		
	}
	
    public static void levelorder(Node h){
		
		Queue<Node> q=new LinkedList<>();
		
		q.add(h);
		int t=1;
		while(q.size()>0)
		{
			while(t>0)
			{
				Node temp=q.poll();
				if(temp.left!=null)q.add(temp.left);
				if(temp.right!=null)q.add(temp.right);
				t--;
			}
			System.out.println();
			t=q.size();
		}
		
	}
	
	
	public static void verticalOrder(Node h,int level,HashMap<Integer,ArrayList<Integer>> vertical)
	{
		
		if(h!=null)
		{
		ArrayList<Integer> a=vertical.get(level);
		if(a==null)a=new ArrayList<>();
		a.add(h.data);
		vertical.put(level, a);
		verticalOrder(h.left, level-1, vertical);
		verticalOrder(h.right, level+1, vertical);
	    }
	}
	
	
	
	public static Node insertNode(Node head,int k)
	{
		if(head==null)return new Node(k);
		if(head.data>k)
		{
			if(head.left!=null)head.left=insertNode(head.left, k);
			else head.left=new Node(k);
		}
		else
			{
			if(head.right!=null)head.right=insertNode(head.right, k);
			else head.right=new Node(k);
			}
		return head;
	}
	
	public static void inorder(Node head)
	{
		if(head==null)return;
		
		inorder(head.left);
		System.out.print(head.data+" ");
		inorder(head.right);
	}
	
	public static void preorder(Node head)
	{
		if(head==null)return;
		
		System.out.print(head.data+" ");
		preorder(head.left);
		preorder(head.right);
	}
	
	public static void postorder(Node head)
	{
		if(head==null)return;

		postorder(head.left);
		postorder(head.right);
		System.out.print(head.data+" ");
			
	}
	
	public static void main(String[] args) {
		Node head=null;
		/*
		 1 2 3 4 5
		 
		
		1 2 3 4 5
		1 2 3 4 5
		5 4 3 2 1
		
		*/
		
		int[] a={4,5,15,0,1,7,17};//{3,2,4,1,5};//{1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
			head=insertNode(head,a[i]);
		
		preorder(head);
		System.out.println();
		inorder(head);
		System.out.println();
		postorder(head);
		
			
	}

}
