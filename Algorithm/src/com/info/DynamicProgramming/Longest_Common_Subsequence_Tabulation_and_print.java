package com.DynamicProgramming;

import java.util.Scanner;

public class Longest_Common_Subsequence_Tabulation_and_print {

	public void LCS(char[] a, char[] b, int l1, int l2) {
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
		
		int index= L[l1][l2];;
		char l[]=new char[index+1];
		l[index]='\0';
		int i=l1;
		int j=l2;
		while(i>0 && j>0)
		{
			if(a[i-1]==b[j-1])
			{
				l[index-1]=a[i-1];
				i--;
				j--;
				index--;
			}
			else if(L[i-1][j]>L[i][j-1])
			{
				i--;
			}
			else
				j--;
		}
		String first=new String(a);
		String last=new String(b);
		String result=new String(l);
		System.out.println("The longest Common Subsequence of "+first + " and "+last+" is "+result);
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
		Longest_Common_Subsequence_Tabulation_and_print lts=new Longest_Common_Subsequence_Tabulation_and_print();
		lts.LCS(a,b,a.length,b.length);
		
	
	}

	

}
