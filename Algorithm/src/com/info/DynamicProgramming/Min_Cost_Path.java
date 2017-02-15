//Recursive method
package com.DynamicProgramming;

import java.util.Scanner;

public class Min_Cost_Path {

	public int minCost(int[][] cost, int m, int n) {
		
		if(m<0 || n<0)
			return Integer.MAX_VALUE;
		else if(m==0 && n==0)
				return cost[m][n];
		else
			return cost[m][n]+min(minCost(cost, m-1, n),minCost(cost, m, n-1),minCost(cost, m-1, n-1));
				
		
	}
	
	
	
	public int min(int a, int b, int c) {
		
		return (a<b)?((a<c)?a:c):((b<c)?b:c);
	}



	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size to generate cost matrix");
	System.out.println("Enter row size");
	int m=sc.nextInt();
	System.out.println("Enter column size");
	int n=sc.nextInt();
	int cost[][]=new int[m][n];
	System.out.println("Enter element of array");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			cost[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter position for which you want to find minimum cost path");
	System.out.println("Enter row position");
	int m1=sc.nextInt();
	System.out.println("Enter column position");
	int n1=sc.nextInt();
	Min_Cost_Path mnp=new Min_Cost_Path();
	System.out.println("minimum cost = "+mnp.minCost(cost,m1-1,n1-1));
	}



}
