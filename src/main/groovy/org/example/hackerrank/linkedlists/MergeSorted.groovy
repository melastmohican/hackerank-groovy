package org.example.hackerrank.linkedlists

/**
 * You’re given the pointer to the head nodes of two sorted linked lists. The data in both lists will be sorted in ascending order. Change the next pointers to obtain a single, merged linked list which also has data in ascending order. Either head pointer given may be null meaning that the corresponding list is empty.

 Input Format You have to complete the Node* MergeLists(Node* headA, Node* headB) method which takes two arguments - the heads of the two sorted linked lists to merge. You should NOT read any input from stdin/console.

 Output Format Change the next pointer of individual nodes so that nodes from both lists are merged into a single list. Then return the head of this merged list. Do NOT print anything to stdout/console.

 Sample Input

 1 -> 3 -> 5 -> 6 -> NULL
 2 -> 4 -> 7 -> NULL

 15 -> NULL
 12 -> NULL

 NULL
 1 -> 2 -> NULL

 Sample Output

 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> NULL
 12 -> 15 -> NULL
 1 -> 2 -> NULL
 */
class MergeSorted {
    Node mergeLists(Node headA, Node headB) {
        if (!headA || !headB) {
            return headA ? headA : headB
        }

        Node head
        if (headA.data < headB.data) {
            head = headA
            headA = headA.next
        } else {
            head = headB
            headB = headB.next
        }

        Node node = head
        while (headA && headB) {
            if (headA.data < headB.data) {
                node.next = headA
                headA = headA.next
            } else {
                node.next = headB
                headB = headB.next
            }
            node = node.next
        }

        if (!headA) {
            node.next = headB
        } else {
            node.next = headA
        }

        head
    }
}
