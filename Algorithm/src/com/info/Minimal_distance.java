package com.info;

import java.util.Scanner;

public class Minimal_distance {
public static double pi=3.1415926535897932384626433832795028841971693993751;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int start=sc.nextInt();
int end=sc.nextInt();
double min=Double.MAX_VALUE;
int num=0;
int den=0;
for(int i=start;i<=end;i++)
{
	int num1=(int) Math.round(pi*i);
	/*System.out.println(num1);*/
	double res=Math.abs(pi-(double)(num1/(double)i));
	/*System.out.println(res);*/
	if(res<min)
	{
		min=res;
		num=num1;
		den=i;
	}
	
}
System.out.println(num+"/"+den);
	}

}
