package linkdlist6q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;
//328. Odd Even Linked List
public class p7 {
    static class Solution {
        public ListNode oddEvenList(ListNode head) {
            ListNode temp = head;
            ListNode t1g =  new ListNode(-1);
            ListNode t1 = t1g;
            ListNode t2g = new ListNode(-1);
            ListNode t2 =  t2g;
            while(temp!=null){
                t1.next = temp;
                t1 = temp;
                if(temp == null) break;
                temp = temp.next;
                t2.next = temp;
                t2 = temp;
                if(temp == null) break;
                temp = temp.next;
            }

            System.out.println();
            t1.next = t2g.next;

            return t1g.next;
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
        display(kp.oddEvenList(a));
    }
}
//
//328. Odd Even Linked List
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
//
//The first node is considered odd, and the second node is even, and so on.
//
//Note that the relative order inside both the even and odd groups should remain as it was in the input.
//
//You must solve the problem in O(1) extra space complexity and O(n) time complexity.
//
//
//
//Example 1:
//
//
//Input: head = [1,2,3,4,5]
//Output: [1,3,5,2,4]
//Example 2:
//
//
//Input: head = [2,1,3,5,6,4,7]
//Output: [2,3,6,7,1,5,4]
//
//
//Constraints:
//
//The number of nodes in the linked list is in the range [0, 104].
//        -106 <= Node.val <= 106