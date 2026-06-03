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
 * @return {TreeNode}
 */
 function dfs(temp){
    if(temp == null  ) return ;
    let op = temp.left;
    temp.left = temp.right;
    temp.right = op;
    dfs(temp.left);
    dfs(temp.right);
 }
var invertTree = function(root) {
    let temp = root;
    dfs(temp);
    return root;
};


