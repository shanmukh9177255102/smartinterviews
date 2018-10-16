package com.smartInterviews.week4;

import java.util.Scanner;

public class PerfectCube {

	static Scanner sc=new Scanner(System.in);
    public static long cuberoot(long no)
    {
        int flag=0;
        if(no==0)return 0;
        if(no<0){flag=1;no*=-1;}
        //System.out.println("cur:"+no);
        long highl=(long)Math.sqrt(no);
        highl=Math.min(highl,1000000L);
        long lowl=1;
        long m=0;
        long t;
        System.out.println(lowl+","+highl);
        while(lowl<highl){
            
            m=lowl+(highl-lowl)/2;
            
            t=(m*m*m);
            
            if(t==no){lowl=m;break;}
            if(t>no)highl=m;
            if(t<no)lowl=m+1;
            
            System.out.println(lowl+","+highl);
        }
        
        //System.out.println(lowl+","+flag);
        return flag==0?lowl:-lowl;
    }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        /*
         int n=sc.nextInt();
        for(int i=0;i<n;i++)
        System.out.println(cuberoot(sc.nextLong()));
        */
    	long i=1000000000000000000L;
    	System.out.println(cuberoot(i));

    }
	

}
