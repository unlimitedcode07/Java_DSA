import java.util.Arrays;
//Construct Binary Tree from Preorder and Inorder Traversal

public class p7 {
   static class Solution {
        void ans(int[] preorder, int[] inorder,TreeNode op){
            if(preorder.length == 1) return;
            int p = 0;
            // int st = 0;
            int l = inorder.length;
            while(inorder[p++]!=op.val);
            int inorder_left_count = p-1;
            int inorder_right_count = l-p;

            // int inorder_left_st = 0;
            // int inorder_left_end = inorder_left_count-1;

            // int inorder_right_st = p;
            // int inorder_right_end = l-1;

            if(inorder_left_count != 0){
                int[] arr1 = Arrays.copyOfRange(preorder, 1, inorder_left_count+1);
                TreeNode temp = new TreeNode(arr1[0]);
                op.left = temp;
                ans(arr1,Arrays.copyOfRange(inorder, 0, inorder_left_count),temp);
            }
            if(inorder_right_count != 0){
                int[] arr2 = Arrays.copyOfRange(preorder,p,l);
                TreeNode temp = new TreeNode(arr2[0]);
                op.right = temp;
                ans(arr2, Arrays.copyOfRange(inorder,p,l),temp);
            }
        }


        public TreeNode buildTree(int[] preorder, int[] inorder) {
            if(preorder.length == 0) return null;
            TreeNode temp = new TreeNode(preorder[0]);
            if(preorder.length == 1) return temp;
            TreeNode op = temp;
            ans(preorder,inorder,op);
            return temp;
        }
    }
    public static void main(String[] args) {
        // this si imp q
    }
}
