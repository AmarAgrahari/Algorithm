package com.info;

public class BinaryMain {
	public int binarySearch(int arr[],int x)
	{
		int l=0;
		int r=arr.length-1;
		
		while(l<=r)
		{
			int m=l+(r-l)/2;
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		
   BinaryMain b=new BinaryMain();
   int arr[]={1,3,5,8,9,50,100,150,200};

   int x=200;
   for(int i=0;i<arr.length;i++)
   {
	   System.out.println(arr[i]);
   }
   int result=b.binarySearch(arr, x);
   if(result==-1)
	   System.out.println("Element not found ");
   else
	   System.out.println("element found at index"+result);
	}

}
