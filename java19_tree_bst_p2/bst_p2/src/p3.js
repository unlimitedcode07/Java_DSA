// Lowest Common Ancestor of a Binary Tree
// vimp q



/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {TreeNode}
 */


function dfs(root,p,q){
    if(root == p || root == q) return true;
    if(root == null) return false;
    return dfs(root.left,p,q) || dfs(root.right,p,q);
}

function preprder(root,p,q){
  if(root == p || root == q){
    return root;
  }else{
    let a = dfs(root.left,p,q);
    let b = dfs(root.right,p,q);
    if(a && b) return root;
    if(a || b){
        if(a) return preprder(root.left,p,q);
        if(b) return preprder(root.right,p,q);
    }
  }

}

var lowestCommonAncestor = function(root, p, q) {
    return preprder(root ,p, q);
};