/*
Topic:- Divisible Sum Pairs

Link:- https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true

Problem:-
You are given an array of n integers,ar=ar[0],ar[1],…,ar[n-1] , and a positive integer,k . Find and print the number of (i,j) pairs where i<j and ar[i] + ar[j] is divisible by .

For example,ar = [1,2,3,4,5,6]  and k=5. Our three pairs meeting the criteria are [1,4],[2,3] and [4,6].

Function Description

Complete the divisibleSumPairs function in the editor below. It should return the integer count of pairs meeting the criteria.

divisibleSumPairs has the following parameter(s):

n: the integer length of array ar
ar: an array of integers
k: the integer to divide the pair sum by
Input Format

The first line contains 2 space-separated integers,n  and k.

The second line contains n space-separated integers describing the values of ar[ar[0],ar[1],….,ar[n-1]].

Constraints

2<=n<=100
1<=k<=100
1<=ar[i]<=100
Output Format

Print the number of (i,j) pairs where i<j and  a[i]+a[j]  is evenly divisible by k.

Sample Input

6 3

1 3 2 6 1 2
Sample Output

5


Solution:-

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) { 
  int cnt=0;
  Scanner in = new Scanner(System.in);
     int n = in.nextInt();
 int k = in.nextInt();
  int a[] = new int[n];
 for(int a_i=0; a_i < n; a_i++){
    a[a_i] = in.nextInt();
    }
    for(int a_i=0; a_i < n-1; a_i++){
    for(int a_j=a_i+1; a_j< n; a_j++){
    if( (a[a_i]+a[a_j])%k==0)
    cnt++;
}
}
System.out.println(cnt);
}
}
