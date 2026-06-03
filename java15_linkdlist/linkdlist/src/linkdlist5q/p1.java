package linkdlist5q;

import linkdlist1.Node;
import static linkdlist1.Node.display;


public class p1 {
    static class Solution {
        int getKthFromLast(Node head, int k) {
           Node temp = head;
           Node temp2 = head;
           for(int i = 1; i<k; i++){
               temp2 = temp2.next;
               if(temp2 == null) return -1;
           }
           while(temp2.next!=null){
               temp2 = temp2.next;
               temp = temp.next;
           }
           return temp.val;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,5,100,5};
        Node a = new Node(arr[0]);
        Node temp = a;
        for(int i = 1; i<arr.length; i++){
            Node op =  new Node(arr[i]);
            temp.next = op;
            temp = op;
        }
        display(a);
        Solution kp = new Solution();
        System.out.println();
        System.out.println(kp.getKthFromLast(a, 4));

    }
}

//
//Kth from End of Linked List
//Difficulty: EasyAccuracy: 41.18%Submissions: 457K+Points: 2Average Time: 30m
//You are given the head of a linked list and the number k, You have to return the kth node from the end of linkedList. If k is more than the number of nodes, then the return -1.
//
//Examples
//
//Input: head: 1->2->3->4->5->6->7->8->9, k = 2
//Output: 8
//Explanation: The given linked list is 1->2->3->4->5->6->7->8->9. The 2nd node from end is 8.
//
//Input: head: 10->5->100->5, k = 5
//Output: -1
//Explanation: The given linked list is 10->5->100->5. Since 'k' is more than the number of nodes, the output is -1.
//
//Constraints:
//        1 ≤ number of nodes ≤ 106
//        1 ≤ node->data , x ≤ 106
//        1 ≤ k ≤ 106