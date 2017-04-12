package com.info;

/*This program  is used to rotate all the element left by a specific time */
/*in case of left rotation : (i+d)%n*/
/*in case of right rotation : (i+d-1)%n*/
import java.util.Scanner;

public class LeftRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(ar[((i+d-1)%n)]+" ");
	}

	}

}
