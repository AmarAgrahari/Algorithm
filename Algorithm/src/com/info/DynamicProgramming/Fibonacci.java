/*Atlast Started DP on 09/02/2017*/
/*First Program on Fibonacci*/
/*Used Concept of Memoization where  we store value in a lookup table*/

package com.DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
	public static final int MAX=100;
	static int lookup[]=new int[MAX];
	public int fib(int n)
	{
		if(lookup[n]==Integer.MIN_VALUE)
		{
			if(n<=1)
				lookup[n]=n;
			else
				lookup[n]=fib(n-1)+fib(n-2);
		}
		return lookup[n];
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	
	for(int i=0;i<MAX;i++)
	{
		lookup[i]=Integer.MIN_VALUE;
	}
	Fibonacci f=new Fibonacci();
	int c=f.fib(n-1);
	System.out.println(c);
	for(int i=0;i<n;i++)
		System.out.print(lookup[i]+" ");
	}

}
