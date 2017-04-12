package com.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class HackerRank_fibonacci {

 
	 public BigInteger fib(BigInteger a,BigInteger b,int n)
     {
     BigInteger f[]=new BigInteger[n];
     f[0]=a;
     f[1]=b;
     for(int i=2;i<n;i++)
    {
   BigInteger a1=(f[i-1].multiply(f[i-1]));    
   f[i]=f[i-2].add(a1);
     }
     return f[n-1];
 }
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
     BigInteger t1=sc.nextBigInteger();
     BigInteger t2=sc.nextBigInteger();
     int n=sc.nextInt();
     HackerRank_fibonacci s=new HackerRank_fibonacci();
     BigInteger m=s.fib(t1,t2,n);
    System.out.println(m);
 }
}