public class p16 {
    // this si is Bst using moris
    // is morise trravela from inorder it travel less to more
    // so store prives and compare with curent
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
        // void list(ArrayList<Integer> arr,TreeNode root){
        //   if(root == null) return;
        //   list(arr,root.left);
        //   arr.add(root.val);
        //   list(arr,root.right);
        // }
        public boolean isValidBST(TreeNode root) {
            TreeNode curr = root;
            long prev = Long.MIN_VALUE;
            while(curr!= null){
                if(curr.left != null){
                    TreeNode pred = curr.left;
                    while(pred.right != null && pred.right != curr) pred = pred.right;
                    if(pred.right == null){
                        pred.right = curr;
                        curr = curr.left;
                    }else{
                        // arr.add(curr.val);
                        pred.right = null;
                        if(curr.val<= prev) return false;
                        prev = curr.val;
                        curr = curr.right;

                    }
                }else{
                    // arr.add(curr.val);
                    if(curr.val<= prev) return false;
                    prev = curr.val;
                    curr = curr.right;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
