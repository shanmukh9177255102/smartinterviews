package com.smartInterviews.week6;

import java.util.Arrays;

public class QuadruplesXOR {

	public static void quadraupleXor(int[] a,int[] b,int[] c,int[] d)
	{
		
		int[] p=new int[127];
		int[] q=new int[127];
		
		Arrays.fill(p,0);
		Arrays.fill(q,0);
		
		for(int i=0;i<a.length;i++)
			for(int j=0;j<b.length;j++)
				p[a[i]^b[j]]++;
		
		for(int i=0;i<c.length;i++)
			for(int j=0;j<d.length;j++)
				q[c[i]^d[j]]++;
		
		long res=0;
		
		for(int i=0;i<127;i++)
		{
			res+=p[i]*q[i];
		}
		
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={11,88,64,38};
		int[] b={88,7,62,58};
		int[] c={16,75,77,92};
		int[] d={77,29,90,60};
		
		int[] e={27,21},f={39,40},g={64,77},h={36,5};
		
		//quadraupleXor(a, b, c, d);
		//quadraupleXor(e, f, g, h);
		
		
		int[] p={49,73,58,30,72,44,78,23};
		int[] q={9,40,65,92,42,87,3,27};
		int[] r={29,40,12,3,69,9,57,60};
		int[] s={33,99,78,16,35,97,26,12};
		
		quadraupleXor(p,q,r,s);

	}

}
