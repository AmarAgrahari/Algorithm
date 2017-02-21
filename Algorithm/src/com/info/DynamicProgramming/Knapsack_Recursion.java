package com.DynamicProgramming;

import java.util.Scanner;

public class Knapsack_Recursion {
	
	
	public int knapsack(int W,int[] w,int val[],int n)
	{
		if(n==0 ||W==0)
	return 0;
		else if(w[n-1]>W)
			return knapsack(W, w, val, n-1);
		else
			return max(val[n-1]+knapsack(W-w[n-1], w, val, n-1),knapsack(W, w, val, n-1));
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
    System.out.println("Enter value of weight");
    for(int j=0;j<n;j++)
    {
    	val[j]=sc.nextInt();
    }
    System.out.println("Enter maximum value ");
    int W=sc.nextInt();
    Knapsack_Recursion kp=new Knapsack_Recursion();
    int m=kp.knapsack(W,wt,val,n);
    System.out.println(m);
    
	}

}
