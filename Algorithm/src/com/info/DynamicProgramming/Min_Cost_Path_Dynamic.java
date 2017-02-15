/*Optimal Solution for minimum cost path*/
package com.DynamicProgramming;

import java.util.Scanner;

public class Min_Cost_Path_Dynamic {
	
	public int minCost(int[][] cost, int m, int n) {
		
		int tc[][]=new int[m+1][n+1];
		tc[0][0]=cost[0][0];
		for(int i=1;i<=m;i++)
			tc[0][i]=tc[0][i-1]+cost[0][i];
		for(int j=1;j<=n;j++)
		{
			tc[j][0]=tc[j-1][0]+cost[j][0];
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				tc[i][j]=cost[i][j]+min(tc[i-1][j-1],tc[i-1][j],tc[i][j-1]);
			}
		}
				return tc[m][n];
		
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
		Min_Cost_Path_Dynamic mnp=new Min_Cost_Path_Dynamic();
		System.out.println("minimum cost = "+mnp.minCost(cost,m1-1,n1-1));
	}

}
