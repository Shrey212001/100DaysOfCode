/* 
Topic:- Java Inheritance II

Link:- https://www.hackerrank.com/challenges/java-inheritance-2/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

Problem:

Write the following code in your editor below:
A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
A class named Adder inherits from a superclass named Arithmetic.
Your classes should not be public.

Input Format

You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it 2 integer parameters.

Output Format

You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

Sample Output

The main method in the Solution class above should print the following:

My superclass is: Arithmetic
42 13 20

Solution:-
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic{
    public int add(int a, int b){
        int sum = a + b; 
        return sum;
    }
}

class Adder extends Arithmetic{  
    public int callAdd(int a, int b){
        return add(a, b);
    }
}

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
