package linkdlist6q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;


public class p1 {

    static class Solution{
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1 == null){
                if(list2 == null){
                    return null;
                }else{
                    return list2;
                }
            }else{
                if(list2 == null){
                    return list1;
                }
            }

            ListNode temp1 = new ListNode(-1);

            ListNode temp = temp1;
            ListNode p1 = list1;
            ListNode p2 = list2;
            while(  p2 != null && p1 != null){
                if(p1.val<p2.val){
                    temp.next = p1;
                    temp = p1;
                    p1 = p1.next;
                }else{
                    temp.next = p2;
                    temp = p2;
                    p2 = p2.next;
                }
                if(p1 == null) temp =  temp.next = p2;
                if(p2 == null) temp =  temp.next = p1;
            }
            return temp1.next;
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,4};
        int[] arr2 = {1,3,4};
        ListNode a = new ListNode(arr1[0]);
        ListNode b = new ListNode(arr2[0]);
        ListNode temp1 = a;
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
        display(kp.mergeTwoLists(a, b));
//        1 --> 2 --> 4 --> Null
//        1 --> 3 --> 4 --> Null
//        1 --> 1 --> 2 --> 3 --> 4 --> 4 --> Null
    }
}


//
//21. Merge Two Sorted Lists
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//You are given the heads of two sorted linked lists list1 and list2.
//
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//Return the head of the merged linked list.
//
//
//
//Example 1:
//
//
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
//Example 2:
//
//Input: list1 = [], list2 = []
//Output: []
//Example 3:
//
//Input: list1 = [], list2 = [0]
//Output: [0]
//
//
//Constraints:
//
//The number of nodes in both lists is in the range [0, 50].
//        -100 <= Node.val <= 100
//Both list1 and list2 are sorted in non-decreasing order.