package linkdlist5q;
//
//Detect Loop in linked list
//Difficulty: MediumAccuracy: 43.49%Submissions: 525K+Points: 4Average Time: 20m
//You are given the head of a singly linked list. You have to determine whether the given linked list contains a loop or not. A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.
//
//Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null. Note that pos is not passed as a parameter.
//
//Examples:
//
//Input: pos = 2,
//
//Output: true
//Explanation: There exists a loop as last node is connected back to the second node.
//Input: pos = 0,
//
//Output: false
//Explanation: There exists no loop in given linked list.
//Input: pos = 1,
//
//Output: true
//Explanation: There exists a loop as last node is connected back to the first node.
//Constraints:
//        1 ≤ number of nodes ≤ 105
//        1 ≤ node->data ≤ 103
//        0 ≤ pos ≤ number of nodes
//
//
//
//
//
//

import linkdlist1.Node;

public class p4 {
   public  static class Solution {
        public boolean detectLoop(Node head) {
            Node slow = head;
            Node fast = head;

            while(fast !=null){
                if(fast.next == null) return false;
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) return true;
            }
            return false;

        }
    }
    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        // creating loop
        // 5 points back to node 3

        fifth.next = third;


        Solution obj = new Solution();

        System.out.println(obj.detectLoop(head));

    }
}
