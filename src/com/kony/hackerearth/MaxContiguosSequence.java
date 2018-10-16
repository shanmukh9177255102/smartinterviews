package com.kony.hackerearth;

import java.util.Arrays;

public class MaxContiguosSequence {

    public static int count(int[] a)
    {
        Arrays.sort(a);
        int i=0,temp=0,max=0;
        while(i<a.length-1)
        {
            //System.out.println(i);
            while((i<a.length-1) && (a[i+1]-a[i])==1)
                {temp++;i++;}
            if(temp>0) 
            {
                temp++;
                max=(max>temp)?max:temp;
                temp=0;
            }
            i++;
          // System.out.println("temp:"+max);
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a ={21,-22,-22,5,-31,-24,5,-23};
		System.out.println(count(a));

	}

}
