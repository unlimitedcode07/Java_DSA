package linkdlist5q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;


public class p3 {

    public static class solution {
        public ListNode swapNodes(ListNode head, int k) {
            ListNode temp = head;
            ListNode slow = head;
            int fst = k;
            while(fst>1){
                temp = temp.next;
                fst--;
            }
            ListNode fast = temp;
            while(fast.next!=null){
                fast = fast.next;
                slow = slow.next;
            }
            int op = slow.val;
            slow.val = temp.val;
            temp.val = op;

            return head;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode a = new ListNode(1);
        ListNode temp1 = a;
        for(int i = 1; i<arr.length; i++){
            temp1.next = new ListNode(arr[i]);
            temp1 =  temp1.next;
        }
        display(a);
        solution kp = new solution();
        System.out.println();
        ListNode ans = kp.swapNodes(a, 2);
        display(ans);

    }
}

//
//1721. Swapping Nodes in a Linked List
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Hint
//You are given the head of a linked list, and an integer k.
//
//Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
//
//
//
//Example 1:
//
//
//Input: head = [1,2,3,4,5], k = 2
//Output: [1,4,3,2,5]
//Example 2:
//
//Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
//Output: [7,9,6,6,8,7,3,0,9,5]
//
//
//Constraints:
//
//The number of nodes in the list is n.
//1 <= k <= n <= 105
//        0 <= Node.val <= 100