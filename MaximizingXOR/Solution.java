/*


Given two integers,  and , find the maximal value of  xor , written , where  and  satisfy the following condition:

For example, if  and , then 
 
 

Our maximum value is .
Function Description
Complete the maximizingXor function in the editor below. It must return an integer representing the maximum value calculated.
maximizingXor has the following parameter(s):
l: an integer, the lower bound, inclusive
r: an integer, the upper bound, inclusive

Input Format
The first line contains the integer l. 
The second line contains the integer r.

Constraints
1 <= l <= r <= 10 ^ 3

Output Format
Return the maximal value of the xor operations for all permutations of the integers from  to , inclusive.
Sample Input 0
10
15
Sample Output 0
7


*/



import java.io.*;
import java.util.*;

public class Solution {
    public static int maxXor(int l, int r) {
        int max = 0, x;
        for(int i = l; i < r; i++) {
            for(int k = i + 1; k <= r; k++ ) {
                x = i ^ k;
                if(x > max)
                    max = x;
            }
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(maxXor(l,r));
    }
}













