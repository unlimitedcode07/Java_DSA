package linkdlist5q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;

public class p11 {
    static class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if(head == null) return head;
            ListNode temp = head;

            int i = 0;
            ListNode tail = null;   // must initial something
            while(temp !=null){
                if(temp.next == null){
                    tail = temp;
                }
                temp = temp.next;
                i++;
            }
            if(i<k){
               k = k%i;
            }
            tail.next = head;

            int gose = i-k;
            temp = tail;
            System.out.println(i+" "+k+" "+gose);
            while(gose!=0){
                gose--;
                temp = temp.next;
            }
            head = temp.next;
            tail = temp;
            tail.next = null;
            return head;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {0,1,2};
        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }

        display(a);
        Solution kp = new Solution();
        System.out.println();
        display(kp.rotateRight(a, 4));

    }
}
