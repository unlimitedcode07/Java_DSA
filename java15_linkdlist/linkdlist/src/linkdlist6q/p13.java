package linkdlist6q;
// ths is circular thats why cant print
//
// Split a Linked List into two halves
//Difficulty: EasyAccuracy: 61.63%Submissions: 65K+Points: 2
//Given a Circular linked list. The task is split into two Circular Linked lists. If there are an odd number of nodes in the given circular linked list then out of the resulting two halved lists, the first list should have one node more than the second list.
//
//Examples :
//
//Input: LinkedList : 10->4->9
//Output: 10->4 , 9
//
//Explanation: After dividing linked list into 2 parts , the first part contains 10, 4 and second part contain only 9.
//Input: LinkedList : 10->4->9->10
//Output: 10->4 , 9->10
//
//Explanation: After dividing linked list into 2 parts , the first part contains 10, 4 and second part contain 9, 10.
public class p13 {
}

//Count nodes in circular list
//Break circular link temporarily
//Split like normal linked list
//Make both circular again



//class Solution {
//    splitList(head) {
//
//        // count nodes
//        let temp = head;
//        let count = 1;
//
//        while (temp.next != head) {
//            count++;
//            temp = temp.next;
//        }
//
//        // break circular
//        temp.next = null;
//
//        let s1, s2;
//
//        if (count % 2 == 0) {
//            s1 = s2 = count / 2;
//        } else {
//            s1 = Math.floor(count / 2) + 1;
//            s2 = Math.floor(count / 2);
//        }
//
//        temp = head;
//
//        let head1 = temp;
//
//        // move to end of first half
//        for (let i = 1; i < s1; i++) {
//            temp = temp.next;
//        }
//
//        let head2 = temp.next;
//
//        // break first half
//        temp.next = head1;
//
//        // go to end of second half
//        let temp2 = head2;
//
//        while (temp2.next != null) {
//            temp2 = temp2.next;
//        }
//
//        // make second half circular
//        temp2.next = head2;
//
//        return [head1, head2];
//    }
//}
