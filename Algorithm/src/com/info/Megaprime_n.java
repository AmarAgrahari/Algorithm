package com.info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Megaprime_n{
	
	
	public static long sum=0;
	public static List<Long> list=new ArrayList<>();

	public boolean isprime(long n)
	{
		/*if (n <= 1)  return false;
	    if (n <= 3)  return true;
	 
	    // This is checked so that we can skip 
	    // middle five numbers in below loop
	    if (n%2 == 0 || n%3 == 0) return false;
	 
	    for (int i=5; i*i<=n; i=i+6)
	        if (n%i == 0 || n%(i+2) == 0)
	           return false;
	 
	    return true;*/
		
		//---------------2222222222222222
		 /* if (n < 2) {
		         explicit handling of numbers less than 2, since 0 
		           and 1 are not prime 
		           return false;
		    }
			
		     checking divisibility with all possible divisors 
		     all possible divisors could be numbers between  
		       2 and sqrt(n) (both inclusive)  
			for (int div = 2; div <= Math.sqrt (n); div++) {
				if (n % div == 0) {
				 Number is divisible by div so not prime 
		                    return false;
				}
			}
			 Passed tests with all possible divisors
			   and hence the number is prime 
			return true;*/
		
		//--------------------3333333333
		if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    long sqrtN = (long)Math.sqrt(n)+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
	    return true;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long first=sc.nextLong();
		long last=sc.nextLong();
		
		for(long i=  first;i<=last;i++)
		{
			int c=0;
			Megaprime_n m=new Megaprime_n();
			char ch=String.valueOf(i).charAt(0);
			if(ch=='2' || ch=='3' || ch=='5' || ch=='7')
			{
			if(m.isprime(i)==true && i!=1)
			{

				int mn=(int)i;
				while(mn>0)
				{
				int r=(mn)%10;
                char m2=String.valueOf(r).charAt(0);
				
				if(m2=='2'|| m2=='3'  || m2=='5'  || m2=='7' )
				{
					c++;
				}
				else
				{
					break;
				}
				mn=mn/10;
				}
				int length=String.valueOf(i).length();
				if(length==c)
				{
					sum++;
				}
			}
	
		}
		}
		
		System.out.println(sum);
		
	}

}
