package linkdlist6q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;

public class p6 {
    static class Solution {
        public boolean isPalindrome(ListNode head) {
            if(head.next == null) return true;
            ListNode temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }

            ListNode op = head;
            ListNode kp = op;
            int g = (count/2)-1;

            while(g>0){
                g--;
                kp = kp.next;
            }
            if(count%2 ==0)  temp = kp.next;
            else temp = kp.next.next;
            kp.next = null;

            ListNode pre = null;
            ListNode current = temp;
            ListNode kl = temp;
            while(current!=null){
                kl = current.next;
                current.next = pre;
                pre = current;
                current = kl;
            }

            while(pre!=null){
                if(pre.val != op.val){

                    return false;
                }
                op = op.next;
                pre = pre.next;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,0,4,0,1};
        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }

        display(a);
        Solution kp = new Solution();
        System.out.println();
        System.out.println(kp.isPalindrome(a));

    }
}
//234. Palindrome Linked List
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
//
//
//
//        Example 1:
//
//
//Input: head = [1,2,2,1]
//Output: true
//Example 2:
//
//
//Input: head = [1,2]
//Output: false
//
//
//Constraints:
//
//The number of nodes in the list is in the range [1, 105].
//        0 <= Node.val <= 9
//
//
//Follow up: Could you do it in O(n) time and O(1) space?