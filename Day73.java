/*
Topic:- Mini-Max Sum

Link:- https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true

Problem:-
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

arr = [1,3,5,7,9]

The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. The function prints

16 24
Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

arr: an array of 5 integers

Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

Input Format

A single line of five space-separated integers.

Constraints

1<=arr[i]<=10^9

Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)


Sample Input

1 2 3 4 5


Sample Output

10 14


Explanation

The numbers are 1, 2, 3, 4, and 5. Calculate the following sums using four of the five integers:

Sum everything except 1, the sum is 2+3+4+5.

Sum everything except 2, the sum is 1+3+4+5.

Sum everything except 3, the sum is 1+2+4+5.

Sum everything except 4, the sum is 1+2+3+5.

Sum everything except 5, the sum is 1+2+3+4.

Hints: Beware of integer overflow! Use 64-bit Integer.

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
   public static void miniMaxSum() {
     Scanner in = new Scanner(System.in);
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++){
            long n = in.nextLong();
            sum += n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println((sum - max) + " " + (sum - min));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Result.miniMaxSum();

        bufferedReader.close();
    }
}
