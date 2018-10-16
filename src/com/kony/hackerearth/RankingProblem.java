package com.kony.hackerearth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student{
	int times;
	int cnt;
	String name;
	
	Student(int times,int cnt,String name){
		
		this.times=times;this.cnt=cnt;this.name=name;
	}
}

class Sortbyroll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        int count=a.cnt - b.cnt;
        int t=b.times-a.times;
        int names=b.name.compareTo(a.name);
        
        return -(count!=0?count:(t!=0 ? t:names));
    }
}
 
public class RankingProblem {

	public static int n,k;
	public static Scanner sc=new Scanner(System.in);
	public static HashMap<String,Student> s=new HashMap<String,Student>();
			
	
	
	public static void main(String[] args) {
		
		int temp;
		
		n=sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
			
			String str[]=sc.nextLine().split(" ");
			temp=Integer.parseInt(str[1]);
			if(s.containsKey(str[0])){
				Student sam=s.get(str[0]);
				sam.cnt++;
				sam.times+=temp;
				sam.name=str[0];
				s.put(str[0],sam);
			}
			else s.put(str[0],new Student(temp,1,str[0]));
		}
		ArrayList<Student> al=new ArrayList<Student>();
		for(Map.Entry<String,Student> mp:s.entrySet()){
			al.add(mp.getValue());
			}
		Collections.sort(al,new Sortbyroll());
		for(int i=0;i<al.size();i++)
		System.out.println(i+1+" "+al.get(i).name);
            sc.close();
	}

}
