package com.info;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public long minSet(long dist[],Boolean spSet[],int vertex)
	{
		long min=Integer.MAX_VALUE,min_index=-1;
		for(int v=0;v<vertex;v++)
		{
			if(spSet[v]==false && dist[v]<min)
			{
				min=dist[v];
				min_index=v;
			}
		}
		return min_index;
	}
	public void djikstra(int graph[][],int start,int vertex)
	{
		long dist[]=new long[vertex];
		Boolean spSet[]=new Boolean[vertex];
		Arrays.fill(dist, Integer.MAX_VALUE);
		Arrays.fill(spSet, false);
		
	
			dist[0]=0;
		for(int count=0;count<vertex-1;count++)
		{
			long u=minSet(dist,spSet,vertex);
			spSet[(int) u]=true;
			
			for(int v=0;v<vertex;v++)
			{
				if(spSet[v]==false && graph[(int) u][v]!=-1 && graph[(int) u][v]<dist[v])
				{
					dist[v]=graph[(int) u][v];
					System.out.println(dist[v]);
				}
			}
		}
		
		long sum=0;
		for(int i=0;i<vertex;i++)
		{
			sum=sum+dist[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int vertex=sc.nextInt();
	int edge=sc.nextInt();
	int graph[][]=new int[vertex][vertex];
	for(int i=0;i<vertex;i++)
	{
		for(int j=0;j<vertex;j++)
		{
			graph[i][j]=-1;
		}
	}
	for(int i=0;i<edge;i++)
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int W=sc.nextInt();
		
		graph[a-1][b-1]=W;
		graph[b-1][a-1]=W;
	}
	int start=sc.nextInt();
	for(int i=0;i<vertex;i++)
	{
		for(int j=0;j<vertex;j++)
		{
      System.out.print(graph[i][j]+" ");
	}
		System.out.println("");
	}
	 Solution s=new Solution();
    s.djikstra(graph,start,vertex);
	}

}
