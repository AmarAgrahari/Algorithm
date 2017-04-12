package com.DynamicProgramming;

import java.util.Scanner;

public class CutTheRod_Dynamically {
	public int cutRod(int price[],int n)
	{
		int val[]=new int[n+1];
		val[0]=0;
		for(int i=1;i<=n;i++)
		{
			int max=Integer.MIN_VALUE;
			for(int j=0;j<i;j++)
			{
				max=Math.max(max, price[j]+val[i-j-1]);
			}
			val[i]=max;
		}
		return val[n];
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int price[]=new int[n];
		for(int i=0;i<n;i++)
		{
			price[i]=sc.nextInt();
		}
	  CutTheRod_Dynamically r=new CutTheRod_Dynamically();
	int max=  r.cutRod(price,n);
	System.out.println(max);

	}

}
