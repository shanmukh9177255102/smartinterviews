package com.smartInterviews.week5;

import java.util.Scanner;

public class RabinKarpAlgorithm {

	static Scanner sc=new Scanner(System.in);
	public static int[] s2iA(String str[])
	{
		int[] ret=new int[str.length];
		for(int i=0;i<str.length;i++)
			ret[i]=Integer.parseInt(str[i]);
		return ret;
	}
	
	public static void stringMatchAlgo(String a,String b)
	{
		int p=11,q=17;
		
		int minlen=Math.min(a.length(),b.length());
		int maxlen=Math.max(a.length(),b.length());
		
		long[] pv=new long[minlen];
		long[] qv=new long[minlen];
		int ind=minlen-1;
		pv[ind]=p;
		qv[ind]=q;
		
		long k=(long) 1e9+7;
		
		// compute pow A
		// compute pow B
		for(int j=ind-1;j>=0;j--)
			{
			pv[j]=(p*pv[j+1])%k;
			qv[j]=(q*qv[j+1])%k;
			}
		
		
		
		long[] hap,haq,hbp,hbq;
		
			hap=new long[maxlen];
			haq=new long[maxlen];
			hbp=new long[minlen];
			hbq=new long[minlen];
		
			hap[0]=(a.charAt(0)*pv[0])%k;
			hbp[0]=(b.charAt(0)*pv[0])%k;
			
			haq[0]=(a.charAt(0)*qv[0])%k;
			hbq[0]=(b.charAt(0)*qv[0])%k;
			//System.out.print(hbp[0]+" ");
			// initialize..
			
			for(int i=1;i<minlen;i++)
			{
				hap[i]=(hap[i-1]+(a.charAt(i)*pv[i])%k)%k;
				hbp[i]=(hbp[i-1]+(b.charAt(i)*pv[i])%k)%k;
				
				haq[i]=(haq[i-1]+(a.charAt(i)*qv[i])%k)%k;
				hbq[i]=(hbq[i-1]+(b.charAt(i)*qv[i])%k)%k;
				//System.out.print(hbp[i]+" ");
				
			}
			//System.out.println();
			int found=0;
			if(hap[minlen-1]==hbp[minlen-1] && haq[minlen-1]==hbq[minlen-1])found++;
			//System.out.println(i);
			//System.out.println(hap[minlen-1]+","+hbp[minlen-1]);
			//System.out.println(haq[minlen-1]+","+hbq[minlen-1]);
			//System.out.println("-----"+minlen);
			
			// evaluate rest..of a..
			int j=0;
			for(int i=minlen;i<maxlen;i++,j++)
			{
				hap[i]=(k+hap[i-1]-(a.charAt(j)*pv[0]))%k;
				while(hap[i]<0)hap[i]+=k;
				hap[i]=(hap[i]*p)%k;
				hap[i]=(hap[i]+(a.charAt(i)*pv[minlen-1])%k)%k;
				
				haq[i]=(k+haq[i-1]-(a.charAt(j)*qv[0]))%k;
				while(haq[i]<0)haq[i]+=k;
				haq[i]=(haq[i]*q)%k;
				haq[i]=(haq[i]+(a.charAt(i)*qv[minlen-1])%k)%k;
				
				if(hap[i]==hbp[minlen-1] && haq[i]==hbq[minlen-1]){found++;}
				//System.out.println(i);
				//System.out.println(hap[i]+","+hbp[minlen-1]);
				//System.out.println(haq[i]+","+hbq[minlen-1]);
				//System.out.println("-----"+a.charAt(i));
			}
			
		 
	         System.out.println(found);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stringMatchAlgo("eabbc","bb");
		//stringMatchAlgo("efgdabcd","agbc");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String[] ips=sc.nextLine().split(" ");
			stringMatchAlgo(ips[1],ips[0]);
		}

	}

}
