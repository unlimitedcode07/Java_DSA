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
 * @return {boolean}
 */
 // another good solution using past 2 q is p15;
function solve(left, right) {
    if (left == null && right == null) return true;

    if (left == null || right == null) return false;

    if (left.val !== right.val) return false;

    return solve(left.left, right.right) &&
           solve(left.right, right.left);
}

var isSymmetric = function(root) {
    return solve(root.left, root.right);
};

