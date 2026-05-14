package stack3;

public class p3 {
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode removeNodes(ListNode head) {
//        Stack <Integer> st1 = new Stack();
//        int count = 0;
//        while(head!=null){
//            st1.push(head.val);
//            head = head.next;
//            count++;
//        }
//        Stack <Integer> st2 = new Stack();
//        ListNode op = new ListNode(st1.peek());
//
//        for(int i = 0; i<count; i++){
//            int kp = st1.pop();
//            if(st2.size() == 0){
//                st2.push(kp);
//            }
//            else{
//                int td = st2.peek();
//                if(td<=kp){
//                    st2.push(kp);
//                    ListNode t1 = new ListNode(kp);
//                    t1.next = op;
//                    op = t1;
//                }
//            }
//        }
//        return op;
//
//    }
//}