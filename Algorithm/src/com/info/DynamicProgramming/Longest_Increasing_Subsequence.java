package com.DynamicProgramming;

import java.util.Scanner;

public class Longest_Increasing_Subsequence {

	public int lis(int arr[],int n)
	{
		int max=0;
		int lis[]=new int[n];
		for(int i=0;i<n;i++)
		{
			lis[i]=1;
		}
		if(n==1)
			return 1;
		else
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					if(arr[i]>arr[j] && lis[i]<lis[j]+1)
					{
						lis[i]=lis[j]+1;
					}
				}
			}
			max=lis[0];
			for(int k=1;k<n;k++)
			{
				if(lis[k]>max)
					max=lis[k];
			}
		}
		return max;
			
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Longest_Increasing_Subsequence lis1=new Longest_Increasing_Subsequence();
		int c=lis1.lis(arr,n);
		System.out.println("Length of longest subsequence are: "+c);
		}

}
