import java.util.ArrayList;
import java.util.List;
// this si morris traversal {inorder}
public class p15 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> arr = new ArrayList<>();
            TreeNode curr = root;
            if(root == null) return arr;
            while(curr!= null){
                if(curr.left != null){
                    TreeNode pred = curr.left;
                    while(pred.right != null && pred.right != curr) pred = pred.right;
                    if(pred.right == null){
                        pred.right = curr;
                        curr = curr.left;
                    }else{
                        arr.add(curr.val);
                        curr = curr.right;
                        pred.right = null;
                    }
                }else{
                    arr.add(curr.val);
                    curr = curr.right;
                }
            }
            return arr;
        }
    }

    public static void main(String[] args) {

    }
}
