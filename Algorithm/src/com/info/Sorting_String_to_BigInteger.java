package com.info;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.text.*;

import java.util.regex.*;

public class Sorting_String_to_BigInteger {
	 public int partition(BigInteger arr[],int start,int end)
	 {
		 int pIndex=start;
		int pivot=end;
		 for(int i=start;i<end;i++)
		 {
			 if(arr[i].compareTo(arr[pivot])==-1)
			 {
				 BigInteger temp=arr[i];
				 arr[i]=arr[pIndex];
				 arr[pIndex]=temp;
				 pIndex=pIndex+1;
			 }
		 }
		 BigInteger temp1=arr[pivot];
		 arr[pivot]=arr[pIndex];
		 arr[pIndex]=temp1;
		 return pIndex;
	 }
	
	 public void printArray(BigInteger[] arr)
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	 }
	
	public void quickSort(BigInteger []arr,int start,int end)
	{
		if(start<=end)
		{
			int pIndex=partition(arr,start,end);
			quickSort(arr,start,pIndex-1);
			quickSort(arr,pIndex+1,end);
		}
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
     BigInteger arr[]=new BigInteger[n];
      for(int i=0;i<n;i++)
      {
    	  arr[i]=new BigInteger(unsorted[i]);
      }
     
      Sorting_String_to_BigInteger s=new Sorting_String_to_BigInteger();
      s.quickSort(arr,0,n-1);
      s.printArray(arr);
    }
}
