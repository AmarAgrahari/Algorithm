/*LENGTH OF LONGEST COMMON SUBSEQUENCE BY RECURSIVE METHOD*/
package com.DynamicProgramming;

import java.util.Scanner;

public class Longest_Common_Subsequence_R {
	
	public int LCS(char[] s,char[] t,int m,int n)
	{
		if(m==0||n==0)
			return 0;
		
			if(s[m-1]==t[n-1])
			{
				return 1+LCS(s,t,m-1,n-1);
			}
			else
				return max(LCS(s,t,m,n-1),LCS(s,t,m-1,n));
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
		Longest_Common_Subsequence_R ls=new Longest_Common_Subsequence_R();
		int T=ls.LCS(s,t,s.length,t.length);
		System.out.println("length of longest common subsequence is"+T);
	}

}
