/*
 There are ‘N’ houses. Two persons ‘P1’ and ‘P2’ distribute some candies to all these houses.
You are given an integer, ‘X’. If the total number of candies received by any house is more than ‘X’, it will pass the rest of the candies to the next house to the right. The rightmost house will just throw the extra candies.
You must return an array of ‘N’ integers denoting the final number of candies for all the houses.
For example:
Input :
‘N’ = 3, ‘P1’ = [2, 6, 1], ‘P2’ = [1, 2, 1], ‘X’ = 6

Output :
3 6 4

Explanation: Total candies at first house 2 + 1 = 3.
Total candies at the second house 6 + 2 = 8, extra = 8 - 6 = 2.
Total candies at the third house 1 + 1 + 2 ( extra from house 2) = 4.
Input Format:
First-line contains 'T', denoting the number of Test cases.
For each Test case:
The first line contains two integers, ‘N' and ‘X’.
The second line contains ‘N’ integers denoting the array ‘P1’.
The third line contains ‘N’ integers denoting the array ‘P2’.
Output Format:-
You must return the final number of candies for all the houses.
Note:-
You don’t need to print anything. Just implement the given function.
Constraints :
1<= T <=10
1<= N <=10^5
1<= P1[i], P2[i], X <=10^8
The Sum of 'N' over all test cases doesn't exceed 10 ^ 5.
Time Limit: 1 sec
Sample Input 1 :
2
4 7
2 3 4 7
6 2 6 1
2 4
1 1
1 1
Sample Output 1 :
7 6 7 7
2 2
Explanation Of Sample Input 1 :
For test case one:

Input :
‘N’ = 4, ‘P1’ = [2, 3, 4, 7], ‘P2’ = [6, 2, 6, 1], ‘X’ = 7

Output :
7 6 7 7

Explanation: Total candies at first house 2 + 6 = 8, extra = 8 - 7 =  1.
Total candies at the second house 3 + 2 + 1 ( from the first house ) = 6.
Total candies at the third house 4 + 6 = 10, extra = 10 - 7 = 3.
Total candies at the fourth house 7 + 1 + 3 ( from the second house ) = 11, Extra = 11 - 7= 4.

For test case two:

Input :
‘N’ = 2, ‘P1’ = [1, 1], ‘P2’ = [1, 1], ‘X’ = 4

Output :
2 2

Explanation: Total candies at first house 1+1 =  2.
Total candies at the second house 1+1 = 2.
Sample Input 2 :
2
6 17
22 8 4 7 5 10
9 3 1 6 0 9
1 1
1
1
Sample Output 2 :
17 17 13 13 5 17 
1 
 */

 import java.util.*;

public class Solution {
    public static int[] extraCandies(int n, int x, int []p1, int []p2) {
        int[] candies = new int[n];
        int extra = 0; // extra candies to be passed to the next house
        for (int i = 0; i < n; i++) {
            int totalCandies = p1[i] + p2[i] + extra;
            if (totalCandies > x) {
                extra = totalCandies - x;
                candies[i] = x;
            } else {
                extra = 0;
                candies[i] = totalCandies;
            }
        }
        return candies;
    }
}
