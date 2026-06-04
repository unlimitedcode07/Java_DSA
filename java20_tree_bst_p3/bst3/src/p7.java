public class p7 {
   // Lowest Common Ancestor of a Binary Search Tree

   class Solution {
       public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
           if(root.val >=Math.min(p.val,q.val) && root.val <=Math.max(p.val,q.val)) return root;
           if(root.val<p.val) return lowestCommonAncestor(root.right, p, q);
           else return lowestCommonAncestor(root.left, p, q);
       }
   }
    public static void main(String[] args) {

    }
}
