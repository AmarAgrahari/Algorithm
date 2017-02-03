package com.info;

import java.util.Scanner;

public class GreedyAlgo_ActivitySelection {

	/*method to sort both the array on the basis of finish or end time*/
	public void bubbleSort(int start[],int end[],int n)
	{
		for(int i=0;i<n-1;i++)
			{
			for(int j=0;j<n-i-1;j++)
			{
				if(end[j]>end[j+1])
				{
					/*swapping elements of both the array*/
					int temp=end[j];
					end[j]=end[j+1];
					end[j+1]=temp;
					int temp1=start[j];
					start[j]=start[j+1];
					start[j+1]=temp1;
			
				}
			}
			
		}
		
	}
	
	/*method to print both the array*/
	public void printArray(int start[],int end[],int n)
	{
		System.out.println("printing start array");
		for(int i=0;i<n;i++)
		{
			System.out.print(start[i]+" ");
		}
		System.out.print("\n");
		System.out.println("printing end array");
		for(int j=0;j<n;j++)
		{
			System.out.print(end[j]+" ");
		}
		System.out.print("\n");

	}
	
	/*printing activities that a person can maximum do*/
	public void activitySelection(int start[],int end[],int n)
	{
		int i=0;
		System.out.println("Selected activity are");
		System.out.print(i+" ");
		for(int j=1;j<n;j++)
		{
			if(start[j]>end[i])
			{
				System.out.print(j+" ");
				i=j;
			}
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element you want to add");
		int n=sc.nextInt();
	    int start[]=new int[n];
	    int end[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("Enter start time");
	    	start[i]=sc.nextInt();
	    	System.out.println("Enter end time");
	    	end[i]=sc.nextInt();
	    }
	    GreedyAlgo_ActivitySelection gds=new GreedyAlgo_ActivitySelection();
	    gds.bubbleSort(start,end,n);
	    gds.printArray(start,end,n);
	    gds.activitySelection(start,end,n);
	    

	}

}
