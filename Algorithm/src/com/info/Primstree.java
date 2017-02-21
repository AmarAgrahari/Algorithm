package com.info;

public class Primstree {
	public static int V=5;
	public int mst_key(int key[],Boolean mstSet[])
	{
		int min=Integer.MAX_VALUE,min_index=-1;
		for(int v=0;v<V;v++)
		{
			if(mstSet[v]==false && key[v]<min)
			{
				min_index=v;
				min=key[v];
				
			}
		}
		return min_index;
	}
	
	public void primSpanian(int graph[][])
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
		int u=mst_key(key,mstSet);
		mstSet[u]=true;
		
		for(int v=0;v<V;v++)
		{
			if(graph[u][v]!=0 && mstSet[v]==false && graph[u][v]<key[v])
			{
				parent[v]=u;
				key[v]=graph[u][v];
			}
		}
		}
		printMst(parent,V,graph);
	}
 public void printMst(int parent[],int V,int graph[][])
 {
	 for(int v=1;v<V;v++)
	 {
		 System.out.println(parent[v]+" -> "+v+" --->"+graph[v][parent[v]]);
	 }
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int graph[][]=new int[][]{{0, 2, 0, 6, 0},
				  				  {2, 0, 3, 8, 5},
				  				  {0, 3, 0, 0, 7},
				  				  {6, 8, 0, 0, 9},
				  				  {0, 5, 7, 9, 0},
									};
		Primstree pms=new Primstree();
		pms.primSpanian(graph);
		
	}

}
