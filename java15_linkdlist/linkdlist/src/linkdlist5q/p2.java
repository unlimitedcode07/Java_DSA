package linkdlist5q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;
public class p2 {

    public static class Solution {
        ListNode  fuck(ListNode big,int t){
            while(t>0){
                big = big.next;
                t--;
            }
            return big;
        }
        ListNode op(ListNode a,ListNode b) {
            while (a != b) {
                a = a.next;
                b = b.next;
            }
            return a;
        }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode temp1 = headA;
            ListNode temp2 = headB;
            int t1 = 1;
            int t2 = 1;
            while(temp1.next!=null){
                temp1 = temp1.next;
                t1++;
            }
            while(temp2.next!=null){
                temp2 = temp2.next;
                t2++;
            }
            int t = 0;

            temp1 = headA;
            temp2 = headB;

            if(t1>t2){
                t = t1-t2;
                temp1 = fuck(temp1,t);
                return op(temp1,temp2);
            }
            else {
                t = t2-t1;
                temp2 = fuck(temp2,t);
                return op(temp2,temp1);
            }
        }
    }


    public static void main(String[] args) {

        int[] arr1 = {4,1};
        int[] arr2 = {5,6,1};
        int[] common = {8,4,5};


// first list
        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }


// second list
        ListNode b = new ListNode(arr2[0]);
        ListNode temp2 = b;

        for(int i = 1; i < arr2.length; i++){
            temp2.next = new ListNode(arr2[i]);
            temp2 = temp2.next;
        }


// common part
        ListNode commonHead = new ListNode(common[0]);
        ListNode temp3 = commonHead;

        for(int i = 1; i < common.length; i++){
            temp3.next = new ListNode(common[i]);
            temp3 = temp3.next;
        }


// attach common part
        temp1.next = commonHead;
        temp2.next = commonHead;


        display(a);
        System.out.println();
        display(b);

        Solution kp = new Solution();

        ListNode op = kp.getIntersectionNode(a,b);
        System.out.println();
        display(op);
//        4 --> 1 --> 8 --> 4 --> 5 --> Null
//        5 --> 6 --> 1 --> 8 --> 4 --> 5 --> Null
//        8 --> 4 --> 5 --> Null

    }
}
//
//160. Intersection of Two Linked Lists
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
//
//        For example, the following two linked lists begin to intersect at node c1:
//
//
//The test cases are generated such that there are no cycles anywhere in the entire linked structure.
//
//Note that the linked lists must retain their original structure after the function returns.
//
//Custom Judge:
//
//The inputs to the judge are given as follows (your program is not given these inputs):
//
//intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
//        listA - The first linked list.
//listB - The second linked list.
//skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
//skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
//The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.
//
//
//
//Example 1:
//
//
//Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
//Output: Intersected at '8'
//Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
//From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
//- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.
//Example 2:
//
//
//Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
//Output: Intersected at '2'
//Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
//From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
//        Example 3:
//
//
//Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
//Output: No intersection
//Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
//        Explanation: The two lists do not intersect, so return null.
//
//
//Constraints:
//
//The number of nodes of listA is in the m.
//The number of nodes of listB is in the n.
//        1 <= m, n <= 3 * 104
//        1 <= Node.val <= 105
//        0 <= skipA <= m
//0 <= skipB <= n
//intersectVal is 0 if listA and listB do not intersect.
//intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.
//
//
//Foll