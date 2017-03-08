package com.DynamicProgramming;

/*Given an array arr[0 … n-1] containing n positive integers, a subsequence of arr[] 
is called Bitonic if it is first increasing, then decreasing. Write a function that takes an array
as argument and returns the length of the longest bitonic subsequence.
A sequence, sorted in increasing order is considered Bitonic with the decreasing part as empty.
Similarly, decreasing order sequence is considered Bitonic with the increasing part as empty.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Bitonic_Subsequence {
	
	public int findBitonicSubsequence(int arr[],int n)
	{
		int lis[]=new int[n];
		Arrays.fill(lis, 1);
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j]&& lis[i]<lis[j]+1)
					lis[i]=lis[j]+1;
			}
		}
		
		
		int lds[]=new int[n];
		Arrays.fill(lds, 1);
		for(int i=n-2;i>=0;i--)
		{
			for(int j=n-1;j>i;j--)
			{
				if(arr[i]>arr[j] && lds[i]<lds[j]+1)
					lds[i]=lds[j]+1;
			}
		}
		int max=lis[0]+lds[0]-1;
		for(int i=0;i<n;i++)
		{
			if(max<(lis[i]+lds[i]-1))
				max=lis[i]+lds[i]-1;
		}
		return max;
		
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     Bitonic_Subsequence bs=new Bitonic_Subsequence();
     int max=bs.findBitonicSubsequence(arr,n);
     System.out.println(max);
	}

}
