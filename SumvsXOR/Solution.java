/*



Given an integer n , find each x such that:
0 <= x <= n
n + x = n (XOR) x;


where  denotes the bitwise XOR operator. Print the number of 's satisfying the criteria.
For example, if , there are four values:



.
Function Description
Complete the sumXor function in the editor below. It should return the number of values determined, as an integer.
sumXor has the following parameter(s): 
- n: an integer
Input Format
A single integer,n .

Constraints
0 <= n <= 10 ^ 5

Subtasks
 for  of the maximum score.
Output Format
Print the total number of integers  satisfying the criteria.
Sample Input 0
5
Sample Output 0
2


*/



import java.io.*;
import java.util.*;

public class Solution {
    public static int numberOfZeros(long n) {
        int c = 0;
        while(n != 0) {
            if((n & 1) == 0)
                c++;
            n = n >> 1;
        }
        return c;
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = numberOfZeros(n);
        System.out.println((long)1 << count);
    }
}







