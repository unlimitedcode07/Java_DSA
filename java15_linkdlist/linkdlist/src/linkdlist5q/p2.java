package linkdlist5q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;
public class p2 {

    public static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
           return headA;
        }
    }


    public static void main(String[] args) {
        int[] arr = {10,5,100,5};
        ListNode a = new ListNode(arr[0]);
        ListNode temp = a;
        for(int i = 1; i<arr.length; i++){
            ListNode op =  new ListNode(arr[i]);
            temp.next = op;
            temp = op;
        }
        display(a);
        Solution kp = new Solution();
        System.out.println();
        System.out.println(kp.getIntersectionNode( a,a));

    }
}
