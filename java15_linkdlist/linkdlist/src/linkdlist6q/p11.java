package linkdlist6q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;

public class p11 {
    static class Solution {

        static ListNode revers(ListNode l1){
            ListNode prv = null;
            ListNode current = l1;
            ListNode ford = l1;
            while(current!=null){
                ford = current.next;
                current.next = prv;
                prv = current;
                current = ford;
            }
            return prv;
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode r1  = revers(l1);
            ListNode r2  = revers(l2);

            ListNode t1 = new ListNode(-1);
            t1.next = r1;
            t1 = r1;

            ListNode t2 = new ListNode(-1);
            t2.next = r2;
            t2 = r2;

            ListNode ans = new ListNode(-1);
            ListNode t3 = ans;

            int sky = 0;
            int val = 0;
            int fst = 0;
            int lst = 0;

            while(t1!=null || t2!=null){
                if(t1!= null){
                    fst = t1.val;
                    t1 = t1.next;
                }else{
                    fst = 0;
                }

                if(t2!= null){
                    lst = t2.val;
                    t2 = t2.next;
                }else{
                    lst = 0;
                }

                if(fst + lst +sky >=10){
                    int  op = fst + lst +sky;
                    val = op%10;
                    sky = op/10;

                } else{
                    val = fst + lst  + sky;
                    sky = 0;
                }

                ListNode temp = new ListNode(val);
                t3.next = temp;
                t3 = temp;
            }
            if(sky != 0){
                ListNode temp = new ListNode(sky);
                t3.next = temp;
                t3 = temp;
            }

            t3.next = null;

            ListNode r3 = revers(ans.next);
            return r3;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {7,2,4,3};
        int[] arr2 = {5,6,4};

        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;
        ListNode b = new ListNode(arr2[0]);
        ListNode temp2 = b;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }
        for(int i = 1; i < arr2.length; i++){
            temp2.next = new ListNode(arr2[i]);
            temp2 = temp2.next;
        }

        display(a);
        System.out.println();
        display(b);


        Solution kp = new Solution();
        System.out.println();
        display(kp.addTwoNumbers(a,b));
//        7 --> 2 --> 4 --> 3 --> Null
//        5 --> 6 --> 4 --> Null
//        7 --> 8 --> 0 --> 7 --> Null
    }
}
//
//445. Add Two Numbers II
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//
//
//        Example 1:
//
//
//Input: l1 = [7,2,4,3], l2 = [5,6,4]
//Output: [7,8,0,7]
//Example 2:
//
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [8,0,7]
//Example 3:
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//
//
//Constraints:
//
//The number of nodes in each linked list is in the range [1, 100].
//        0 <= Node.val <= 9
//It is guaranteed that the list represents a number that does not have leading zeros.
//
//
//Follow up: Could you solve it without reversing the input lists?