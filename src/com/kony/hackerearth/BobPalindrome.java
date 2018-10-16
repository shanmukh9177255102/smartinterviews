package com.kony.hackerearth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BobPalindrome {

	static Scanner sc=new Scanner(System.in);
	static HashMap<String,HashSet<String>> hm=new HashMap<String,HashSet<String>>();
	static int count=0;
	
	public static void countPalindromes(int len,List<String> cur)
	{
	        String s="abcdefghijklmnopqrstuvwxyz";
	        
	        if(len==0){
	        	for(String g:cur)
	        		System.out.print(g);
	        	System.out.println();
	        	count++;
	        }
	        for(int i=0;i<s.length();i++)
	        {
	        	if(cur.size()==0 || !hm.containsKey(s.charAt(i)) || hm.get(s.charAt(i)).containsAll(cur))
	        	{
	        		String st=""+s.charAt(i);
	        		ArrayList<String> al=new ArrayList<String>(cur);
	        		al.add(st);
	        		countPalindromes(len-1,al);
	        	}
	        }
	        	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<26;i++)
		{
			String[] ip=sc.nextLine().split(" ");
			int l=ip.length;
			
			if(hm.containsKey(ip[1]))
			{
				for(int j=0;j<l-2;j++)
					hm.get(ip[1]).add(ip[j+2]);
			}
			else{
				HashSet<String> as=new HashSet<String>();
				as.add(ip[1]);
				for(int j=0;j<l-2;j++)
					as.add(ip[j+2]);
				hm.put(ip[1],as);
			}
			
		}
		countPalindromes(Math.round(len/2),new ArrayList<String>());

	}

}
