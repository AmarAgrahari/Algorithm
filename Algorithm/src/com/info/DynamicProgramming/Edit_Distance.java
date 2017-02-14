/*In this program we have given to string and we have to find the minimum operation 
that is required to convert one string into another
There are basically three operation to be performed i.e:
1.Insertion
2.Deletion
3.Substitution

In this program we check whether the last character of String 1 is matching the last character of string or not
if last character matches than we return both the string excluding last character 
else
we return minimum of left,up and diagonal element and add 1 to it
*/

package com.DynamicProgramming;

import java.util.Scanner;

public class Edit_Distance {


	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		Edit_Distance ed=new Edit_Distance();
		int minimum=ed.min_change(str1,str2,str1.length(),str2.length());
		System.out.println(minimum);
	}

	public int min_change(String str1, String str2, int length, int length2) {
     	int i=length;
     	int j=length2;
     	if(i==0) return length2;
     	if(j==0) return length;
     	if(str1.charAt(i-1)==str2.charAt(j-1))
     		return min_change(str1,str2,i-1,j-1);
     	else
     		return 1+( min(min_change(str1, str2, i, j-1),
     				min_change(str1,str2,i-1,j),
     				min_change(str1, str2, i-1, j-1)));
		
	}

	private int min(int a, int b, int c) {
	return (a<b)?((a<c)?a:c):((b<c)?b:c);
		
		
	}

}
