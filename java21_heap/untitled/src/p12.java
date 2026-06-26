import java.util.LinkedList;
import java.util.Queue;

public class p12 {

    //bst to max heap { using post and inorder trick : reference p11}


 static class Node {
     int data;
     Node left;
     Node right;

     Node(int data) {
         this.data = data;
         left = null;
         right = null;
     }
 }
        public static void inoreder(Node root , Queue<Integer> arr){
            if(root == null) return;
            inoreder(root.left,arr);
            arr.offer(root.data);
            inoreder(root.right,arr);
        }
        public static void post(Node root , Queue<Integer> arr){
            if(root == null) return;
            post(root.left,arr);
            post(root.right,arr);
            root.data = arr.poll();
        }
        public static void convertToMaxHeapUtil(Node root) {
            Queue<Integer> arr = new LinkedList<>();
            inoreder(root,arr);
            post(root,arr);
        }

    public static void main(String[] args) {
         Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        d.left = b;
        d.right = f;

        b.left = a;
        b.right = c;

        f.left = e;
        f.right = g;

        convertToMaxHeapUtil(a);

    }
}
