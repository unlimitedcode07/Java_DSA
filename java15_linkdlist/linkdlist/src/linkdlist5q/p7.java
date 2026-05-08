package linkdlist5q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;

public class p7 {
    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode temp = head;
            if(temp == null) return head;
            ListNode op = temp.next;
            while(op != null){
                if(temp.val == op.val){
                    if(op.next == null ){
                        temp.next = null;
                        return head;
                    }else  {
                        temp.next = op.next;
                        op = op.next;
                    }
                }else{
                    temp = temp.next;
                    op = op.next;
                }
            }
            return head;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3};
        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }

        display(a);
       // 1 --> 1 --> 2 --> 3 --> 3 --> Null

        Solution kp = new Solution();
        System.out.println();
        display(kp.deleteDuplicates(a));
        //1 --> 2 --> 3 --> Null
    }
}

//
//Code
//        Testcase
//Testcase
//Test Result
//83. Remove Duplicates from Sorted List