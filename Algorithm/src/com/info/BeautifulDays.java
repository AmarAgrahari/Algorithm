package com.info;

import java.util.Scanner;

/*HackerRank
https://www.hackerrank.com/challenges/beautiful-days-at-the-movies?h_r=next-challenge&h_v=zen
*/
public class BeautifulDays {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int k=sc.nextInt();
		
		int count=0;
		for(int i=a;i<=b;i++)
		{
			String rev=new StringBuffer().append(i).reverse().toString();
			int reverse=Integer.parseInt(rev);
			int diff=i-reverse;
			if(diff%k==0)
				count++;
			}
		System.out.println(count);

	}

}
