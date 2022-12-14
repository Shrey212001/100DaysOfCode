/*
Topic:- Java Big Integer

Link:- https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true

Problem:-

In this problem you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like long integer.
Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers, a and b. The numbers are non-negative and can have maximum 200 digits.

Constraints

a and b are non-negative integers and can have maximum 200 digits.

Output Format

Output two lines. The first line should contain a+b, and the second line should contain a×b. Don't print any leading zeros.

Sample Input

1234
20

Sample Output

1254
24680

Explanation

1234+20=1254
1234X20=24680

Solution:-
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numOne = sc.nextLine();
        String numTwo = sc.nextLine();
        BigInteger bigNumOne = new BigInteger(numOne);
        BigInteger bigNumTwo = new BigInteger(numTwo);
        System.out.println(bigNumOne.add(bigNumTwo));
        System.out.println(bigNumOne.multiply(bigNumTwo));
    }
}