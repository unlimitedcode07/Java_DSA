import java.util.ArrayList;
import java.util.Collections;
//  //  Tree Boundary Traversal   gfg
public class p6 {

    class Solution {
        void leafNode(Node root, ArrayList<Integer> leaf ){
            if(root == null) return;
            if(root.right == null && root.left == null ){
                leaf.add(root.data);
            }
            leafNode(root.left,leaf);
            leafNode(root.right,leaf);
        }

        void rNode(Node root,ArrayList<Integer> r){
            if(root == null) return;
            if(root.right == null && root.left == null ){
                return;
            }
            r.add(root.data);
            if(root.right != null){
                rNode(root.right,r);
            }
            else{
                rNode(root.left,r);
            }
        }

        void lNode(Node root,ArrayList<Integer> l){
            if(root == null) return;
            if(root.right == null && root.left == null ){
                return;
            }
            l.add(root.data);
            if(root.left != null){
                lNode(root.left,l);
            }
            else{
                lNode(root.right,l);
            }
        }

        ArrayList<Integer> boundaryTraversal(Node root) {

            ArrayList<Integer> leaf = new ArrayList<>();
            ArrayList<Integer> r = new ArrayList<>();
            leaf.add(root.data);
            if(root.right == null && root.left == null ){
                return leaf;
            }else{
                lNode(root.left,leaf);
                leafNode(root,leaf);
                rNode(root.right,r);
                Collections.reverse(r);
                leaf.addAll(r);
            }

            return leaf;
        }
    }

    public static void main(String[] args) {
        //  Tree Boundary Traversal   gfg
    }
}
