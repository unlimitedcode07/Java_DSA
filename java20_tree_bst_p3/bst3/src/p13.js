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
   static class pair{
    int max;
    int min;
    int sum;
    int size;
    boolean isBst;
    pair(int max,int min,int sum,int size,boolean isBst){
    this.max = max;
    this.min = min;
    this.sum = sum;
    this.size = size;
    this.isBst = isBst;
  }
  void display(){
    System.out.print(this.max+" "+this.min+" "+this.sum+" "+this.size+" "+this.isBst);
  }
}
   static int ans = 0;
    static pair MaxMinSumSizeIsBst(TreeNode root){
      if(root == null) return new pair(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0,true);

      System.out.print(root.val+" ");
      if(root.left == null && root.right == null){
         ans = Math.max(ans, root.val);
         return new pair(root.val,root.val,root.val,1,true);
      }
      pair lst = MaxMinSumSizeIsBst(root.left);
      pair rst = MaxMinSumSizeIsBst(root.right);
      boolean isBst = true;
      if(lst.isBst == true && rst.isBst == true){
        int lft = Integer.MIN_VALUE;
        int rit = Integer.MAX_VALUE;
        if(root.left != null){
         lft = root.left.val;
        }
        if(root.right != null){
         rit  =root.right.val;
        }
         if(root.val <= lft || root.val >= rit || root.val >= rst.min ||root.val <= lst.max){
          if(lst.sum>= rst.sum){
            lst.isBst = false;
           return lst;
          }else{
            rst.isBst = false;
           return rst;
          }
         }else{
             int min = Math.min(root.val,Math.min(lst.min,rst.min));
             int max = Math.max(root.val,Math.max(lst.max,rst.max));
             int size = 1+lst.size+rst.size;
             int sum = root.val + lst.sum + rst.sum;
             if(ans<sum) ans = sum;
             return new pair(max,min,sum,size,isBst);
         }
      }else{
         if(lst.sum>= rst.sum){
             lst.isBst = false;
           return lst;
          }else{
            rst.isBst = false;
           return rst;
          }
      }
    }

    public int maxSumBST(TreeNode root){
       ans = 0;
       pair op =  MaxMinSumSizeIsBst(root);
       System.out.println(" ");
       op.display();
       return ans;
    }
}