package linkdlist6q;
import linkdlist1.ListNode;
import linkdlist5q.p8;
// merg sort in linked list
// optimise and best is in p3
import static linkdlist1.ListNode.display;

public class p2 {
    static class Solution {
        public ListNode sortList(ListNode head) {
            ListNode temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }

           temp = sortrecursive(head,count);
            return temp;
        }

        private ListNode sortrecursive(ListNode head, int count) {
            if(count == 1 || count ==0){
                return head;
            }
            int a = count/2;
            int b = count-a;
            ListNode op = head;
            ListNode a1 = new ListNode(-1);
            ListNode a11 = a1;
            ListNode a2 = new ListNode(-1);
            ListNode a21 = a2;
           for(int i = 0; i<a; i++){
               if(op == null) return head;
               ListNode temp = new ListNode(op.val);
               a11.next = temp;
               a11 = a11.next;
               op = op.next;
           }
            for(int i = 0; i<b; i++){
                if(op == null) return head;
                ListNode temp = new ListNode(op.val);
                a21.next = temp;
                a21 = a21.next;
                op = op.next;
            }

            ListNode l = sortrecursive(a1.next,a);
            ListNode r = sortrecursive(a2.next,b);
            return listsort(l,r,head);
        }

        private ListNode listsort(ListNode l1, ListNode l2,ListNode head) {

            ListNode l3 = new ListNode(-1);
            ListNode l31 = l3;
            while(l1 != null && l2 != null){
                if(l1.val <=l2.val){
                    ListNode temp = new ListNode(l1.val);
                    l31.next = temp;
                    l31 = l31.next;
                    l1 = l1.next;
                }else{
                    ListNode temp = new ListNode(l2.val);
                    l31.next = temp;
                    l31 = l31.next;
                    l2 = l2.next;
                }

            }
            while(l1 != null ){
                ListNode temp = new ListNode(l1.val);
                l31.next = temp;
                l31 = l31.next;
                l1 = l1.next;
            }
            while(l2 != null ){
                ListNode temp = new ListNode(l2.val);
                l31.next = temp;
                l31 = l31.next;
                l2 = l2.next;
            }

            return l3.next;

        }

    }
    public static void main(String[] args) {
        int[] arr1 = {4,2,1,3};
        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }

        display(a);
        Solution kp = new Solution();
        System.out.println();
        display(kp.sortList(a));
    }
}
//
//148. Sort List
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Given the head of a linked list, return the list after sorting it in ascending order.
//
//
//
//Example 1:
//
//
//Input: head = [4,2,1,3]
//Output: [1,2,3,4]
//Example 2:
//
//
//Input: head = [-1,5,3,4,0]
//Output: [-1,0,3,4,5]
//Example 3:
//
//Input: head = []
//Output: []
//
//
//Constraints:
//
//The number of nodes in the list is in the range [0, 5 * 104].
//        -105 <= Node.val <= 105