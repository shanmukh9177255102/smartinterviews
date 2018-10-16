package com.kony.hackerearth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CBIL implements Comparable<CBIL>{
	String name;
	int c;
	int r;
	
	
	public CBIL(String name, int c, int r) {
		super();
		this.name = name;
		this.c = c;
		this.r = r;
		//System.out.println("created:"+name);
	}


	@Override
	public int compareTo(CBIL o) {
		
		// highest c score
		if(this.c>o.c)return -1;
		if(this.c<o.c)return 1;
		
		// lowest r score
		if(this.r>o.r)return 1;
		if(this.r<o.r)return -1;
		
		// descending name
		return o.name.compareTo(this.name);
	}
}
public class CbilScore {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int n=sc.nextInt();
		for(int j=0;j<n;j++)
		{
	    int m=sc.nextInt();
		sc.nextLine();
		ArrayList<CBIL> l=new ArrayList<>();
		for(int i=0;i<m;i++)
		{
			String[] s=sc.nextLine().split(" ");
			
			//System.out.println(s[0]+" "+s[1]+" "+s[2]);
			l.add(new CBIL(s[0],Integer.parseInt(s[1]),Integer.parseInt(s[2])));
				
		}
		int k=sc.nextInt();
		//System.out.println(k);
		Collections.sort(l);
		for(int i=0;i<l.size();i++)print(l.get(i));
  	    print(l.get(k-1));
		}
		
	}
	public static void print(CBIL cbil) {
		// TODO Auto-generated method stub
		System.out.println(cbil.name+" "+cbil.c);
	}

}
