package org.example.hackerrank.linkedlists

/**
 * You're given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending order. Delete as few nodes as possible so that the list does not contain any value more than once. The given head pointer may be null indicating that the list is empty.

 Input Format You have to complete the Node* RemoveDuplicates(Node* head) method which takes one argument - the head of the sorted linked list. You should NOT read any input from stdin/console.

 Output Format Delete as few nodes as possible to ensure that no two nodes have the same data. Adjust the next pointers to ensure that the remaining nodes form a single sorted linked list. Then return the head of the sorted updated linked list. Do NOT print anything to stdout/console.

 Sample Input

 1 -> 1 -> 3 -> 3 -> 5 -> 6 -> NULL
 NULL

 Sample Output

 1 -> 3 -> 5 -> 6 -> NULL
 NULL
 */
class RemoveDuplicates {
    Node removeDuplicates(Node head) {
        if (!head) return head

        Node node = head
        while (node.next) {
            if (node.data == node.next.data) {
                node.next = node.next.next
            } else {
                node = node.next
            }
        }
        head
    }
}
