package linkdlist4q;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode middleNode(ListNode head) {

        ListNode temp = head;
        int count = 0;

        while(temp != null){
            temp = temp.next;
            count++;
        }

        int fact = count / 2;

        ListNode temp1 = head;

        while(fact != 0){
            temp1 = temp1.next;
            fact--;
        }

        return temp1;
    }
    // slow fast
    public ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == null) return slow;
        }
        return slow;

    }
}

public class p1 {

    // display method
    public static void display(ListNode head){

        ListNode temp = head;

        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // reusable linked list creator
    public static ListNode create(int[] arr){

        if(arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);

        ListNode temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode head = create(new int[]{1,2,3,4,5,6});

        display(head);

        Solution obj = new Solution();

        ListNode ans = obj.middleNode(head);

        display(ans);
        // beter
        ListNode ans1 = obj.middleNode2(head);
        display(ans1);
    }
}

//
//1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
//        4 -> 5 -> 6 -> null

//
//876. Middle of the Linked List
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Given the head of a singly linked list, return the middle node of the linked list.
//
//If there are two middle nodes, return the second middle node.
//
//
//
//Example 1:
//
//
//Input: head = [1,2,3,4,5]
//Output: [3,4,5]
//Explanation: The middle node of the list is node 3.
//Example 2:
//
//
//Input: head = [1,2,3,4,5,6]
//Output: [4,5,6]
//Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.