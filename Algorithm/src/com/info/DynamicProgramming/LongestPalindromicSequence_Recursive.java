/*In this program we have to find longest Palindromic subsequence in a string
 * for example:
 * if the given sequence is “BBABCBCAB”,
 * then the output should be 7 as “BABCBAB” is the longest palindromic subsequence in it. 
 * “BBBBB” and “BBCBB” are also palindromic subsequences of the given sequence, but not the longest ones.*/
package com.DynamicProgramming;

import java.util.Scanner;

public class LongestPalindromicSequence_Recursive {

	//creating function for longest common subsequence
	public int lps(char ch[],int f,int n)
	{
		//if array contain only one element
		if(f==n)
			return 1;
		
		//if there are only two element in the array
		if(ch[f]==ch[n] && n==f+1)
			return 2;
		
		//if first and the last element of the array matches the return lps(ch,f+1,n-1)+2
		if(ch[f]==ch[n])
			return lps(ch,f+1,n-1)+2;
		return max(lps(ch,f+1,n),lps(ch,f,n-1));
	}
	
	//defining max function
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
		LongestPalindromicSequence_Recursive lps_r=new LongestPalindromicSequence_Recursive();
		int m=lps_r.lps(ch,0,length-1);
		System.out.println(m);

	}

}
