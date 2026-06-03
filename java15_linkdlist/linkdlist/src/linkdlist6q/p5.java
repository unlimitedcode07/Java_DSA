package linkdlist6q;
import linkdlist1.ListNode;

import static linkdlist1.ListNode.display;
// solve this by recursive
public class p5 {
    static class Solution {
        ListNode sol(ListNode temp1,ListNode temp2,ListNode tail,ListNode head){
            if(temp2.next == null){
                temp2.next = temp1;
                tail = temp2;
                if(temp1 == head){
                    temp1.next = null;
                }
                return tail;
            }
            tail = sol(temp1.next,temp2.next,tail,head);
            temp2.next = temp1;
            if(temp1 == head){
                temp1.next = null;
            }
            return tail;
        }
        public ListNode reverseList(ListNode head) {
            if(head == null) return head;
            if(head.next == null) return head;
            ListNode temp1 = head;
            ListNode temp2 = head.next;
            ListNode tail = new ListNode(-1);
            return sol(temp1,temp2,tail,head);
        }

//        this upper part is recursive   /\
//                                       ||
//                                       ||
        /// ///////////////////////////////////////
//        this upper part is recursive   ||
//                                       ||
//                                       \/


            public ListNode reservist(ListNode head) {
                ListNode prv = null;
                ListNode current = head;
                ListNode ford = head;
                while(current!=null){
                    ford = current.next;
                    current.next = prv;
                    prv = current;
                    current = ford;
                }
                return prv;
            }


    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }

        display(a);
        Solution kp = new Solution();
        System.out.println();
 //       display(kp.reverseList(a));
        display(kp.reservist(a));
//        1 --> 2 --> 3 --> 4 --> 5 --> Null
//        5 --> 4 --> 3 --> 2 --> 1 --> Null
    }
}

//
//
//206. Reverse Linked List
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Given the head of a singly linked list, reverse the list, and return the reversed list.
//
//
//
//        Example 1:
//
//
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]
//Example 2:
//
//
//Input: head = [1,2]
//Output: [2,1]
//Example 3:
//
//Input: head = []
//Output: []

