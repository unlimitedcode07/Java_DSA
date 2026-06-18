
// => imp q
// Delete Node in a BST


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
 * @param {number} key
 * @return {TreeNode}
 */
var deleteNode = function(root, key) {
    if(root == null) return null;
    if(root.val > key){
        root.left = deleteNode(root.left,key);
    }else if(root.val < key){
        root.right = deleteNode(root.right, key);
    }else{
        if(root.left == null && root.right == null) return null;
        if(root.left ==null){
            return root.right;
        }
        if(root.right == null){
            return root.left;
        }
            let pred = root.left;
            while(pred.right != null) pred = pred.right;
             root.left = deleteNode(root.left, pred.val);
             pred.left = root.left;
             pred.right = root.right;
             return pred;
    }
    return root;

};