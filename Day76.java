/*
Topic:- Grading Students

Link:- https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true

Problem:-
HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student’s grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
Examples

 grade = 84 round to 85 (85 – 84 is less than 3)
 grade = 29 do not round (result is less than 40)
 grade do not round (60 – 57 is 3 or higher)
Given the initial value of  for each of Sam’s  students, write code to automate the rounding process.

Function Description

Complete the function gradingStudents in the editor below.

gradingStudents has the following parameter(s):

int grades[n]: the grades before rounding
Returns

int[n]: the grades after rounding as appropriate
Input Format

The first line contains a single integer,n, the number of students.

Each line i of the n subsequent lines contains a single integer, grade[i].

Constraints

1<=n<=60
0<=grades[i]<=100

Sample Input 0

4

73

67

38

33
 

Sample Output 0

75

67

40

33

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

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
int n = in.nextInt();
for(int a0 = 0; a0 < n; a0++){
int grade = in.nextInt();
if(grade < 38){
System.out.println(grade);
}
else{
int q = grade/5;
int rem = grade%5;
if(rem >= 3){
System.out.println((q+1)*5);
}
else{
System.out.println(grade);
}
}
}
       
    }
}
