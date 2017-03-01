package com.info;

import java.util.Scanner;

public class Hackerrank_bonapetite {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
    {
    	arr[i]=sc.nextInt();
    	sum+=arr[i];
    }
    
    int c=sc.nextInt();
    int diff=sum-arr[m];
    int netamount=diff/2;
    if(m==netamount)
    	System.out.println("Bon Appetit");
    else
    	System.out.println(m-netamount);

	}

}
