/*


/*

You will be given a list of 32 bit unsigned integers. Flip all the bits ( and ) and print the result as an unsigned integer.

Sample Input 0
3
2147483647
1
0
Sample Output 0
2147483648
4294967294
4294967295

*/


import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    public static long flipBits(long n) {
        long m = ((long)1 << 32) - 1;
        return m ^ n;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- != 0) {
        long n = sc.nextLong();
        System.out.println(flipBits(n));
        }
    }
}





