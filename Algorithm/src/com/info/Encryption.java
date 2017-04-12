/*HackerRank problem Encryption

path: Algorithm->Implementation->Encryption*/
package com.info;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.replaceAll("\\s", "");
		/*System.out.println(s);*/
		int column=(int) Math.ceil(Math.sqrt(s.length()));
		for(int i=0;i<column;i++)
		{
			int j=i;
			while(j<s.length())
			{
				System.out.print(s.charAt(j));
				j=j+column;
				}
			System.out.print(" ");
		}
		System.out.println("");
	}

}
