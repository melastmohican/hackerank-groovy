package org.example.hackerrank.linkedlists

/**
 * You’re given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer, insert this node at the head of the linked list and return the new head node. The head pointer given may be null meaning that the initial list is empty.

 Input Format You have to complete the Node* Insert(Node* head, int data) method which takes two arguments - the head of the linked list and the integer to insert. You should NOT read any input from stdin/console.

 Output Format Insert the new node at the head and return the head of the updated linked list. Do NOT print anything to stdout/console.

 Sample Input

 NULL , data = 1
 1 --> NULL , data = 2

 Sample Output

 1 --> NULL
 2 --> 1 --> NULL
 */
class InsertHeadNode {
    def insert(Node head, int data) {
        Node node = new Node()
        node.data = data
        node.next = head
        node
    }
}
