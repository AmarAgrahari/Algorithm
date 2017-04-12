package com.info;

import java.util.Scanner;

public class QuickSort {
	
	public int partition(int ar[],int start,int end)
	{
		int pIndex=start;
		int pivot=end;
		for(int i=start;i<end;i++)
		{
			if(ar[i]<ar[pivot])
			{
				int temp=ar[i];
				ar[i]=ar[pIndex];
				ar[pIndex]=temp;
				pIndex=pIndex+1;
			}
		}
		int temp1=ar[pIndex];
		ar[pIndex]=ar[pivot];
		ar[pivot]=temp1;
		return pIndex;
	}

	public void printArray(int ar[])
	{
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[j]);
		}
	}
	public void quickSort(int ar[],int start,int end)
	{
		if(start<=end)
		{
			int pIndex=partition(ar,start,end);
			quickSort(ar,start,pIndex-1);
			quickSort(ar, pIndex+1, end);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		QuickSort q=new QuickSort();
		q.quickSort(ar,0,n-1);
		q.printArray(ar);

	}

}
