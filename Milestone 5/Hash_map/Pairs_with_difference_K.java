/* You are given with an array of integers and an integer K. You have to find and print the count of all such pairs which have difference K.
Note: Take absolute difference between the elements of the array.
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol n.
The following line contains n space separated integers, that denote the value of the elements of the array.
The following line contains an integer, that denotes the value of K.
Output format :
The first and only line of output contains count of all such pairs which have an absolute difference of K. 
Constraints :
0 <= n <= 10^4
Time Limit: 1 sec
Sample Input 1 :
4 
5 1 2 4
3
Sample Output 1 :
2
Explanation
(5,2) and (1,4) are the possible combinations as their absolute difference is 3.
Sample Input 2 :
4
4 4 4 4 
0
Sample Output 2 :
6 */

import java.util.HashMap;

public class Solution {

    public static int getPairsWithDifferenceK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element in the array
        for (int key : arr) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int countPairs = 0;
        if (k == 0) {
            // If k is 0, count the pairs where both elements are the same
            for (Integer i : map.keySet()) {
                int val = map.get(i);
                countPairs += (val * (val - 1)) / 2;
            }
            return countPairs;
        }

        // Iterate through the map and find pairs with the specified difference, k
        for (Integer i : map.keySet()) {
            if (map.containsKey(k + i)) {
                countPairs += map.get(i) * map.get(k + i);
            }
            if (map.containsKey(i - k)) {
                countPairs += map.get(i) * map.get(i - k);
            }
        }

        // Divide the count by 2 since each pair is counted twice
        countPairs = countPairs / 2;
        return countPairs;
    }
}
