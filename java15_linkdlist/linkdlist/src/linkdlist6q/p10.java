package linkdlist6q;
import linkdlist1.ListNode;
import static linkdlist1.ListNode.display;

public class p10 {
    static class Solution {

        public ListNode reverseBetween(ListNode head, int left, int right) {
            if(left -right == 0) return head;
            ListNode temp = new ListNode(-1);
            ListNode kp = temp;
            kp.next = head;
            kp = head;

            //
            ListNode t1 = new ListNode(-1);
            ListNode t11 = t1;



            ListNode t2 = new ListNode(-1);
            ListNode t21 = t2;

            ListNode t3 = new ListNode(-1);
            ListNode t31 = t3;

            int count = 1;
            while(count!=left){
                System.out.println(t11.val);
                t11.next = kp;
                t11 = kp;
                count++;
                kp = kp.next;
            }
            System.out.println(t11.val);
            System.out.println("-----------");
            t11.next = null;
            count--;
            while(count!=right){
                System.out.println(t21.val);
                t21.next = kp;
                t21 = kp;
                count++;
                kp = kp.next;
            }
            System.out.println(t21.val);
            t21.next = null;
            System.out.println("-----------");
            while(kp!= null){
                System.out.println(t31.val);
                t31.next = kp;
                t31 = kp;
                kp = kp.next;
            }
            System.out.println(t31.val);
            t31.next = null;
            System.out.println("-----------");



            ListNode prv = null;
            ListNode current = t2.next;
            ListNode ford ;
            while(current!=null){
                ford = current.next;
                current.next = prv;
                prv = current;
                current = ford;
            }
            t11.next = prv;
            while(prv!=null){
                if(prv.next == null) break;
                prv = prv.next;
            }
            prv.next = t3.next;
            return t1.next;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        ListNode a = new ListNode(arr1[0]);
        ListNode temp1 = a;

        for(int i = 1; i < arr1.length; i++){
            temp1.next = new ListNode(arr1[i]);
            temp1 = temp1.next;
        }

        display(a);
        Solution kp = new Solution();
        System.out.println();
        display(kp.reverseBetween(a, 2,4));

    }
}

//solution in js using array
///**
// * @param {ListNode} head
// * @param {number} left
// * @param {number} right
// * @return {ListNode}
// */
//var reverseBetween = function(head, left, right) {
//let arr = [];
//let temp = head;
//let op = new ListNode(-1);
//    while(temp!=null){
//op.next = temp;
//      arr.push(temp);
//temp = temp.next;
//    }
//let i = left;
//let j = right;
//    while(i<j){
//let kp = arr[i-1] ;
//arr[i-1] = arr[j-1];
//arr[j-1] = kp;
//j--;
//i++;
//        }
//let size = arr.length;
//let td = new ListNode(-1);
//let om = td ;
//i = 0
//        while(size>0){
//om.next = arr[i];
//om = arr[i++];
//size--;
//        }
//om.next = null;
//        return td.next;
//
//};