/*This is program is to divide the array into two sub-array which has equal average*/
package com.info;

import java.util.Scanner;

public class Subarray_equal_average {

	/**
	 * @param args
	 */
	public void equalAverage(int ar[],int start,int end)
	{
		int lsum=0;
		boolean found=false;
		for(int i=start;i<end-1;i++)
		{
			lsum+=ar[i];
			int rsum=0;
			for(int j=i+1;j<end;j++)
				rsum+=ar[j];
			if((lsum*(end-i-1))==(rsum*(i+1)))
			{
				System.out.println(""+start+" to "+i+" and "+(i+1)+" to "+(end-1)+" have equal average");
				found=true;
			}
		}
		if(found==false)
		{
			System.out.println("no subarray found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements you want to add");
    int n=sc.nextInt();
    int ar[]=new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<n;i++)
    {
    	ar[i]=sc.nextInt();
    	 }
     Subarray_equal_average ar1=new Subarray_equal_average();
     ar1.equalAverage(ar,0,n);
    
	}

}
