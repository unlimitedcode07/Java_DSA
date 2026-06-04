/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} low
 * @param {number} high
 * @return {number}
 */

 // Range Sum of BST

function ans(root, low, high,arr){
  if(root == null) return ;
  if(root.val >=low && root.val <=high){
    arr.push(root.val);
  }
   if(root.val >=low){
     ans(root.left, low, high,arr)
   }
    if(root.val <=high){
    ans(root.right, low, high,arr)
   }
}

var rangeSumBST = function(root, low, high) {
    let arr = [0];
    if(root.left == null && root.right == null) {
      if(root.val >=low && root.val <=high) arr.push(root.val);
    }
    else ans(root, low, high,arr)
    return 0+ arr.reduce((add,el)=>add+el);
};