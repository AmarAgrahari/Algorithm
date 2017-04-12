package com.DynamicProgramming;

import java.util.Scanner;

public class Eggdrop_recursive {
	
	public int eggDrop(int egg,int floor)
	{
		if(egg==1)
			return floor;
		
		if(floor==1 || floor==0 )
			return floor;
		int min=Integer.MAX_VALUE;
		for(int i=01;i<=floor;i++)
		{
			int res=max(eggDrop(egg, floor-i),eggDrop(egg-1, i-1));
			if(res<min)
				min=res;
		}
		return min+1;
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
		Eggdrop_recursive eg=new Eggdrop_recursive();
		int result=eg.eggDrop(eggs,floor);
		System.out.println(result);

	}

}
