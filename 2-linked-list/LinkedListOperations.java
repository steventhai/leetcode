import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class LinkedListOperations {
    /**
     * 237. Delete Node in a Linked List
     * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
     * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, 
     * the linked list should become 1 -> 2 -> 4 after calling your function.
     */
    public void deleteNode(ListNode node) {
        if (node.next == null) return;

        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * 206. Reverse Linked List Iteratively
     * Reverse a singly linked list
     * Hint:
     * A linked list can be reversed either iteratively or recursively. Could you implement both?
     */
    public ListNode reverseListItr(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    /**
     * 206. Reverse Linked List Recursively
     * Reverse a singly linked list
     * Hint:
     * A linked list can be reversed either iteratively or recursively. Could you implement both?
     */
    public ListNode reverseListRec(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode result = reverseListRec(head.next);
        head.next.next = head;
        head.next = null;

        return result;
    }

    /**
     * 141. Linked List Cycle using HashSet.
     * Given a linked list, determine if it has a cycle in it.
     * Follow up:
     * Can you solve it without using extra space?
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        while (head != null) {
            if (seen.contains(head)) {
                return true;
            } else {
                seen.add(head);
            }
            
            head = head.next;
        }

        return false;
    }

    /**
     * 141. Linked List Cycle using two-pointer technique.
     * Given a linked list, determine if it has a cycle in it.
     * Follow up:
     * Can you solve it without using extra space?
     */
    public boolean hasCycleTwoPointer(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {

            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    /**
     * 21. Merge Two Sorted Lists Iteratively
     * Merge two sorted linked lists and return it as a new list. 
     * The new list should be made by splicing together the nodes of the first two lists.
     */
    public ListNode mergeTwoListsIter(ListNode l1, ListNode l2) {
        
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode result = new ListNode(0);
        ListNode temp = result;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) {
            temp.next = l1;
        }
        if (l2 != null) {
            temp.next = l2;
        }

        return result.next;
    }

    /**
     * 21. Merge Two Sorted Lists Recursively
     * Merge two sorted linked lists and return it as a new list. 
     * The new list should be made by splicing together the nodes of the first two lists.
     */
    public ListNode mergeTwoListsRec(ListNode l1, ListNode l2) {
        
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoListsRec(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListsRec(l1, l2.next);
            return l2;
        }
    }

    /**
     * 24. Swap Nodes in Pairs
     * Given a linked list, swap every two adjacent nodes and return its head.
     * For example,
     * Given 1->2->3->4, you should return the list as 2->1->4->3.
     * Your algorithm should use only constant space. 
     * You may not modify the values in the list, only nodes itself can be changed.
     */
    public ListNode swapPairs(ListNode head) {
                
    }
}