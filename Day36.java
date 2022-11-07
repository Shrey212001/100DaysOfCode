/*
Topic:- Java Big Decimal

Link:- https://github.com/yanzv/HackerRank/blob/master/Java/Big%20Number/JavaBigDecimal.java

Problem:-

Java BigDecimal class can handle arbitrary-precision signed decimal numbers. Lets test your knowledge on them!

You are given n real numbers, sort them in descending order! Read data from System.in.

Note: To make the problem easier, we provided you the input/output part in the editor. Print the numbers as 
they appeared in the input, don't change anything. If two numbers represent numerically equivalent values, 
the output must list them in original order of the input.

Input Format

The first line will consist an integer n, each of the next n lines will contain a real number. n will be at most 200. 
The numbers can have at most 300 digits!

Output Format

Print the numbers in descending orders, one number in each line.

Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100

Solution:-
*/


import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
          sc.close();

        //Write your code here

for(int i=0;i<n;i++)
{
    //inserting string values to bigdecimal
    BigDecimal First=new BigDecimal(s[i]);
    int index=i;
    for(int j=i+1;j<n;j++)
    {
        //second BigDecimal to compare the first Bigdecimal
        BigDecimal Second=new BigDecimal(s[j]);

        //comparing if First element is greater that second element
        //if the First element is greater than Second element than compareTo() returns 1

        if(Second.compareTo(First)==1){
            First=Second;
            index=j;
        }
    }

    //temporary variable to store s[i] value

        String temp=s[i];
        s[i]=s[index];
        s[index]=temp;
}
      
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}