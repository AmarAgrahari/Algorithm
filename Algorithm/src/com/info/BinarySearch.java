package com.info;

public class BinarySearch {

	int binarySearch(int arr[],int x)
	{
		int l=0;
		int r=arr.length-1;
		
		while(l<=r)
		{
			int m=l+(r-1)/2;
			if(arr[m]==x)
			{
			return m;
			}
			 if(arr[m]<x)
				l=m+1;
			else 
				r=m-1;
		}
		return -1;
	}
	BinarySearch()
	{
		System.out.println("inside binary search constructor");
	}

}
