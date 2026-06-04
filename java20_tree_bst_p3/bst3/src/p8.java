import java.util.*;
//BST to greater sum tree

// hind look for inorder , and inorder is sorted , so as prefsum but in reverse
public class p8 {
/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
} */

    class Solution {
        static   void inorder(Node root,ArrayList<Integer> arr){
            if(root == null) return;
            inorder(root.left, arr);
            arr.add(root.data);
            inorder(root.right, arr);

        }
        static void  rearang(ArrayList<Integer> arr,int i,int sum){
            if(i == -1) return;
            int a = arr.get(i);
            arr.set(i,sum);
            sum = sum +a;
            rearang(arr,i-1,sum);
        }

        static void ans(Node root,ArrayList<Node> arr1){
            if(root == null) return;
            ans(root.left, arr1);
            arr1.add(root);
            ans(root.right, arr1);
        }

        public static void transformTree(Node root) {
            ArrayList<Integer> arr = new ArrayList<>();
            inorder(root,arr);
            int sum = 0;
            rearang(arr,arr.size()-1,sum);
            ArrayList<Node> arr1 = new ArrayList<>();
            ans( root, arr1);
            for(int i = 0; i<arr.size(); i++){
                arr1.get(i).data = arr.get(i) ;
            }
        }
    }


    /// ////////////  alter and better
    ///
    ///
    class Solution2 {
        static int sum = 0;

        static void transform(Node root) {
            if (root == null) return;

            transform(root.right);

            int temp = root.data;
            root.data = sum;
            sum += temp;

            transform(root.left);
        }

        public static void transformTree(Node root) {
            sum = 0;
            transform(root);
        }
    }
    public static void main(String[] args) {

    }
}


