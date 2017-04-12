package com.Hacker;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeroOneGame {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
	long m=sc.nextLong();
	long arr[]=new long[(int)m];
	ArrayList<Long> list=new ArrayList<>();
	for(int j=0;j<m;j++)
	{
		arr[j]=sc.nextLong();
		list.add(arr[j]);
	}
	if(!list.contains(1))
	{
		if(m%2==0)
			System.out.println("Bob");
		else
			System.out.println("Alice");
	}
	else if(!list.contains(0))
		System.out.println("Alice");
	else
	{
		int c=0;

	for(int k=1;k<m-1;k++)
	{
		if(list.get(k-1)==0 && list.get(k+1)==0)
		{
			list.remove(k);
			
			c++;
		}
	
	}
}

	}

}
}