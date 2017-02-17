package com.info;
/*The reason for adding and subtracting only once per interval is because if you try to loop through the entire interval every time,
the code takes too long (complexity of O(n^2)). If you add at the beginning of the interval and subtract from (one past)
the end of the interval, you have a fixed number of operations per interval (complexity O(n)) 
instead of potentially the same number as there are elements in the array.
This results in an array that actually records differences to each element as opposed to the value of those elements themselves. 
By looping through the difference array and recording the highest value of the sum as you go along,
you get the same result as you would by going through the value array.
Here's an example. Let's say A is the difference array and a is the value array:
n = 5
m = 3

operation     a                       A
(start)       [0,0,0,0,0]             [0,0,0,0,0]
1 2 100       [100,100,0,0,0]         [100,0,-100,0,0]
2 3 100       [100,200,100,0,0]       [100,100,-100,-100,0]
4 5 100       [100,200,100,100,100]   [100,100,-100,0,0]*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlgorithmCrush_HackerRank {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int queries = s.nextInt();
    
    int[] buffer = new int[n + 1];
    for(int i = 0; i < queries; ++i) {
        int p = s.nextInt();
        int q = s.nextInt();
        int sum = s.nextInt();
        buffer[p - 1] += sum;
        buffer[q] -= sum;
    }
        
    long max = 0;
    long runningSum = 0;
        
    for(int i = 0; i < n; ++i) {
        runningSum += buffer[i];
        max = Math.max(max, runningSum);
    }
        
    System.out.println(max);
   }
}