package com.DynamicProgramming;

import java.util.Scanner;

public class Longest_Common_Subsequence_Tabulation {

	public int LCS(char[] a, char[] b, int l1, int l2) {
		int L[][]=new int[l1+1][l2+1];
		for(int i=0;i<=l1;i++)
		{
			for(int j=0;j<=l2;j++)
			{
				if(i==0||j==0)
					L[i][j]=0;
				else if(a[i-1]==b[j-1])
					L[i][j]=1+L[i-1][j-1];
				else
				{
					L[i][j]=max(L[i-1][j],L[i][j-1]);
				}
			}
		}
		return L[l1][l2];
		
	}
	public int max(int a,int b)
	{
		return (a>b)?a:b;
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String s=sc.next();
		System.out.println("Enter second string");
		String t=sc.next();
		char[] a=s.toCharArray();
		char[] b=t.toCharArray();
		Longest_Common_Subsequence_Tabulation lts=new Longest_Common_Subsequence_Tabulation();
		int count=lts.LCS(a,b,a.length,b.length);
		System.out.println("Length of subsequence is "+ count);
	}

	

}
