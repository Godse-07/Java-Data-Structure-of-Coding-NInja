/* You are given an sorted integer array of size 'n'.


Your task is to find and return all the unique subsets of the input array.


Subsets are arrays of length varying from 0 to 'n', that contain elements of the array. But the order of elements should remain the same as in the input array.


Note:
The order of subsets is not important. You can return the subsets in any order. However, in the output, you will see the subsets in lexicographically sorted order.


Example:
Input: 'n' = 3, 'arr' = [12, 15, 20]

Output: [[], [12], [12, 15], [12, 15, 20], [12, 20], [15], [15, 20], [20]]

Sample Explanation: Since there are no repeated numbers, a total of 8 subsets are generated.
Input Format :
The first line will contain the value of ‘n’.

The second line will contain n integers, denoting the array 'arr' elements.
Output format :
Return all unique subsets in any order.
Note :
You don't need to print anything. It has already been taken care of. Just implement the given function.
Sample Input 1 :
3
12 15 20
Sample Output 1 :
[] (this represents an empty array)
12 
12 15 
12 15 20 
12 20 
15 
15 20 
20 
Explanation Of Sample Input 1 :
Since there are no repeated numbers, 8 subsets are generated.
Sample Input 2 :
3
1 1 2
Sample Output 2 :
[]    
1 
1 1 
1 1 2 
1 2 
2 
Explanation Of Sample Input 2 :
Since there are repeated numbers, the total number of unique subsets is 6.
Expected Time Complexity :
The expected time complexity is O(k * 2^n), where n is the size of the array and 'k' is the average size of a subset.
Expected Space Complexity :
The expected time complexity is O(k * 2^n), where n is the size of the array and 'k' is the average size of a subset.
Constraints :
1 <= n <= 15
1 <= arr[i] <= 100

Time Limit: 1 sec */




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void printSubsets(int input[]) {
        Arrays.sort(input);
        generateSubsets(input, 0, new ArrayList<>());
    }

    public static void generateSubsets(int[] arr, int startIndex, List<Integer> current) {
        if (startIndex == arr.length) {
            for (int num : current) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        // Include the current element in the subset
        current.add(arr[startIndex]);
        generateSubsets(arr, startIndex + 1, current);
        current.remove(current.size() - 1);

        // Skip duplicates
        int nextIndex = startIndex + 1;
        while (nextIndex < arr.length && arr[nextIndex] == arr[startIndex]) {
            nextIndex++;
        }

        // Exclude the current element in the subset
        generateSubsets(arr, nextIndex, current);
    }
}
