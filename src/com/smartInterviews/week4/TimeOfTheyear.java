package com.smartInterviews.week4;

import java.util.Scanner;

public class TimeOfTheyear {

	/* 01-01-1970 00:00:0 thursday
	 * given seconds elapsed   get current date ,day
	  
	  86399
	  86400
	  2592000
	  2678400
	  8639999
	  8640000
	  31535999
	  31536000
	  68169599
	  68169600
	  
	  31,28,31,30,31,30
	  31,31,30,31,30,31
	 
	 */
	static Scanner sc=new Scanner(System.in);
	
	public static int isLeapYear(long yy)
	{
		if(yy%4==0 && yy%100!=0)return 1;
		if(yy%400 == 0 ) return 1;
		
		return 0;
	}
	
	
	public static void getCurrentDate(long no)
	{
		long days=(no/86400);
		int temp=0;
		long curY=1970;
		int[] daysMonth={31,28,31,30,31,30,31,31,30,31,30,31};
		String[] weekdays={"Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"};
		String[] Months={"JAN","FEB","MAR","APR","MAY","JUN",
				"JUL","AUG","SEP","OCT","NOV","DEC"};
		
		//System.out.println("entered.."+days);
		// weekday
		String weekday=weekdays[(int)(days%7)];
		
		//year
		while(days>=365)
		{
			days-=365;
			if(isLeapYear(curY)==1)days-=1;
			curY++;
		}
		// month
		int i=0;
		
		while(days>0)
		{
			//System.out.println("days left:"+days);
			days-=daysMonth[i%12];
			if(i==1 && isLeapYear(curY)==1)days-=1;
			temp=i;
			i++;
		}
		if(days==0 && i!=0)temp=(temp+1)%12;
		
		// day
		if(isLeapYear(curY)==1)daysMonth[1]++;
		long date=(days+daysMonth[temp])%(daysMonth[temp]);
		date++;
		StringBuilder s=new StringBuilder();
		if(date<10)s.append("0");
		s.append(date);
		
		System.out.println(s+"-"+Months[temp]+"-"+curY+" "+weekday);
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		long[] secs={
		  86399,
		  86400,
		  2592000,
		  2678400,
		  8639999,
		  8640000,
		  31535999,
		  31536000,
		  68169599,
		  68169600
		};
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			getCurrentDate(sc.nextLong());

	}

}
