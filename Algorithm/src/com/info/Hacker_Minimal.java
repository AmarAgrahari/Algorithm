package com.info;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Hacker_Minimal {




	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	       
	        long min = in.nextLong();
	        long max = in.nextLong();
	        double numerator=Double.MAX_VALUE;
	        double denominator=Double.MAX_VALUE;
	       double minimum=Double.MAX_VALUE;
	        for(double i= min;i<=max;i++)
	        {
	        	double diff1=Math.abs(((i*3)/i)-3.1415926535897932384626433832795028841971693993751);
	        double diff2=Math.abs((((i*3)+1)/i)-3.1415926535897932384626433832795028841971693993751);
	        int result=Double.compare(diff1, diff2);
	        	if(result<=0)
	        	{
	        		if(Double.compare(minimum, diff1)>=0)
	        		{
	        			minimum=diff1;
	        			
	        			/*numerator= (i*3);
	        			denominator=i;*/
	        			if(Double.compare(denominator, i)>0)
	        			{
	        				denominator=i;
	        				numerator=i*3;
	        			}
	        			else
	        				denominator=denominator;
	        		}
	        	}
	        	else
	        	{
	        		if(Double.compare(minimum, diff2)>=0)
	        		{
	        			minimum=diff2;
	        			if(Double.compare(denominator, i)<0)
	        			{
	        				denominator=i;
	        				numerator=(i*3)+1;
	        			}
	        			else
	        				denominator=denominator;
	        		}
	        	}
	        	
	        }
	        System.out.println((int)numerator+"/"+(int)denominator);
	    }
	}