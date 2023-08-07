/*
 Given a matrix, ‘A’ of size ‘N’ * ‘M’, you must traverse the matrix column-wise.
You must return an integer array of size ‘N’ * ‘M’ denoting the column-wise traversal of the matrix.
For example:
Input :
A = [ [1, 2, 3], [4, 5, 6] ]

Output :
1 4 2 5 3 6

Explanation: 
For the given matrix, the first column is [1, 4], the second is [2, 5] and the third is [3, 6].
For column-wise traversal, you must traverse the first column, the second column, and then the third.
Input Format:
First-line contains 'T,' denoting the number of Test cases.
For each Test case:
The first line contains two integers, ‘N' and ‘M’.
The following ‘N’ lines have ‘M’ integers each, denoting the matrix ‘A’.
Output Format:-
You must return the array with elements in order of column-wise traversal.
Note:-
You don’t need to print anything. Just implement the given function.
Constraints :
1 <= T <= 10
1 <= N * M <= 10^5
1 <= A[ i ][ j ] <= 10^9
Time Limit: 1 sec
Sample Input 1 :
2
2 2 
4 3
2 1
5 1
1 
2 
3 
4 
5
Sample Output 1 :
4 2 3 1
1 2 3 4 5 
Explanation Of Sample Input 1 :
For test case one:
Input :
A = [ [4, 3], [2, 1] ]
Output :
4 2 3 1
Explanation: For the given matrix, the first column is [4, 2], and the second is [3, 1].
For column-wise traversal, you need to traverse the first column and then the second column.

For test case two:
Input :
A = [ [ 1 ], [ 2 ], [ 3 ], [ 4 ], [ 5 ] ]
Output :
1 2 3 4 5
Explanation: For the given matrix, the first column is [1, 2, 3, 4, 5].
For column-wise traversal, you need to traverse the first column.
Sample Input 2 :
2
1 1 
4
1 5
1 2 3 4 5
Sample Output 2 :
4
1 2 3 4 5 
 */

 import java.util.Scanner;

public class Solution {
    public static int[] printColWise(int [][]a) {
        // Write your code here.
        int N = a.length;
        int M = a[0].length;
        int[] result = new int[N * M];
        int k = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                result[k++] = a[j][i];
            }
        }
        return result;
    }
}