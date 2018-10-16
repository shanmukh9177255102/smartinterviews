package com.kony.hackerearth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Nos{
	int num;
	int cnt;
	Nos(int num,int cnt)
	{
		this.num=num;this.cnt=cnt;
	}
}
public class MayCircuits1 {
	static int n,k,input[];
	static List<Nos> al=new ArrayList<Nos>();
	static Scanner sc=new Scanner(System.in);
	
	
	static int setOfXors(int[] a)
	{
	       for(int i=0;i<input.length;i++)
	       {
	    	  for(int j=0;j<al.size();j++)
	    	  {
	    		  
	    		  Nos obj=al.get(j);
	    		  if(obj.cnt < k)
	    			 al.add(new Nos(input[i]^obj.num,obj.num+1));
	    	  }
	    	  al.add(new Nos(input[i],1));
	    	  //System.out.println("#size:"+al.size());
	    	  /*for(Nos ls:al)
	    	   System.out.print("##"+ls.num+","+ls.cnt+"..");
	    	  System.out.println("\n");
	    	  */
	       }
	       Set<Integer> s = new HashSet<Integer>();
	       for(Nos ls:al)
	    	   {
	    	   s.add(ls.num);
	    	   //System.out.println("##"+ls.num);
	    	   }
	       return s.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inp=sc.nextLine().split(" ");
		n=Integer.parseInt(inp[0]);k=Integer.parseInt(inp[1]);
		input=new int[n];
		inp=sc.nextLine().split(" ");
		for(int i=0;i<n;i++)
			input[i]=Integer.parseInt(inp[i]);
		System.out.println(setOfXors(input));

	}

}
