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
 * @param {number} val
 * @return {TreeNode}
 */


//  Insert into a Binary Search Tree

function ans(root,val){
  if(root.val>val) {
     if(root.left == null){
        let temp = new TreeNode(val);
        root.left = temp
        return;
     }
   ans(root.left,val);
  }
  if(root.val<val){
    if(root.right == null){
        let temp = new TreeNode(val);
        root.right = temp
        return;
     }
  ans(root.right,val);
  }
}
var insertIntoBST = function(root, val) {
    let temp = new TreeNode(val);
    if(root == null) return temp;
    ans(root,val);
    return root;
};