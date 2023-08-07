/*
Given a singly linked list of integers, sort it using 'Bubble Sort.'
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the sorted singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
0 <= M <= 10^3
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
 3 4 5 6 7 8 9 10 
 Sample Input 2 :
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90 
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


	public static int length(LinkedListNode<Integer> head){
		int count=0;
		while(head!=null){
			count++;
			head=head.next;
		}
		return count;
	}


	public static void swap(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2){
		int temp=head1.data;
		head1.data=head2.data;
		head2.data=temp;
	}


	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		//Your code goes here
		if(head==null || head.next==null){
			return head;
		}

		int len=length(head);
		for(int i=0;i<len-1;i++){
			LinkedListNode<Integer> current=head;
			LinkedListNode<Integer> next=head.next;
			//boolean swapped=false;
			for(int j=0;j<len-i-1;j++){
				if(current.data > next.data){
					swap(current,next);
				}
				current=current.next;
				next=next.next;
			}
		}
		return head;
	}
}