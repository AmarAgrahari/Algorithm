package com.info;

import java.util.Scanner;

public class Hackerrank_Subarray {

	public int findNegativeArray(int []arr,int n)
	{
		int sum=0;int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				sum+=arr[j];
				if(sum<0)
					count++;
			}
			sum=0;
		}
		return count;
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
   Hackerrank_Subarray hs=new Hackerrank_Subarray();
   int count=hs.findNegativeArray(arr,n);
   System.out.println(count);
	}

}
