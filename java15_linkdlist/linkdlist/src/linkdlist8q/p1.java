package linkdlist8q;
import static linkdlist8q.Node.display;

public class p1 {
    static class Solution {
        public Node reverse(Node head) {
            Node temp = head;
            if(temp.next == null) return temp;
            int count = 1;
            while(temp.next!=null){
                count++;
                temp = temp.next;
            }

            Node tail = temp;
            Node kp = head;
            Node h = kp;
            int i = 1;
            int j = count;
            while(i<j){
                int s1 = tail.val;
                int s2 = h.val;
                h.val = s1;
                tail.val = s2;
                h = h.next;
                tail = tail.prev;
                i++;
                j--;
            }
            return kp;

        }
    }
    public static void main(String[] args) {
        int[] arr = {75,122,59,196};
        Node a = new Node(arr[0]);
        Node temp1 = a;

        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);

            temp1.next = newNode;
            newNode.prev = temp1;   // IMPORTANT

            temp1 = temp1.next;
        }
        display(a);
        System.out.println();
        Solution kp = new Solution();
        display(kp.reverse(a));
//        75 --> 122 --> 59 --> 196 --> Null
//        196 --> 59 --> 122 --> 75 --> Null

    }
}
