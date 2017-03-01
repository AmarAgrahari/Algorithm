/*In this problem we are given length of the rod as n and the prices of the pieces...
we have to find the maximum amount we can get from the pieces

here we use price[i]+cutRod(price,n-i-1)
were price means price of a particular piece
and cutRod(price,n-i-1) means best price we can get for the other piece
example:
(1,7) we check the price of 1 and then we find the best possible max price we can get of 7....it can be found by 1111111 or
1222 or 223 or 34 or 70 or 211111 .....
*/

package com.DynamicProgramming;

import java.util.Scanner;

public class RodCutting_Recursive {

	public int cutRod(int price[],int n)
	{
		if(n<=0)
			return 0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			 max=Math.max(max, price[i]+cutRod(price, n-i-1) );
		}
		return max;
	}
	
	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int price[]=new int[n];
		for(int i=0;i<n;i++)
		{
			price[i]=sc.nextInt();
		}
	  RodCutting_Recursive r=new RodCutting_Recursive();
	int max=  r.cutRod(price,n);
	System.out.println(max);
	}

}
