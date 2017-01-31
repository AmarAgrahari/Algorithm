/*Given an array of n integers where each value represents number of chocolates in a packet.
Each packet can have variable number of chocolates. 
There are m students, the task is to distribute chocolate packets such that :
Each student gets one packet.
The difference between the number of chocolates in packet with maximum chocolates and packet
with minimum chocolates given to the students is minimum.*/
package com.info;

import java.util.Scanner;

public class Chocolate_distribution {
	
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
	public int min_difference(int ar[],int n,int m)
	{
		int min=Integer.MAX_VALUE;
		if(n<m)
			return -1;
		
			
					int first=0;
					int last=0;
			for(int i=0;i+m-1<n;i++)
			{
				int diff=ar[i+m-1]-ar[i];
				if(diff<min)
				{
					min=diff;
					last=i+m-1;
					first=i;
				}
				
			}
		
		return (ar[last]-ar[first]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter the number of elements of an array");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter the number of children");
    int m=sc.nextInt();
    int ar[]=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<n;i++)
    {
    	ar[i]=sc.nextInt();
    }
    Chocolate_distribution cd=new Chocolate_distribution();
    cd.quickSort(ar,0,n-1);
    cd.printArray(ar);
     int diff=cd.min_difference(ar,n,m);
     System.out.println("min diffrenece is "+diff);
	}

}
