package com.info;
import java.lang.*;

public class Djikstra_Shortest_Path_showpath {
 public static int V=9;
 
	
 public int min_dist(int dist[],Boolean sptSet[])
 {
	 int min_index=-1;
	 int min=Integer.MAX_VALUE;
	 for(int v=0;v<V;v++)
	 {
		 if(sptSet[v]==false && dist[v]<=min)
		 {
			 min=dist[v];
			 min_index=v;
		 }
	 }
	 return min_index;
 }
	
	public void dijkstra(int graph[][])
	{
  int dist[]=new int[V];
  int parent[]=new int[V];
  Boolean sptSet[]=new Boolean[V];
  for(int i=0;i<V;i++)
  {
	  dist[i]=Integer.MAX_VALUE;
	  sptSet[i]=false;
  }
  dist[0]=0;
  parent[0]=-1;
  for(int count=0;count<V-1;count++)
  {
	  int u=min_dist(dist,sptSet);
	sptSet[u]=true;
	  for(int v=0;v<V;v++)
	  {
		  if(!sptSet[v] && dist[u]!=Integer.MAX_VALUE && graph[u][v]!=0 && dist[u]+graph[u][v]<dist[v])
		  {
			  dist[v]=dist[u]+graph[u][v];
			  parent[v]=u;
		  }
	  }
  }
  printTree(V,dist,parent);
	}
	
	public void printPath(int parent[],int j)
	{
		if(parent[j]==-1)
			return;
		printPath(parent,parent[j]);
		System.out.print(j+" ");
	}
	public void printTree(int V,int dist[],int parent[])
	{
		System.out.println("Dijkstra's Shortest Path Algorithm");
		System.out.print("Vertex\t Distance\t Path");
		for(int i=0;i<V;i++)
		{
			System.out.print("\n0"+" -> "+i+"\t "+dist[i]+"\t\t "+0+" ");
			printPath(parent,i);
		}
	}
	public static void main(String[] args) {
		int graph[][]=new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                				  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                				  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                				  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                				  {0, 0, 0, 9, 0,10, 0, 0, 0},
                				  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                				  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                				  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                				  {0, 0, 2, 0, 0, 0, 6, 7, 0}
               						};
Djikstra_Shortest_Path_showpath ds=new Djikstra_Shortest_Path_showpath();
ds.dijkstra(graph);
	}

}
