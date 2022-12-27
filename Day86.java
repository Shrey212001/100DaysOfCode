/*
Topic:- Sales by Match

Link:- https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true

Problem:-

John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs
of socks with matching colors there are.
For example, there are n=7 socks with colors ar=[1,2,1,2,1,3,2].
There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns

int: the number of pairs
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers, , the colors of the socks in the pile.

Constraints

 where 
Sample Input

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
Sample Output

3
Explanation

There are three pairs of socks.


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

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, Integer> colors = new HashMap<Integer, Integer>();
        
        while(n-- > 0) {
            int c = scan.nextInt();
            Integer frequency = colors.get(c);
            
            // If new color, add to map
            if(frequency == null) {
                colors.put(c, 1);
            }
            else { // Increment frequency of existing color
                colors.put(c, frequency + 1);
            }
        }
        scan.close();
        
        // Count and print the number of pairs
        int pairs = 0;
        for(Integer frequency : colors.values()) {
            pairs += frequency >> 1;
        }
        System.out.println(pairs);
    }
}
