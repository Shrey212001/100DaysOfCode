/*

Topic:- Birthday Cake Candles

Link:- https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true

Problem:-

You are in charge of the cake for a child’s birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Example

Candles = [4,4,1,3]

The maximum height candles are 4 units high. There are 2 of them, so return 2.

Function Description

Complete the function birthdayCakeCandles in the editor below. It must return an integer representing the number of candles she can blow out.

birthdayCakeCandles has the following parameter(s):

int candles[n]: the candle heights
Returns

int: the number of candles that are tallest
Input Format

The first line contains a single integer, n , the size of candles[].
The second line contains n space-separated integers, where each integer i describes the height of candles[i] .

Output Format

Return the number of candles that can be blown out on a new line.

Sample Input 0

4
3 2 1 3
Sample Output 0

2
Explanation 0

Candle heights are[3,2,1,3] . The tallest candles are 3 units, and there are of 2 of them.


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
  public static int birthdayCakeCandles(List<Integer> candles) {
     int count = 0;
   int max = 0;
   for(int i = 0; i < candles.size() ; i++)
   {
      int num = candles.get(i);
      if(num > max)
      {
         max = num;
         count = 1;
      }else if(max == num)
      {
      count++;
      }
    }   
    return count;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
