/*This program is about sorting even element in increasing order and odd element in decreasing order*/
package com.info;

import java.util.Scanner;

public class Even_odd {

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
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int length_odd,length_even;
		if(n%2==0)
		{
			 length_odd=n/2;
			 length_even=n/2;
			
		}
		else
		{
			length_odd=(n/2)+1;
			 length_even=n/2;
		}
		int k=0;
		int l=0;
		 int even[]=new int[length_even];
		 int odd[]=new int[length_odd];
		int ar[]=new int[n];
 
		for(int i=0;i<n;i++)
   {
	   ar[i]=sc.nextInt();
   }
   for(int j=0;j<n;j++)
   {
	   if((j+1)%2==0)
	   {
		   even[k]=ar[j];
		   k++;
	   }
	   else
	   {
		   odd[l]=ar[j];
		   l++;
	   }
   }
	Even_odd e=new Even_odd();
	e.quickSort(even, 0, length_even-1);
	e.quickSort(odd, 0, length_odd-1);
	for(int s=0;s<length_even;s++)
		ar[s]=even[s];
	for(int z=0;z<length_odd;z++)
		ar[length_odd+z-1]=odd[length_odd-z-1];
	
	e.printArray(ar);

}
}
