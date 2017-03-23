package com.info;

import java.util.Scanner;

public class Jumping_the_cloud {

	public void findMinimum(int arr[],int n)
	{
		int sum=0;
		int i=0;
		while(i<=n-1)
		{
			if( i+1<n && i+2<n && arr[i+1]==0 && arr[i+2]==0)
			{
				i=i+2;
			
				sum++;
			}
			else if(i+1<n && arr[i+1]==0 )
			{
				i=i+1;
			
				sum++;
			}
			else if( i+1<n && i+2<n && arr[i+1]==1 && arr[i+2]==1 )
			{
				sum=0;
				break;
			}
			else
			{
				if(i==n-1)
					break;
				else
				{
				i=i+2;
			
				sum++;
				}
			}
				
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++)
  {
	  arr[i]=sc.nextInt();
  }
  Jumping_the_cloud jc=new Jumping_the_cloud();
  jc.findMinimum(arr,n);
	}

}
