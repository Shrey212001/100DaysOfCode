
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaPrimalityTest
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int bitSetSize = sc.nextInt();
        int numOperations = sc.nextInt();
        BitSet[] bitSetArray = new BitSet[2];
        bitSetArray[0] = new BitSet(bitSetSize);
        bitSetArray[1] = new BitSet(bitSetSize);
        sc.nextLine();
        for(int i = 0;i < numOperations; i++)
        {
            String[] opArray = sc.nextLine().split(" ");
            switch(opArray[0]){
                case "AND": bitSetArray[Integer.parseInt(opArray[1])-1].and(bitSetArray[Integer.parseInt(opArray[2])-1]);
                break;
                case "OR": bitSetArray[Integer.parseInt(opArray[1])-1].or(bitSetArray[Integer.parseInt(opArray[2])-1]);
                break;
                case "XOR": bitSetArray[Integer.parseInt(opArray[1])-1].xor(bitSetArray[Integer.parseInt(opArray[2])-1]);
                break;
                case "FLIP": bitSetArray[Integer.parseInt(opArray[1])-1].flip(Integer.parseInt(opArray[2]));
                            break;
                case "SET": bitSetArray[Integer.parseInt(opArray[1])-1].set(Integer.parseInt(opArray[2]));
                            break;
            }
            System.out.println(bitSetArray[0].cardinality() + " " + bitSetArray[1].cardinality());
            
        }
    }
}