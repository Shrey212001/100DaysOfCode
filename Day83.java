/*
Topic:- Migratory Birds

Link:- https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true

Problem:-
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

Example
arr = [1, 1, 2, 2, 3]

There are two each of types 1 and 2, and one sighting of type 3. Pick the lower of the two types seen twice: type 1.


Function Description

Complete the migratoryBirds function in the editor below.
migratoryBirds has the following parameter(s):

int arr[n]: the types of birds sighted

Returns

int: the lowest type id of the most frequently sighted birds


Input Format

The first line contains an integer, n, the size of arr.
The second line describes arr as n space-separated integers, each a type number of the bird sighted.


Constraints
5 <= n <= 2 * 10^5
It is guaranteed that each type is 1, 2, 3, 4, or 5.



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
        int n = in.nextInt();
        int[] birds = new int[5];
        for (int i = 0; i < n; i++) birds[in.nextInt()-1]++;
        int max = 0;
        int id = 0;
        for (int i = 0; i < 5; i++) {
            if (birds[i] > max) {
                max = birds[i];
                id = i+1;
            }
        }
        System.out.println(id);
    }
}
