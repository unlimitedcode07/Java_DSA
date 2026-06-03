package linkdlist6q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;

// try recursively hint : p9
public class p8 {
    static class Solution {
        static ListNode mergsort(ListNode a,ListNode b){
            ListNode op = new ListNode(-1);
            ListNode c = op;
            while(a!=null && b!=null){
                if(a.val >b.val){
                    c.next = b;
                    c = b;
                    b = b.next;
                }else{
                    c.next = a;
                    c = a;
                    a = a.next;
                }
            }
            while(a!=null){
                c.next = a;
                c = a;
                a = a.next;
            }
            while(b!=null){
                c.next = b;
                c = b;
                b = b.next;
            }
            return op.next;
        }


        public ListNode mergeKLists(ListNode[] lists) {
            if(lists.length == 0) return null;
            if(lists.length == 1) return lists[0];
            int size = lists.length-1;
            while(size>0){
                ListNode a = lists[size];
                ListNode b = lists[size-1];
                ListNode c = mergsort(a,b);
                lists[--size] = c;
            }
            return lists[0];

        }}
    public static void main(String[] args) {
        int[] arr1 = {1,4,5};
        int[] arr2 = {1,3,4};
        int[] arr3 = {2,6};

        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;
        ListNode b = new ListNode(arr2[0]);
        ListNode temp2 = b;
        ListNode c = new ListNode(arr3[0]);
        ListNode temp3 = c;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }
        for(int i = 1; i < arr2.length; i++){
            temp2.next = new ListNode(arr2[i]);
            temp2 = temp2.next;
        }
        for(int i = 1; i < arr3.length; i++){
            temp3.next = new ListNode(arr3[i]);
            temp3 = temp3.next;
        }
        ListNode[] arr = {a,b,c};

        display(a);
        display(b);
        display(c);

        Solution kp = new Solution();
        System.out.println();
        display(kp.mergeKLists(arr));
    }
}
//
//23. Merge k Sorted Lists
//Solved
//        Hard
//Topics
//premium lock icon
//        Companies
//You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//
//Merge all the linked-lists into one sorted linked-list and return it.
//
//
//
//        Example 1:
//
//Input: lists = [[1,4,5],[1,3,4],[2,6]]
//Output: [1,1,2,3,4,4,5,6]
//Explanation: The linked-lists are:
//        [
//        1->4->5,
//        1->3->4,
//        2->6
//        ]
//merging them into one sorted linked list:
//        1->1->2->3->4->4->5->6
//Example 2:
//
//Input: lists = []
//Output: []
//Example 3:
//
//Input: lists = [[]]
//Output: []
//
//
//Constraints:
//
//k == lists.length
//0 <= k <= 104
//        0 <= lists[i].length <= 500
//        -104 <= lists[i][j] <= 104
//lists[i] is sorted in ascending order.
//The sum of lists[i].length will not exceed 104.