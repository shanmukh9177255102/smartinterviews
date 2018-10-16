package com.kony.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class stringKDstintct {

	public static void compute(String s,int len,int k)
    {
		int i,j,maxlen=0;char c;
		s=s.toLowerCase();
        HashMap<Character,Integer> hm;
        int counter=0;
        for(i=0;i<len;i++)
        {
        	counter=0;
        	hm=new HashMap<Character, Integer>();
        	for(j=i;j<len;j++)
        	{     
        		   c=s.charAt(j);
        	       counter++;
        	       if(c=='a' || c=='e' || c=='i'|| c=='0' || c=='u')
        		    {if(hm.containsKey(c))
        			hm.put(c,hm.get(c)+1);
        		    else
        		    	hm.put(c,0);
        		    }
        	       if(hm.size()==k){maxlen=(maxlen>=counter)?maxlen:counter;break;}
        	}
        	
        }
        if(maxlen>0)
        System.out.println(maxlen);
    }
    public static void readInput() throws IOException{
		 BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		String[] temp;String temp2,temp3;
		int i;
        int testcases = inp.read();
        for(i=0;i<testcases;i++)
		{
         temp2=inp.readLine();
         
          temp3=inp.readLine();
         System.out.println(temp2+","+temp3);
         temp=temp2.split(" ");
         compute(temp2,Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
		}
        inp.close();
        
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readInput();

	}

}
