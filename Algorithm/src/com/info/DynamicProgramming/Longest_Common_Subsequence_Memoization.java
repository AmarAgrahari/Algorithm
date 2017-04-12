package com.DynamicProgramming;

import java.util.Scanner;

public class Longest_Common_Subsequence_Memoization {

	public static int arr[][];
	public static int result;
		
		public int LCS(char[] s,char[] t,int m,int n)
		{
			
			
			if(arr[m][n]==-1)
			{
				
			if(m==0||n==0)
				return 0;
			
				if(s[m-1]==t[n-1])
				{
					result=1+LCS(s,t,m-1,n-1);
					/*arr[m][n]=result;*/
				}
				else
				{
					result= max(LCS(s,t,m,n-1),LCS(s,t,m-1,n));
					/*arr[m][n]=result;*/
				}
				
			}
			arr[m][n]=result;
				return result;
				
		
		}

	public int max(int a,int b)
	{
		return (a>b)?a:b;
	}
		public static void main(String[] args) {
	   
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First String");
			String X=sc.next();
			System.out.println("Enter Second String");
			String Y=sc.next();
			char[] s=X.toCharArray();
			char[] t=Y.toCharArray();
			arr=new int[s.length+1][t.length+1];
			for(int i=0;i<s.length+1;i++)
			{
				for(int j=0;j<t.length+1;j++)
				{
					arr[i][j]=-1;
				}
			}
			
			Longest_Common_Subsequence_Memoization ls=new Longest_Common_Subsequence_Memoization();
			int T=ls.LCS(s,t,s.length,t.length);
			System.out.println("length of longest common subsequence is"+T);
			
		}
		

	}

