/*
Topic:- Staircase

Link:- https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true

Problem:-

Staircase detail:
    
This is a staircase of size n = 4:


   #
  ##
 ###
####

Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.

Function Description:
           Complete the staircase function in the editor below.

staircase has the following parameter(s):
    int n: an integer

Print:

    Print a staircase as described above.

Input Format:

    A single integer, n , denoting the size of the staircase.

Constraints:

   0 < n <= 100.

Output Format:
    Print a staircase of size n using # symbols and spaces.

Note: The last line must have 0 spaces in it. 

Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.

Solution:-
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
public static void staircase(int n) 
{ for(int i = 1; i <= n; i++)
 { for(int j = 1; j <= n; j++) 
 { if(j <= n-i)
          System.out.print(" ");
    else
        System.out.print("#"); }

    System.out.println("");
}}}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
