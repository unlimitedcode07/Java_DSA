package linkdlist5q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;
// see q in p10

public class p8 {
   static  class Solution {
        public ListNode deleteDuplicates(ListNode head) {

            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            ListNode prev = dummy;
            ListNode curr = head;

            while(curr != null){

                // duplicate found
                if(curr.next != null && curr.val == curr.next.val){

                    // skip all duplicates
                    while(curr.next != null && curr.val == curr.next.val){
                        curr = curr.next;
                    }

                    prev.next = curr.next;
                }
                else{
                    prev = prev.next;
                }

                curr = curr.next;
            }

            return dummy.next;
        }
    }
//  static  class Solution {
//        public ListNode deleteDuplicates(ListNode head) {
//            if(head == null) return head;
//            if(head.next == null) return head;
//            ListNode fast = head;
//
//            ListNode copy = new ListNode(-999999999);
//            ListNode slow = head;
//
//            ListNode n = new ListNode(-1);
//            ListNode temp = n;
//
//            while(fast != null ){
//
//                if(fast == slow) {
//                    System.out.println("am same");
//                    fast = fast.next;
//                }
//                else{
//                    if(fast.val == slow.val){
//                        copy = fast;
//                        slow = slow.next;
//                    }else{
//                        if(copy.val == slow.val){
//                            slow = slow.next;
//                        }else{
//                            ListNode temp1 = new ListNode(slow.val);
//                            temp.next = temp1;
//                            temp = temp1;
//                            slow = slow.next;
//                        }
//                    }
//                }
//                if(slow == fast && slow.next == null) {
//                    if (slow != copy) {
//                        ListNode temp1 = new ListNode(slow.val);
//                        temp.next = temp1;
//                        temp = temp1;
//                    }
//                }
//            }
//            return n.next;
//        }
//    } // my over complex solution







    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4,4,5};
        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }

        display(a);
        Solution kp = new Solution();
        System.out.println();
        display(kp.deleteDuplicates(a));
    }
}


//my simplest js solution    using arr and maps
// */
///**
// * @param {ListNode} head
// * @return {ListNode}
// */
//var deleteDuplicates = function(head) {
//        if(head == null) return head;
//let temp = head;
//let arr = [];
//        while(temp != null){
//        arr.push(temp.val);
//temp = temp.next;
//        }
//
//let a = 0;
//let b = 0;
//let op = {
//
//}
//        for(let i = 0; i<arr.length; i++){
//        if(op[arr[i]] == undefined){
//op[arr[i]] = 1;
//        }else{
//op[arr[i]] = op[arr[i]] + 1;
//        }
//        }
//let arr3 = arr.filter((el)=> op[el] == 1 )
//       if(arr3[0] == undefined) return temp;
//let k = new ListNode(arr3[0]);
//let temp1 = k;
//        for(let i = 1; i<arr3.length; i++){
//let  c = new ListNode(arr3[i])
//temp1.next = c;
//temp1 = c;
//        }
//                return k
//};