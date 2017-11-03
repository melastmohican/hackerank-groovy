package org.example.hackerrank.linkedlists

/**
 * You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to check if they are equal. The lists are equal only if they have the same number of nodes and corresponding nodes contain the same data. Either head pointer given may be null meaning that the corresponding list is empty.

 Input Format You have to complete the int CompareLists(Node* headA, Node* headB) method which takes two arguments - the heads of the two linked lists to compare. You should NOT read any input from stdin/console.

 Output Format Compare the two linked lists and return 1 if the lists are equal. Otherwise, return 0. Do NOT print anything to stdout/console.

 Sample Input

 NULL, 1 --> NULL
 1 --> 2 --> NULL, 1 --> 2 --> NULL

 Sample Output

 0
 1
 */
class Compare {
    int compareLists(Node headA, Node headB) {
        if (!headA && !headB) {
            return 1
        }
        int result = 0
        while (headA && headB) {
            result = headA.data == headB.data ? 1 : 0
            if (result == 0) break
            headA = headA.next
            headB = headB.next
        }
        if (!(!headA && !headB)) {
            result = 0
        }
        result
    }
}
