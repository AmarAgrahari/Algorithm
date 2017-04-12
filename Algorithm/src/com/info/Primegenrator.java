
package com.info;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Primegenrator {
	public static long lookup[]=new long[10000];
	
	public void prime(int a,int b)
	{
		for(int j=a;j<=b;j++)
		{
			if(lookup[ (j-1)]==0)
			{
				int flag=0;
				if(j!=1)
				{
				for(int k=1;k<=Math.sqrt(j);k++)
				{
					if(j%k==0)
						flag++;
				}
				if(flag==1)
					lookup[(j-1)]=j;
			}
			}
		}
	}
	public void print(int a,int b)
	{
		for(int l=a;l<=b;l++)
		{
			if(lookup[(l-1)]!=0)
			{
				System.out.println(lookup[(l-1)]);
			}
				
		}
		System.out.println("");
	}

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	int a=sc.nextInt();
	int b=sc.nextInt();

	Primegenrator pm=new Primegenrator();
	pm.prime(a,b);
	pm.print(a,b);
	}
	
	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println(totalTime);
	}

}
