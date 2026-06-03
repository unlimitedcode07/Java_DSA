package linkdlist8q;

import static linkdlist8q.Node.display;

// Remove duplicates from a sorted DLL
public class p3 {
    static class Solution{

            Node removeDuplicates(Node head) {
                if(head == null) return head;
                if(head.next == null) return head;

                Node op = head;
                op = op.next;

                Node temp = new Node(-1);
                temp.next = head;
                temp = head;
                while(op!=null){
                    if(temp.val == op.val){
                        while(op.val == temp.val){
                            op = op.next;
                            if(op == null) break;
                        }
                    }
                    temp.next = op;
                    temp = op;
                    if(op!=null)op = op.next;


                }
                return head;

            }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,5};
        Node a = new Node(arr[0]);
        Node temp1 = a;

        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);

            temp1.next = newNode;
            newNode.prev = temp1;

            temp1 = temp1.next;
        }
        display(a);
        System.out.println();
        Solution kp = new Solution();
        display(kp.removeDuplicates(a));
//        1 --> 2 --> 2 --> 4 --> 5 --> 5 --> Null
//        1 --> 2 --> 4 --> 5 --> Null
    }
}
//        Remove duplicates from a sorted DLL
//        Difficulty: EasyAccuracy: 50.36%Submissions: 83K+Points: 2Average Time: 10m
//        Given a doubly linked list of n nodes sorted by values, remove duplicate nodes present in the linked list.
//
//        Examples:
//
//        Input: n = 6, Linked List: 1<->1<->1<->2<->3<->4
//        Output: 1<->2<->3<->4
//        Explanation:
//        Only the first occurance of node with value 1 is
//        retained, rest nodes with value = 1 are deleted.
//        Input: n = 7, Linked List: 1<->2<->2<->3<->3<->4<->4
//        Output: 1<->2<->3<->4
//        Explanation:
//        Only the first occurance of nodes with values 2,3 and 4 are
//        retained, rest repeating nodes are deleted.
//        Constraint:
//        1 ≤ n ≤ 105