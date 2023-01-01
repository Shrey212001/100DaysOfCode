/*
Topic:- Forming a Magic Square

Link:- https://www.hackerrank.com/challenges/magic-square-forming/problem?isFullScreen=true

Problem:-
We define a magic square to be an n * n matrix of distinct positive integers from 1 to n^2 where the sum of any row, column, or diagonal of length n is always equal to the same number: the magic constant.

You will be given a 3 * 3 matrix s of integers in the inclusive range [1, 9]. We can convert any digit a to any other digit b in the range [1, 9] at cost of | a - b |. Given s, convert it into a magic square at minimal cost. Print this cost on a new line.

Note: The resulting magic square must contain distinct integers in the inclusive range [1, 9].


Example

$s = [[5, 3, 4], [1, 5, 8], [6, 4, 2]]

The matrix looks like this:

5 3 4
1 5 8
6 4 2
We can convert it to the following magic square:

8 3 4
1 5 9
6 7 2
This took three replacements at a cost of |5 - 8| + |8 - 9| + |4 - 7| = 7.


Function Description

Complete the formingMagicSquare function in the editor below.

formingMagicSquare has the following parameter(s):

int s[3][3]: a 3 * 3 array of integers
Returns

int: the minimal total cost of converting the input square to a magic square


Input Format

Each of the 3 lines contains three space-separated integers of row s[i].


Constraints
s[i][j] belongs to [1, 9]




Solution:-
*/
import java.io.*;
import java.util.*;
public class crap {
    public static int diff(int[][] s1,int[][] s2){
        int d=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                d+=Math.abs(s1[i][j]-s2[i][j]);
        return d;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s[][]=new int[3][3];
        for(int i=0;i<3;i++)
           for(int j=0;j<3;j++)
           {s[i][j]=sc.nextInt();}
        int a[][]={{2,7,6},{9,5,1},{4,3,8}};
        int b[][]={{2,9,4},{7,5,3},{6,1,8}};
        int c[][]={{4,3,8},{9,5,1},{2,7,6}};
        int d[][]={{4,9,2},{3,5,7},{8,1,6}};
        int e[][]={{6,1,8},{7,5,3},{2,9,4}};
        int f[][]={{6,7,2},{1,5,9},{8,3,4}};
        int g[][]={{8,1,6},{3,5,7},{4,9,2}};
        int h[][]={{8,3,4},{1,5,9},{6,7,2}};
        ArrayList<int[][]> val=new ArrayList<>();
        int res=Integer.MAX_VALUE;
        val.add(a);val.add(b);val.add(c);val.add(d);val.add(e);val.add(f);val.add(g);val.add(h);
        for(int[][] x:val){
            res=Math.min(res, diff(x, s));
        }
        System.out.println(res);
    }
}