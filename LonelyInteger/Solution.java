/*



You will be given an array of integers. All of the integers except one occur twice. That one is unique in the array.
Given an array of integers, find and print the unique element.
For example, , the unique element is .
Function Description
Complete the lonelyinteger function in the editor below. It should return the integer which occurs only once in the input array.
lonelyinteger has the following parameter(s):
a: an array of integers
Input Format
The first line contains a single integer, , denoting the number of integers in the array. 
The second line contains  space-separated integers describing the values in .
Constraints

It is guaranteed that  is an odd number and that there is one unique element.
, where .
Output Format
Print the unique integer in the array.
Sample Input 0
1
1
Sample Output 0
1
Explanation 0
There is only one element in the array, thus it is unique.
Sample Input 1
3
1 1 2
Sample Output 1
2
Explanation 1
We have two 's, and  is unique.
Sample Input 2
5
0 0 1 2 1
Sample Output 2
2
Explanation 2
We have two 's, two 's, and one .   is unique.



*/


import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    
    public static int lonelyInteger(int a[], int n) {
        int x = a[0];
        for(int i = 1; i < n; i++) 
            x = x ^ a[i];
        return x;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println(lonelyInteger(a, n));
    }
}


















