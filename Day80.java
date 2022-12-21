/*
Topic:- Breaking the Records

Link:- https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true

Problem:-
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

For example, assume her scores for the season are represented in the array scores=[12, 24, 10, 24]. Scores are in the same order as the games played. She would tabulate her results as follows:

                                 Count
Game  Score  Minimum  Maximum   Min Max
 0      12     12       12       0   0
 1      24     12       24       0   1
 2      10     10       24       1   1
 3      24     10       24       1   1


Given the scores for a season, find and print the number of times Maria breaks her records for most and least points scored during the season.


Function Description

Complete the breakingRecords function in the editor below. It must return an integer array containing the numbers of times she broke her records. Index 0 is for breaking most points records, and index 1 is for breaking least points records.

breakingRecords has the following parameter(s):

scores: an array of integers


Input Format

The first line contains an integer n, the number of games.
The second line contains n space-separated integers describing the respective values of score0, score1, ....., score n-1.


Constraints
1 <= n <= `1000
0 <= scores[i] <= `10^8

Output Format

Print two space-seperated integers describing the respective numbers of times the best (highest) score increased and the worst (lowest) score decreased.

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
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        
        int most = score[0];
        int least = score[0];
        int mr = 0;
        int lr = 0;
        for( int i = 1; i < n; i++ ){
          if(score[i] > most){
                mr++;
                most = score[i];
            }
            if( score[i] < least ){
                lr++;
                least = score[i];
            }
        }
        
        System.out.print(mr + " " + lr);
    }
}
