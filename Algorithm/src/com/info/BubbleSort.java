package com.info;
import java.util.*;
import java.io.*;

public class BubbleSort {

	public void bubbleSort(int ar[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
	
	public void printArray(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" "); 
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of elements you want to add in an array");
  int n=sc.nextInt();
  int ar[]=new int[n];
  for(int i=0;i<n;i++)
  {
	  ar[i]=sc.nextInt();
  }
  BubbleSort bS=new BubbleSort();
  bS.bubbleSort(ar,n);
  bS.printArray(ar);
	}

}
