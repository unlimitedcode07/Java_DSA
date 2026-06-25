

import java.util.*;
/// Is Binary Tree Heap   imp with trick  see at start heap 2 stat q
///
public class p10 {

class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


    class Solution {
        boolean op(Node tree){
            if(tree == null) return true;
            if(tree.left == null && tree.right == null) return true;
            boolean a = op(tree.left);
            boolean b = op(tree.right);
            boolean x;
            boolean y;

            if(tree.right != null){
                if(tree.data > tree.right.data) x = true;
                else return false ;
            }else x = true;

            if(tree.left != null){
                if(tree.data > tree.left.data) y = true;
                else return false ;
            }else y = true;

            if(x == true && y == true ){
                return a && b;
            }else return false;


        }

        public void kp(Node tree,int val){
            if(tree == null) return;
            tree.data = val;
            if(tree.left != null) kp(tree.left, tree.data*2);
            if(tree.right != null) kp(tree.right, (tree.data*2)+1);
        }


        public void see(Node tree, PriorityQueue<Integer> maxHeap){
            if(tree == null) return ;
            maxHeap.add(tree.data);
            see(tree.left,maxHeap);
            see(tree.right,maxHeap);
        }

        public boolean isHeap(Node tree) {
            boolean jk = op(tree);
            if(jk == false) return false;
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            kp(tree,1);
            see(tree,maxHeap);
            if(maxHeap.size() == maxHeap.peek()) return true;
            else return false;
        }
    }
    public static void main(String[] args) {

    }
}
