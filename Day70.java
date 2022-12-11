/*
Topic:- Diagonal Difference

Link:- https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true

Problem Description :

Given a square matrix, calculate the absolute difference between the sums of its diagonals. 

For example, the square matrix arr is shown below: 

1 2 3
4 5 6
9 8 9

The left to right diagonal = 1 + 5 + 9 = 15 The right to left diagonal = 3 + 5 + 9 = 17 Their absolute difference is | 15 - 17 | = 2.

Function description

Complete the diagonalDifference function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers

Return

int: the absolute diagonal difference

Input Format

The first line contains a single integer, n , the number of rows and columns in the square matrix arr.
Each of the next n lines describes a row, arr[i] , and consists of n space-separated integers arr[i][j].

Constraints

-100<=arr[i][j]<=100

Output Format

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input :

Row and Column Size : 3

2 4 6
1 3 5
7 8 -9
Sample Output : 2

Explanation : left to right diagonal = 2 + 3 - 9 = -4. The right to left diagonal = 6 + 3 + 7 = 16. So the absolute difference is | -4 - 16 = 20 |

Code explanation :

We already have Integer of 2D List. We just have to add logic in given method.
In this problem, we just need to return absolute (Positive value) Sum of left to right diagonal - Sum of right to left diagonal.
Define two integer value leftDiagonal, rightDiagonal and initialize with 0 value. 
Traverse through given 2D list from 0 to list size and store sum of left to right diagonal value to leftDiagonal variable and right to left diagonal value to rightDiagonal variable. 
In loop using 3 * 3 matrix, we are getting value of leftDiagonal through following index : 0 + 4 + 8, and right Diagonal through following index : 2 + 4 + 6.
list.get(0).get(0) means 0th row and 0th column.
Last return absolute value of leftDiagonal - rightDiagonal value.

Output explanation :

List = 1st row [1, 2, 3],
           2nd row [4, 5, 6],
           3rd row [9, 8, 9]

i = 0, leftDiagonal = 0, rightDiagonal = 0, list size = 3
leftDiagonal = 0 + arr.get(0).get(0) = [0, 0]
leftDiagonal  =  0 + 1 = 1
rightDiagonal = 0 + arr.get(0).get((arr.get(0).size() - 1) - 0) = [0, 2]
rightDiagonal = 0 + 3 = 3

i = 1, leftDiagonal = 1, rightDiagonal = 3
leftDiagonal = 1 + arr.get(1).get(1) = [1, 1]
leftDiagonal  =  1 + 5 = 6
rightDiagonal = 3 + arr.get(1).get((arr.get(1).size() - 1) - 1) = [1, 1]
rightDiagonal = 3 + 5 = 8

i = 2, leftDiagonal = 6, rightDiagonal = 8
leftDiagonal = 6 + arr.get(2).get(2) = [2, 2]
leftDiagonal  =  6 + 9 = 15
rightDiagonal = 8 + arr.get(2).get((arr.get(2).size() - 1) - 2) = [2, 0]
rightDiagonal = 8 + 9 = 17

leftDiagonal = 15, rightDiagonal = 17
Math.abs(15 - 17) = 2



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

    public static int diagonalDifference(List<List<Integer>> arr) {
   
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        
        for (int i = 0; i < arr.size(); i++) {
        leftDiagonal += arr.get(i).get(i);
        rightDiagonal += arr.get(i).get((arr.get(i).size() - 1) - i);
    }
        
        return Math.abs(leftDiagonal - rightDiagonal);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
            new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
