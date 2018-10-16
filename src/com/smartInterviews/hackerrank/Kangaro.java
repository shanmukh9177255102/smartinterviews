package com.smartInterviews.hackerrank;

public class Kangaro {

	 static String kangaroo(int x1, int v1, int x2, int v2) {
	        
	        while( (v1>=v2 && x1<=x2) || (v1<v2 && x1>=x2))
	        {
	         x1+=+v1 ;x2+=v2;  
	        if(x1==x2)return "Yes";
	        System.out.println(x1+","+x2);;
	        }
	        
	       return "No";

	    }
	 
	 static int gcd(int a,int b){
		 
		 if(a<b)return gcd(b,a);
		 if(a==1 || b==1)return 1;
		 if(a%b==0)return b;
		 else return gcd(b,a%b);
	 }
	 static int lcm(int[] a)
	 {
		 int x,temp=a[0],y=a[0];
		 for(int i=1;i<a.length;i=i+2)
		 {
			 x=gcd(temp,a[i]);
			 y*=a[i];
			 temp=x;
		 }
		 
		 return temp/y;
	 }
	 static int getTotalX(int[] a, int[] b) {
	        int i,j,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
	        
	        for(i=0;i<b.length;i++)min=(min>=b[i]?b[i]:min);
	        for(i=0;i<a.length;i++)max=(max<=a[i]?a[i]:max);
	        
	        int count=0;
	        for(i=max;i <= min;)
	        {if(min%i==0)count++;i=i+max;}
	            
	        return count;
	    }
	public static void main(String[] args) {
	
		
		//System.out.println(getTotalX(,));

	}

}
