/*
Topic:- Designer PDF Viewer

Link:- https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?isFullScreen=true

Problem:-
When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently. 

There is a list of 26 character heights aligned by index to their letters. For example, ‘a’ is at index 0 and ‘z’ is at index 25. There will also be a string. Using the letter heights given, determine the area of the rectangle highlight in (mm)^2 assuming all letters are  wide.

Function Description

Complete the designerPdfViewer function in the editor below.

designerPdfViewer has the following parameter(s):
int h[26]: the heights of each letter
string word: a string

Returns

int: the size of the highlighted area

Input Format

The first line contains 26 space-separated integers describing the respective heights of each consecutive lowercase English letter, ascii[a-z].

The second line contains a single word consisting of lowercase English alphabetic letters.

Constraints

1<=h[?]<=7, where  is an English lowercase letter.

word contains no more than  letters.

Sample Input 0

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5

abc

Sample Output 0
9


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
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int mx = 0;
        for (int i = 0; i < word.length(); i++) {
            int f = h[(int) (word.charAt(i) - 'a')];
            if (f > mx) {
                mx = f;
            }
        }
        System.out.println((word.length() * mx));
    }
}
