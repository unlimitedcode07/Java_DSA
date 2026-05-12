package linkdlist8q;
// 430. Flatten a Multilevel Doubly Linked List
public class p4 {
//imp q must solve
//    https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/


//    class Solution {
//        public Node flatten(Node head) {
//            Node current = head;
//            while(current!=null){
//                if(current.child == null){
//                    current = current.next;
//                }else{
//                    Node ford = current.next;
//                    Node c = flatten(current.child);
//                    current.next = c;
//                    current.child = null;
//                    c.prev = current;
//                    while(c.next!=null)c = c.next;
//                    c.next = ford;
//                    if(ford !=null)ford.prev = c;
//                }
//            }
//            return head;
//        }
//    }
    public static void main(String[] args) {

    }
}
