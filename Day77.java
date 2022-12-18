/*

Topic:- Apple and Orange

Link:- https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true

Problem:-
Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.

In the diagram below:

    The red region denotes the house, where s is the start point, and t is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right. 
    Assume the trees are located on a single point, where the apple tree is at point a , and the orange tree is at point b
    When a fruit falls from its tree, it lands d  units of distance from its tree of origin along the x-axis. *A negative value of d . means the fruit fell d  units to the tree's left, and a positive value of d means it falls d units to the tree's right. *



Function Description

Complete the countApplesAndOranges function in the editor below. It should print the number of apples and oranges that land on Sam's house, each on a separate line.

countApplesAndOranges has the following parameter(s):

    s: integer, starting point of Sam's house location.
    t: integer, ending location of Sam's house location.
    a: integer, location of the Apple tree.
    b: integer, location of the Orange tree.
    apples: integer array, distances at which each apple falls from the tree.
    oranges: integer array, distances at which each orange falls from the tree.

Input Format

The first line contains two space-separated integers denoting the respective values of s and t.
The second line contains two space-separated integers denoting the respective values of a and b.
The third line contains two space-separated integers denoting the respective values of m and n.
The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a .
The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.


Constraints

  1 <= s,t,a,b,m,n <= 10^5
  -10^5 <= d <= 10^5
   a < s < t <b

Output Format

Print two integers on two different lines:

   1. The first integer: the number of apples that fall on Sam's house.
   2 . The second integer: the number of oranges that fall on Sam's house.


Solution:-
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int app = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if (a + apple[apple_i] >= s && a + apple[apple_i] <= t) {
                app++;
            }
        }
        int[] orange = new int[n];
        int or = 0;
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if (b + orange[orange_i] >= s && b + orange[orange_i] <= t) {
                or++;
            }
        }
        
        System.out.println(app);
        System.out.println(or);
    }
}
