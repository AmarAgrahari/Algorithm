package com.info;

import java.util.Arrays;
import java.util.Scanner;

public class Megaprime {
	
	
	public static long sum=0;

	public boolean isprime(int number)
	{
		int flag=0;
		for(int i=1;i<=Math.sqrt(number);i++)
		{
			if((number)%i==0)
				flag++;
		}
	
		if(flag==1)
		return true;
		
		else
			return false;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long first=sc.nextLong();
		long last=sc.nextLong();
		if((first-last)<=1000000000)
		{
			 long lookup[]=new long[1000000];
Arrays.fill(lookup, -1);
		for(int i=(int) first;i<=last;i++)
		{
			int c=0;
		Megaprime m=new Megaprime();
		
	if(m.isprime(i)&& i!=1)
	{
		lookup[i]=i;
		int mn=(int)i;
		while(mn>0)
		{
			int r=(int)mn%10;
			if(lookup[r]==-1)
			{
			if(m.isprime(r)==true &&r!=1)
			{
				lookup[r]=r;
				c++;
			}
			}
			else
			{
				c++;
			}
			mn=mn/10;
		}
		int length=String.valueOf(i).length();
		if(length==c)
		{
			sum++;
		}
	}
	
		}
		}
		System.out.println(sum);
	}

}
