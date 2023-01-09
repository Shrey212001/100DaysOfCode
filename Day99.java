/*
Topic:- Viral Advertising

Link:- https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true

Problem:-

HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly 5 people on social media.

On the first day, half of those 5 people (i.e., floor(5/2) = 2 ) like the advertisement and each shares it with 3 of their friends. At the beginning of the second day, floor(5/2)*3 = 2*3 = 6 people receive the advertisement.

Each day, floor(recipients/2) of the recipients like the advertisement and will share it with 3 friends on the following day. Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, beginning with launch day as day 1.

Example
.n = 5

Day Shared Liked Cumulative
1      5     2       2
2      6     3       5
3      9     4       9
4     12     6      15
5     18     9      24
The progression is shown above. The cumulative number of likes on the 5th day is 24.


Function Description

Complete the viralAdvertising function in the editor below.
viralAdvertising has the following parameter(s):
int n: the day number to report

Returns

int: the cumulative likes at that day


Input Format

A single integer, n, the day number.


Constraints
1 <= n <= 50

Sample Input

3

Sample Output

9


Solution:-
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static final int INITIAL_AMOUNT_OF_PEOPLE = 5;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int currentAmount = INITIAL_AMOUNT_OF_PEOPLE;
            int totalNumber = 0;
            for (int i = 0; i < n; i++) {
                currentAmount = currentAmount/2;
                totalNumber += currentAmount;
                currentAmount *= 3;
            }
            System.out.println(totalNumber);
        }
    }
}
