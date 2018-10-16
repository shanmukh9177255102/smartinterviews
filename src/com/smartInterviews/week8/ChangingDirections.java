package com.smartInterviews.week8;


/*
2
8
pwd
cd /home/user/ban/desktop
pwd
cd ../../rai/desktop
pwd
cd /home/
cd os/labs
pwd
5
cd /sem/net/lab
cd ../../os/labs/../slides/
pwd
cd /
pwd
 */
import java.util.Scanner;
import java.util.Stack;

public class ChangingDirections {

	static Scanner sc=new Scanner(System.in);
	static Stack<String> ms=new Stack<>();
	static Stack<String> rs=new Stack<>();
	
	public static void main(String[] args) {
		
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int q=sc.nextInt();
			ms=new Stack<>();
			rs=new Stack<>();
			ms.push("/");
			rs.push("/");
			sc.nextLine();
			for(int j=0;j<q;j++)
			{
				String ips=sc.nextLine();
				//System.out.println(ips);
				String[] ip=ips.split(" ");
				switch(ip[0])
				{
				case "pwd":
					printStack();
					break;
					
				case "cd":
					if(ip[1].charAt(0)=='/')
						{
						ms=new Stack<>();
					    ms.push("/");
						}
						String[] param=ip[1].split("/");
					for(int l=0;l<param.length;l++)
					{
						switch(param[l])
						{
						case "":
							break;
						case "..":
							if(ms.size()>1)ms.pop();
							break;
						default:
							
							ms.push(param[l]);break;
						}
					}
					break;
			}
				}
				
				//for(int ipm=0;ipm<ms.size();ipm++)System.out.print(ms.get(ipm)+" ");System.out.println();	
		}
		
	}

	private static void printStack() {
	
		System.out.print("/");
		for(int i=1;i<ms.size();i++)
			System.out.print(ms.get(i)+"/");
		System.out.println();
		
	}

}
