

/*you need to find the number of integers whose squares lie in the given boundary values. 
Hence, it is the same as finding the number of integers between the square roots of the given boundary values.
Since the values are inclusive, floor of the square root of upper boundary is subtracted to the ceil of the
square root of lower boundary which gives number of integers between them. 
1 is added to include the first one also*/

package com.info;
import java.util.Scanner;

public class Sherlock_And_Squares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		    Scanner sc=new Scanner(System.in);
		        int t=sc.nextInt();
		        while(t-->0)
		            {
		            int a=sc.nextInt();
		            int b=sc.nextInt();
		            System.out.println((long)Math.floor(Math.sqrt(b))-(long)Math.ceil(Math.sqrt(a))+1);
		        }
		    }
		

	}


