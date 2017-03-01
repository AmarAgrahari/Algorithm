package com.info;

import java.util.Scanner;

public class megaprime_new {
	public static int sum=0;
	 public int power(int x,  int y, int p)
	{
	    int res = 1;      // Initialize result
	    x = x % p;  // Update x if it is more than or
	                // equal to p
	    while (y > 0)
	    {
	        // If y is odd, multiply x with result
	        if (y%2==1)
	            res = (res*x) % p;
	 
	        // y must be even now
	        y = y>>1; // y = y/2
	        x = (x*x) % p;
	    }
	    return res;
	}
	 
	// This function is called for all k trials. It returns
	// false if n is composite and returns false if n is
	// probably prime.
	// d is an odd number such that  d*2<sup>r</sup> = n-1
	// for some r >= 1
	public boolean miillerTest(int d, int n)
	{
	    // Pick a random number in [2..n-2]
	    // Corner cases make sure that n > 4
	    int a = (int) (2 + Math.random() % (n - 4));
	 
	    // Compute a^d % n
	    int x = power(a, d, n);
	 
	    if (x == 1  || x == n-1)
	       return true;
	 
	    // Keep squaring x while one of the following doesn't
	    // happen
	    // (i)   d does not reach n-1
	    // (ii)  (x^2) % n is not 1
	    // (iii) (x^2) % n is not n-1
	    while (d != n-1)
	    {
	        x = (x * x) % n;
	        d *= 2;
	 
	        if (x == 1)      return false;
	        if (x == n-1)    return true;
	    }
	 
	    // Return composite
	    return false;
	}
	 
	// It returns false if n is composite and returns true if n
	// is probably prime.  k is an input parameter that determines
	// accuracy level. Higher value of k indicates more accuracy.
	public boolean isPrime(int n, int k)
	{
	    // Corner cases
	    if (n <= 1 || n == 4)  return false;
	    if (n <= 3) return true;
	 
	    // Find r such that n = 2^d * r + 1 for some r >= 1
	    int d = n - 1;
	    while (d % 2 == 0)
	        d /= 2;
	 
	    // Iterate given nber of 'k' times
	    for (int i = 0; i < k; i++)
	         if (miillerTest(d, n) == false)
	              return false;
	 
	    return true;
	}
	public static void main(String[] args) {
		int k=10;
		Scanner sc=new Scanner(System.in);
		long first=sc.nextLong();
		long last=sc.nextLong();
		
		for(long i=  first;i<=last;i++)
		{
			int c=0;
			megaprime_new m=new megaprime_new();
			char ch=String.valueOf(i).charAt(0);
			if(ch=='2' || ch=='3' || ch=='5' || ch=='7')
			{
			if(m.isPrime((int)i,k)==true && i!=1)
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


