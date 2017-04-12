/*Tablulation Method*/
/*The tabulated program for a given problems build a table in a bottom up fashion and return the last entry of table*/

package com.DynamicProgramming;

import java.util.Scanner;

public class Fibonacci_Tabulated {
	
	
	public int fib(int n)
	{
		int f[]=new int[n+1];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<=n;i++)
		{
			f[i]=f[i-1]+f[i-2];
			
		}
		return f[n-1];
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	
	
	Fibonacci_Tabulated f=new Fibonacci_Tabulated();
	int c=f.fib(n);
	System.out.println(c);
	
	}

}
