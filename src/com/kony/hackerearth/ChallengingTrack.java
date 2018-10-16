package com.kony.hackerearth;

import java.util.Scanner;

public class ChallengingTrack {

	static Scanner sc=new Scanner(System.in);
	
	public static void determine(int[] a,int p)
	{
	    int i=0,count=0;
	    for(i=0;i<a.length;i++)
	    {
	        int flag=i%2;
	        int t=a[i]+count;
	        if(t>=0)
	        {
	              p=p-t;
	             if(p<0)break;
	        }
	        if(i>0)count--;
	        for(int j=i+1;i==0 && j<a.length;j++)
	        {
	            if(a[j]%2==flag && a[j]!=0)
	            a[j]--;
	        }
	       System.out.println("power left:"+p);
	    }
	    if(i!=a.length)System.out.println("No");
	    else System.out.println("Yes "+p);
	}
	public static void WinOrLose(int[] ip,int p)
	{
		int k=1,i=0,count=0;
		
		if(ip[0]==p)
		{
		if(ip.length==1)System.out.println("Yes 0");
		else System.out.println("No");
		}
		
		if(ip[0]<p)
		{
			p=p-ip[0];
			for(int j=1;j<ip.length;j++)
			if(ip[j]%2==0)ip[j]=ip[j]-1;
		
		for(i=1;i<ip.length;i++)
		{
			int t=count+ip[i];
			if(t<=p){p=p-t;count--;}
			else break;
			k++;
			//System.out.println("--enter--"+i);
		}
		//System.out.println("--"+k);
		if(i!=ip.length)
			System.out.println("No");
		else
			System.out.println("Yes "+p);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int iplen=sc.nextInt();
			int p=sc.nextInt();
			int[] ip=new int[iplen];
			for(int k=0;k<iplen;k++)
			 ip[k]=sc.nextInt();
			WinOrLose(ip, p);
		}
		sc.close();
     */
		int[] ip={8,6,1,7,6,5};
		determine(ip,21);
	}

}
