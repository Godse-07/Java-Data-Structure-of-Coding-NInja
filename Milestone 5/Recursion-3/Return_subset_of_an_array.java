/* Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.


Note :
The order of subsets are not important.


Input format :

Line 1 : Size of array

Line 2 : Array elements (separated by space)

Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12  */



public class solution {
    public static int[][] subsets(int input[]) {
        int totalSubsets = (int) Math.pow(2, input.length);
        int[][] subsets = new int[totalSubsets][];
        
        for (int i = 0; i < totalSubsets; i++) {
            subsets[i] = getSubset(input, i);
        }
        
        return subsets;
    }
    
    public static int[] getSubset(int input[], int n) {
        int subsetSize = 0;
        int temp = n;
        
        while (temp > 0) {
            if ((temp & 1) == 1) {
                subsetSize++;
            }
            temp >>= 1;
        }
        
        int[] subset = new int[subsetSize];
        int index = 0;
        
        for (int i = 0; i < input.length; i++) {
            if ((n & (1 << i)) != 0) {
                subset[index++] = input[i];
            }
        }
        
        return subset;
    }
}