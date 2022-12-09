/*
Topic:- Java MD5

Link:- https://www.hackerrank.com/challenges/java-md5/problem?isFullScreen=true

Problem:-
MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a -bit hash value. Here are some common uses for MD5:

1. To store a one-way hash of a password.
2.To provide some assurance that a transferred file has arrived intact.

MD5 is one in a series of message digest algorithms designed by Professor Ronald Rivest of MIT (Rivest, ); 
however, the security of MD5 has been severely compromised, most infamously by the Flame malware in . 
The CMU Software Engineering Institute essentially considers MD5 to be "cryptographically broken and unsuitable for further use".

Given an alphanumeric string, , denoting a password, compute and print its MD5 encryption value.


Input Format

A single alphanumeric string denoting .


Constraints

String  consists of English alphabetic letters (i.e.,  and/or decimal digits (i.e.,  through ) only.


Output Format

Print the MD5 encryption value of  on a new line.


Sample Input 0

HelloWorld


Sample Output 0

68e109f0f40ca72a15e05cc22786f8e6

Sample Input 1

Javarmi123

Sample Output 1

2da2d1e0ce7b4951a858ed2d547ef485

Solution:-
*/

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(in.nextLine().getBytes());
            in.close();
            System.out.printf("%32x\n", new BigInteger(1, bytes));
                    
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
