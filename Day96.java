/*
Topic:- Utopian Tree

Link:- https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=true

Problem:-

The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. How tall will the tree be after  growth cycles?

For example, if the number of growth cycles is n = 5, the calculations are as follows:

Period  Height
0          1
1          2
2          3
3          6
4          7
5          14


Function Description

Complete the utopianTree function in the editor below.

utopianTree has the following parameter(s):

int n: the number of growth cycles to simulate

Returns

int: the height of the tree after the given number of cycles


Input Format

The first line contains an integer, t, the number of test cases.
t subsequent lines each contain an integer, n, the number of cycles for that test case.


Constraints
1 <= t <= 10
0 <= n <= 60



Solution:-
*/
import java.util.Scanner;
import java.util.Vector;

public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int numCases = stdin.nextInt();
        Vector<Long> cache = new Vector<>();
        cache.add(1L);
        for (int i = 0; i < numCases; i++) {
            int numCycles = stdin.nextInt();
            while(cache.size() <= numCycles) {
                if (cache.size() % 2 == 0) {
                    cache.add(cache.lastElement() + 1);                
                } else {
                    cache.add(cache.lastElement() * 2);
                }
            }
            System.out.println(cache.get(numCycles));
        }
    }
}
