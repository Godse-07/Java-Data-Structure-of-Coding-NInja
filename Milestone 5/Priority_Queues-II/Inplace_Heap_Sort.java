/* Given an integer array of size N. Sort this array (in decreasing order) using heap sort.
Note: Space complexity should be O(1).
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array or N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format :
The first and only line of output contains array elements after sorting. The elements of the array in the output are separated by single space.
Constraints :
1 <= n <= 10^6
Time Limit: 1 sec
Sample Input 1:
6 
2 6 8 5 4 3
Sample Output 1:
8 6 5 4 3 2 */


public class Solution {

    public static void inplaceHeapSort(int arr[]) {
        int size = arr.length;
        for (int i = (size - 2) / 2; i >= 0; i--) {
            maxHeapify(i, arr, size);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxHeapify(0, arr, i);
        }
    }

    public static int left(int i) {
        return (2 * i) + 1;
    }

    public static  int right(int i) {
        return (2 * i) + 2;
    }

    public static void maxHeapify(int i, int arr[], int size) {
        int leftIndex = left(i);
        int rightIndex = right(i);
        int smallest = i;

        if (leftIndex < size && arr[leftIndex] < arr[smallest]) {
            smallest = leftIndex;
        }
        if (rightIndex < size && arr[rightIndex] < arr[smallest]) {
            smallest = rightIndex;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            maxHeapify(smallest, arr, size);
        }
    }
}
