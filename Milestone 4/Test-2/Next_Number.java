/*
Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
Note: You don't need to print the elements, just update the elements and return the head of updated LL.
Input Constraints:
1 <= Length of Linked List <=10^6.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Output Format :
Line 1: Updated linked list elements 
Sample Input 1 :
3 9 2 5 -1
Sample Output 1 :
3 9 2 6
Sample Input 2 :
9 9 9 -1
Sample Output 1 :
1 0 0 0 
*/

/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/
/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/
import java.util.Collections;

class Solution {
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> n) {
        if (n == null)
            return n;

        LinkedListNode<Integer> head = reverseLinkedList(n);
        LinkedListNode<Integer> curr = head;
        boolean carry = true;

        while (curr != null && carry) {
            if (curr.data == 9) {
                curr.data = 0;
                if (curr.next == null) {
                    LinkedListNode<Integer> temp = new LinkedListNode<>(1);
                    curr.next = temp;
                    carry = false;
                }
                curr = curr.next;
            } else {
                curr.data++;
                carry = false;
            }
        }

        return reverseLinkedList(head);
    }

     private static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> p = null;
        LinkedListNode<Integer> c = head;
		LinkedListNode<Integer> n = head.next;
        while (c != null) {
            c.next=p;
			p=c;
			c=n;
			if(n!=null){
				n=n.next;
			}
        }

        return p;
    }
}

