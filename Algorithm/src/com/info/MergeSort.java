package com.info;

import java.util.Scanner;

public class MergeSort {
	public void merge(int l,int mid,int r,int a[])
	{
		int n1=mid-l+1;
		int n2=r-mid;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			L[i]=a[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			R[j]=a[mid+1+j];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				a[k]=L[i];
				i++;
				k++;
			}
			else
			{
				a[k]=R[j];
				j++;
				k++;
			}
		}
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=R[j];
			j++;
			k++;
		}
		
	}

   public void mergeSort(int l,int r,int a[])
   {
	   if(l<r)
	   {
		   int mid=l+(r-l)/2;
		   mergeSort(l,mid,a);
		   mergeSort(mid+1,r,a);
		   merge(l,mid,r,a);
	   }
   }
   public void printArray(int a[],int n)
   {
	   for(int i=0;i<n;i++)
	   {
		   System.out.println(a[i]);
	   }
   }
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number of elements ");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt();
    }
    MergeSort m=new MergeSort();
    m.mergeSort(0,n-1,a);
    m.printArray(a,n);
	}

}
