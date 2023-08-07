/*
You are given two arrays of integers. Let's call the first array A and the second array B. A finds the number of elements in array B that are smaller than or equal to that element for every array element.
Example:
Input:
A = [2, 3, 0]
B = [5, 1]


Output: 
[1, 1, 0]

Explanation:

For the first index, A[0] = 2
In array B only 1 is less than 2. Therefore the answer for the first index is 1.

For the second index, A[1] = 3
In array B only 1 is less than 3. Therefore the answer for the second index is also 1.

For the third index, A[2] = 0
Both the elements of array B are greater than 0. 
Therefore the answer for the third index is 0.

Hence, the final answer is [1,1,0] in this case.
Input Format:
The first line of input contains an integer ‘T’ denoting the number of test cases.
Then the test case follows.

The first line of each test case contains an integer ‘N’ denoting the number of elements in the array A. 

The second line of each test case contains ‘N’ space-separated integers denoting the elements of array A.

The third line of each test case contains an integer ‘M’ denoting the number of elements in array B. 

The second line of each test case contains ‘M' space-separated integers denoting the elements of array B.
Output format:
For each test case, print N space-separated integers represent the number of elements in array B that are smaller than the corresponding element in array A.
Constraints :
1  <= T <= 10
1  <= N,M <= 10000
-1e9 <= A[i], B[i] <= 1e9
Time Limit: 1 sec
Sample Input 1:
2
3
2 3 0
2
5 1
2
2 4
3 
1 3 5
Sample Output 1:
1 1 0
1 2
Explanation Of Sample Input 1 :
Test 1:
For the first index, A[0] = 2
In array B only 1 is less than 2. Therefore the answer for the first index is 1.

For the second index, A[1] = 3
In array B only 1 is less than 3. Therefore the answer for the second index is also 1.

For the third index, A[2] = 0
Both the elements of array B are greater than 0. 
Therefore the answer for the third index is 0.

Hence, the final answer is [1,1,0] in this case.

Test 2:
For the first index, A[0] = 2
In array B only 1 is less than 2. Therefore the answer for the first index is 1.

For the second index, A[1] = 4
In array B only 1 and 3 are less than 4. Therefore the answer for the second index is 2.

Hence, the final answer is [1,2] in this case.
Sample Input 2 :
2
2 
1 2
2 
3 3
4
4 5 6 7
2
6 7
Sample Output 2 :
0 0
0 0 1 2 

 */

 import java.util.*;
 public class Solution {
     public static int check(int[] arr, int value,int size)
    {
        
        int start =0,end = size - 1;
        int count = 0;
        while(start <= end)
        {
            int mid = start + (end - start)/ 2;
            if(arr[mid] <= value)
            {
                count = mid + 1;
            }
            if(arr[mid] > value)
            {
              end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }  
        }
        return count;
        
        
    }
     public static int[] countS(int n, int m, int []a, int []b) {
         // Write your code here.
         
           int[] res = new int[n];
     for (int i = 0; i < n; i++) {
         int value = a[i];
         int count = check(b, value, m);
         res[i] = count;
     }
     return res;
     }
 }
 