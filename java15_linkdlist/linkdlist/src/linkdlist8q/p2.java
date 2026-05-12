package linkdlist8q;

import static linkdlist8q.Node.display;

//rotate doubly linked list gfg
public class p2 {
    static class Solution {
        public Node rotateDLL(Node head, int p) {
            Node temp = head;
            if(temp.next == null) return head;
            if(p == 0) return head;
            int count = 1;
            while(count < p){
                temp = temp.next;
                if(temp.next == null) return head;
                count++;
            }
            Node op = temp.next;
            Node kp = op;
            temp.next = null;
            while(kp.next!=null) kp = kp.next;
            kp.next = head;
            head.prev = kp;
            return op;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node a = new Node(arr[0]);
        Node temp1 = a;

        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);

            temp1.next = newNode;
            newNode.prev = temp1;

            temp1 = temp1.next;
        }
        display(a);
        System.out.println();
        Solution kp = new Solution();
        display(kp.rotateDLL(a,2));
//        1 --> 2 --> 3 --> 4 --> 5 --> 6 --> Null
//        3 --> 4 --> 5 --> 6 --> 1 --> 2 --> Null
    }
}

