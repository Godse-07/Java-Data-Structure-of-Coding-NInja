/*
 For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output Format :
For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
OR
If column sum is maximum, then print: "column" <col_index> <col_sum>
It will be printed in a single line separated by a single space between each piece of information.

Output for every test case will be printed in a seperate line.
 Consider :
If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.
Constraints :
1 <= t <= 10^2
1 <= N <= 10^3
1 <= M <= 10^3
Time Limit: 1sec
 */

 public class Solution {

    public static void findLargest(int input[][]){
        //Your code goes here
        int rows = input.length;
        int columns = rows > 0 ? input[0].length : 0;
        int largest = Integer.MIN_VALUE;
        int x = 0;
        int sum1 = 0;
        int sum2 = 0;
        String s = "";
        if(rows == 0 && columns == 0) {
            System.out.println("row 0 " + largest);
            return;
        }
        for(int i=0;i<rows;i++) {
            sum1 = 0;
            int j = 0;
            for(;j<columns;j++) {
                sum1 += input[i][j];
            }
            if(sum1>largest) {
                largest = sum1;
                x = i;
                s = "row";
            }
        }
        for(int i=0;i<columns;i++) {
            sum2 = 0;
            int j = 0;
            for(;j<rows;j++) {
                sum2 += input[j][i];
            }
            if(sum2>largest) {
                largest = sum2;
                x = i;
                s = "column";
            }
        }
        System.out.println(s + " " + x + " " + largest);
    }
}
