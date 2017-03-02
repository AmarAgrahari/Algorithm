/*In this program we have to find longest Palindromic subsequence in a string dynamically
 * for example:
 * if the given sequence is “BBABCBCAB”,
 * then the output should be 7 as “BABCBAB” is the longest palindromic subsequence in it. 
 * “BBBBB” and “BBCBB” are also palindromic subsequences of the given sequence, but not the longest ones.*/

/* NOTE : IN THIS PROGRAM WE ARE ONLY FILLING HALF THE MATRIX I.E THE ABOVE MATRIX*/
package com.DynamicProgramming;

import java.util.Scanner;

public class LongestPalindromic_dynamic {

	public int lps(char ch[])
	{
		int n=ch.length;
		int l[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			l[i][i]=1;  //assigning 1 because any word with length 1 is a palindrome
		}
		
		//now we are checking all the palindrome from length=2 thats why we are using one more loop of cl
		for(int cl=2;cl<=n;cl++)
		{
			for(int i=0;i<n-cl+1;i++)
			{
				int j=i+cl-1;        //i=0 and j=1 thus firstly length=2 string are checked
				if(ch[i]==ch[j] && cl==2)
					l[i][j]=2;
				else if(ch[i]==ch[j])
				{
					l[i][j]=l[i+1][j-1]+2;
				}
				else
					l[i][j]=max(l[i][j-1],l[i+1][j]);
			}
		}
		return l[0][n-1];
	}
	
	//defining max
	public int max(int a,int b)
	{
		return a>b?a:b;
	}
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		String s=in.next();
		//changing string to character array
		char ch[]=s.toCharArray();
		int length=s.length();//length of string
		LongestPalindromic_dynamic lps_r=new LongestPalindromic_dynamic();
		int m=lps_r.lps(ch);
		System.out.println(m);

	}

}
