import java.util.ArrayList;
//Validate Binary Search Tree
public class p6 {
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
        void list(ArrayList<Integer> arr,TreeNode root){
            if(root == null) return;
            list(arr,root.left);
            arr.add(root.val);
            list(arr,root.right);
        }
        public boolean isValidBST(TreeNode root) {
            ArrayList<Integer> arr = new ArrayList<>();
            list(arr,root);
            boolean op = true;
            for(int i = 1; i<arr.size(); i++){
                if(arr.get(i-1)>=arr.get(i)) op = false;
            }
            return op;
        }
    }

    public static void main(String[] args) {

    }
}
