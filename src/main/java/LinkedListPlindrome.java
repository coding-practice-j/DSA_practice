
class Node {
	int data;
	Node next;
}

public class LinkedListPlindrome {

	public static void main(String[] args) {

		Node head = new Node();
		head = null;

		/*
		 * head = insert(head, 1); head = insert(head, 2); head = insert(head, 2); head
		 * = insert(head, 1);
		 */

		//System.out.println(checkPalindrome(head));

		head = insert(head, 5);
		head = insert(head, 6);
		head = insert(head, 7);
		head = insert(head, 6);
		head = insert(head, 8);
		System.out.println(checkPalindrome(head));

	}

	private static Node insert(Node head, int i) {
		Node temp = new Node();

		if (head == null) {
			temp.data = i;
			temp.next = null;
			head = temp;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			Node newNode = new Node();
			newNode.data = i;
			newNode.next = null;
			temp.next = newNode;
		}
		return head;
	}

	private static void display(Node head) {
		Node temp = new Node();
		temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	// 1 2 2 1
	// 1 -> 2 -> 2 -> 1 -> null
	
	// 1 - 2 - 2 -1

	private static int checkPalindrome(Node head) {
		Node newList = new Node();
		Node newHead = new Node();
		newHead = head;
		// newList = null;
		while (newHead != null) {

			if (newList == null) {
				newList.data = newHead.data;
				newList.next = null;
			} else {
				Node temp = new Node();
				temp.data = newHead.data;
				temp.next = newList;
				newList = temp;
			}
			newHead = newHead.next;
		}

		/*
		 * System.out.println("head: "); display(head); System.out.println("newList: ");
		 * display(newList); System.out.println();
		 */

		while (newList != null && head != null) {
			if (newList.data == head.data) {
				newList = newList.next;
				head = head.next;
				continue;
			} else {
				return 0;
			}
		}
		return 1;
	}

}
