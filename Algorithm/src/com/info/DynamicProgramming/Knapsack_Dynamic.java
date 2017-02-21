package com.DynamicProgramming;

import java.util.Scanner;

public class Knapsack_Dynamic {
    public int knapsack(int W,int []wt,int[] val,int n)
    {
    	int k[][]=new int[n+1][W+1];
    	for(int i=0;i<=n;i++)
    	{
    		for(int w=0;w<=W;w++)
    		{
    			if(i==0 || w==0)
    				k[i][w]=0;
    			else if(wt[n-1]>w)
    				k[i][w]=k[i-1][w];
    			else
    				k[i][w]=max(val[i-1]+k[i-1][W-wt[i]],k[i-1][w]);
    		}
    	}
    	return k[n][W];
    }
	public int max(int a,int b)
	{
		return a>b?a:b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of element you want to enter");
	    int n=sc.nextInt();
	    int wt[]=new int[n];
	    int val[]=new int[n];
	    System.out.println("Enter weight value");
	    for(int i=0;i<n;i++)
	    {
	    	wt[i]=sc.nextInt();
	    }
	    System.out.println("Enter benefits of weight");
	    for(int j=0;j<n;j++)
	    {
	    	val[j]=sc.nextInt();
	    }
	    System.out.println("Enter maximum weight ");
	    int W=sc.nextInt();
	    Knapsack_Recursion kp=new Knapsack_Recursion();
	    int m=kp.knapsack(W,wt,val,n);
	    System.out.println(m);
	}

}
