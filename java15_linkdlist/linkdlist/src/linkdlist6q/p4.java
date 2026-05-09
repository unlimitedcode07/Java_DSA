package linkdlist6q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;

public class p4 {

      static  class Solution {
            public ListNode partition(ListNode head, int x) {
                ListNode   temp1 = head;
                ListNode temp21 = new ListNode(-1);
                ListNode temp2 = temp21;
                ListNode temp31 = new ListNode(-1);
                ListNode temp3 = temp31;
                while(temp1!=null){
                    if(temp1.val<x){
                        temp2.next = temp1;
                        temp2 =temp1 ;
                    }else{
                        temp3.next = temp1;
                        temp3 =temp1 ;
                    }
                    temp1 = temp1.next;
                    temp2.next =null;
                }
                temp2.next =temp31.next;
                temp3.next =null;
                return temp21.next;
            }

    }
    public static void main(String[] args) {
        int[] arr1 = {1,4,3,2,5,2};
        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }

        display(a);
        Solution kp = new Solution();
        System.out.println();
        display(kp.partition(a, 3));
//        1 --> 4 --> 3 --> 2 --> 5 --> 2 --> Null
//        1 --> 2 --> 2 --> 4 --> 3 --> 5 --> Null
    }
}
//
//86. Partition List
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.
//
//
//
//Example 1:
//
//
//Input: head = [1,4,3,2,5,2], x = 3
//Output: [1,2,2,4,3,5]
//Example 2:
//
//Input: head = [2,1], x = 2
//Output: [1,2]
//
//
//Constraints:
//
//The number of nodes in the list is in the range [0, 200].
//        -100 <= Node.val <= 100
//        -200 <= x <= 200