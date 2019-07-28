/*Sock Merchant solution
Sock Merchant


John works at a clothing store. He has a large pile of socks that he must pair them by color for sale.

You will be given an array of integers representing the color of each sock. Determine how many pairs of socks with matching colors there are.

John works at a clothing store and he's going through a pile of n socks to find the number of matching pairs. More specifically, he has a pile of   loose socks where each sock   is labeled with an integer,  , denoting its color. He wants to sell as many socks as possible, but his customers will only buy them in matching

pairs. Two socks,   and  , are a single matching pair if they have the same color ( Ci = Cj ).

Given   and the color of each sock, how many pairs of socks can John sell?

Input Format

The first line contains an integer  , the number of socks.

The second line contains   space-separated integers describing the colors   of the socks in the pile.

Constraints




        where      


Output Format

Print the total number of matching pairs of socks that John can sell.

Sample Input
9

10 20 20 10 10 30 50 10 20

Sample Output
3
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    int pairs=0;
        Set<Integer> set= new HashSet();

        for(int i=0;i<ar.length;i++)
        {
            if(!set.contains(ar[i]))
            {
                set.add(ar[i]);
            }
            else
            {
                pairs++;
                set.remove(ar[i]);
            }
        }

        return pairs;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
