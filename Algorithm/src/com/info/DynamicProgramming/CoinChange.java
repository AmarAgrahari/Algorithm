package com.DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
	
	public void coinchange(int cost[],int m,int n)
	{
		int table[]=new int[n+1];
		Arrays.fill(table, 0);
		table[0]=1;
		for(int i=0;i<m;i++)
		{
			for(int j=cost[i];j<=n;j++)
			{
				table[j]=table[j]+table[j-cost[i]];
			}
		}
		System.out.println("Change = " +table[n]);
	}

	public static void main(String[] args) {

		int coin[]={1,2,3};
		int n=4;
		int m=coin.length;
		CoinChange cc=new CoinChange();
		cc.coinchange(coin,m,n);
	}

}
