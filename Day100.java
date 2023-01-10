/*
Topic:- Save the Prisoner!

Link:- https://www.hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=true

Problem:-

A jail has a number of prisoners and a number of treats to pass out to them. Their jailer decides the fairest way to divide the treats is to seat the prisoners around a circular table in sequentially numbered chairs. A chair number will be drawn from a hat. Beginning with the prisoner in that chair, one candy will be handed to each prisoner sequentially around the table until all have been distributed.

The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes awful. Determine the chair number occupied by the prisoner who will receive that candy.

Example
n = 4
m = 6
s = 2

There are 4 prisoners, 6 pieces of candy and distribution starts at chair 2. The prisoners arrange themselves in seats numbered 1 to 4. Prisoners receive candy at positions 2, 3, 4, 1, 2, 3 . The prisoner to be warned sits in chair number 3.

Function Description

Complete the saveThePrisoner function in the editor below. It should return an integer representing the chair number of the prisoner to warn.

saveThePrisoner has the following parameter(s):

int n: the number of prisoners
int m: the number of sweets
int s: the chair number to begin passing out sweets from

Returns

int: the chair number of the prisoner to warn


Input Format

The first line contains an integer, t, the number of test cases.
The next t lines each contain 3 space-separated integers:

n : the number of prisoners
m : the number of sweets
s : the chair number to start passing out treats at


Constraints

1 <= t <= 100
1 <= n,m <= 10^9
1 <= s <= n

Sample Input 0

2
5 2 1
5 2 2
Sample Output 0

2
3



Solution:-
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            int result = (m + s - 1) % n;
            if(result == 0)
                result = n;
            System.out.println(result);
        }
        
    }
}
