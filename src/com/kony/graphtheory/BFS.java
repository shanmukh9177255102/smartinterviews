package com.kony.graphtheory;

import com.kony.graphtheory.Node;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class BFS {
	public static long nonDuplicates=0;
	public static Stack<Integer> q=new Stack<Integer>();
	public static ArrayList<Node> Edges=new ArrayList<Node>();
	
	public static void printStackAr(){
		Iterator<Integer> iter=q.iterator();
		while(iter.hasNext()){
			System.out.print((iter.next()+1)+",");
		}
		
	}
	public static void performDFS()
	{
		if(!q.empty())
		{
		int curver=q.pop();
		long temp=nonDuplicates>>curver;
		if((temp & 1) == 0)
		{
		temp =temp | 1;
		nonDuplicates= (temp<<curver) | nonDuplicates;
		System.out.println(curver+1);
	   Iterator<Integer> iter=Edges.get(curver).adjacency.iterator();
		while(iter.hasNext())
		{
			int k=iter.next().intValue();
			if((nonDuplicates>>k & 1) ==0)
			q.push(k);
		}
		//printStackAr();
		//System.out.println("----");
		performDFS();
		}
		}
	}
	
	public static void addEdge(int v1,int v2){
		
	    Edges.get(v1-1).adjacency.add(v2-1);
	    //Edges.get(v2-1).adjacency.add(v1-1);
			//System.out.println(v1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<7;i++){
			Edges.add(new Node(i+1));
		}
		addEdge(1,2);
		addEdge(2,3);
		addEdge(2,4);
		addEdge(3,5);
		addEdge(4,5);
		addEdge(4,6);
		addEdge(4,7);
		addEdge(6,7);
		q.push(0);
		performDFS();
	}

}
