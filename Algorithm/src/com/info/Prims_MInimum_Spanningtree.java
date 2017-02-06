package com.info;

public class Prims_MInimum_Spanningtree {
	
	public static int V=5;
	public int minSet(int key[],Boolean mstSet[])
	{
		int min=Integer.MAX_VALUE,min_index=-1;
		for(int v=0;v<V;v++)
		{
			if(mstSet[v]==false && key[v]<min )
			{
				min=key[v];
				min_index=v;
			}
		}
		return min_index;
	}
	public void printMst(int parent[],int V,int graph[][])
	{
		for(int i=1;i<V;i++)
		{
			System.out.println(parent[i] + " -> "+ i+" --> "+graph[i][parent[i]])                                                                       ;
		}
	}
	public void minimumTree(int graph[][])
	{
		
		int key[]=new int[V];
		int parent[]=new int[V];
		Boolean mstSet[]=new Boolean[V];
		
		for(int i=0;i<V;i++)
		{
			key[i]=Integer.MAX_VALUE;
			mstSet[i]=false;
		}
		
		key[0]=0;
		parent[0]=-1;
		for(int count=0;count<V-1;count++)
		{
			int u=minSet(key,mstSet);
			mstSet[u]=true;
			
			for(int v=0;v<V;v++)
			{
				if(graph[u][v]!=0 && mstSet[v]==false && graph[u][v]<key[v])
				{
					key[v]=graph[u][v];
					parent[v]=u;
				}
			}
		}
		printMst(parent,V,graph);
	}
	

	public static void main(String[] args) {

		int graph[][]=new int[][]{{0, 2, 0, 6, 0},
								  {2, 0, 3, 8, 5},
								  {0, 3, 0, 0, 7},
								  {6, 8, 0, 0, 9},
								  {0, 5, 7, 9, 0},
               						};
		Prims_MInimum_Spanningtree mst=new Prims_MInimum_Spanningtree();
		mst.minimumTree(graph);

	}

}
