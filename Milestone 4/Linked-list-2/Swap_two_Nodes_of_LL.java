/*
You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions.
Note :
Remember, the nodes themselves must be swapped and not the datas.

No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains two integer values 'i,' and 'j,' respectively. A single space will separate them.
 Remember/consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= i < M
0 <= j < M

Time Limit: 1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3 4
Sample Output 1 :
3 4 5 6 2 1 9 
 Sample Input 2 :
2
10 20 30 40 -1
1 2
70 80 90 25 65 85 90 -1
0 6
 Sample Output 2 :
10 30 20 40 
90 80 90 25 65 85 70 
*/

/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		// Check if the indices are valid.
        int k1=size(head);
		if (i < 0 || j < 0 || i >= k1 || j >=k1 ) {
			return head;
		}

		// Find the nodes at positions i and j.
		LinkedListNode<Integer> node1 = head;
		for (int k = 0; k < i; k++) {
			node1 = node1.next;
		}

		LinkedListNode<Integer> node2 = head;
		for (int k = 0; k < j; k++) {
			node2 = node2.next;
		}

		// Swap the next pointers of the nodes.
		LinkedListNode<Integer> temp = node1.next;
		node1.next = node2.next;
		node2.next = temp;

		// Return the new head of the list.
		return head;
	}

	public static int size(LinkedListNode<Integer> head) {
		int size = 0;
		LinkedListNode<Integer> currentNode = head;
		while (currentNode != null) {
			size++;
			currentNode = currentNode.next;
		}
		return size;
	}

}
