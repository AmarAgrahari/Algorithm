package com.DynamicProgramming;

import java.util.HashSet;
import java.util.Scanner;

public class Eggdrop_dynamic {

	public int eggDrop(int n,int k)
	{
		int eggdrops[][]=new int[n+1][k+1];
		for(int i=0;i<=k;i++)
		{
			eggdrops[1][i]=i;
		}
		for(int j=1;j<=n;j++)
		{
			eggdrops[j][1]=1;
			eggdrops[j][0]=0;
		}
		
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=k;j++)
			{
				eggdrops[i][j]=Integer.MAX_VALUE;
				for(int m=1;m<=j;m++)
				{
					int res=1+max(eggdrops[i-1][m-1],eggdrops[i][j-m]);
					if(res<eggdrops[i][j])
					{
						eggdrops[i][j]=res;
					}
				}
			}
		}
		
		return eggdrops[n][k];
	}

	private int max(int a, int b) {
		
		return a>b?a:b;
	}
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of eggs");
		int eggs=sc.nextInt();
		System.out.println("Enter number of floors");
		int floor=sc.nextInt();
		Eggdrop_dynamic eg=new Eggdrop_dynamic();
		int result=eg.eggDrop(eggs,floor);
		System.out.println(result);


	}

}
