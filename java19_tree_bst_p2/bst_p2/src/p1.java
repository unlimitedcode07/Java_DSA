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

//=> Diameter of Binary Tree

class Solution {
    int getMax(TreeNode a){
        if(a==null){
            return 0;
        }
        return 1+Math.max(getMax(a.left),getMax(a.right));
    }


    int getRootmax(TreeNode root){
        if(root == null) return 0;
        int a ;
        int b ;
        if(root.left !=null){
            a = getMax(root.left);
        } else{
            a = 0;
        }

        if(root.right !=null){
            b = getMax(root.right);
        } else{
            b = 0;
        }
        return a+b;
    }

    int getans(TreeNode root){
        if(root == null ) return 0;
        int left = getans(root.left);
        int right = getans(root.right);
        int current = getRootmax(root);

        return Math.max(current, Math.max(left,right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null ) return 0;
        if(root.left == null && root.right == null)return 0;
        return getans(root);

    }
}