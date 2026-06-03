// 102. Binary Tree Level Order Traversal

search this in leetcode


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
 * @return {number[][]}
 */

function pair(node,lvl){
 this.node = node;
 this.lvl = lvl;
}

var levelOrder = function(root) {
    if(root == null) return [];
    let arr = [];
    arr.push(new pair(root,0));
    let i = 0;
    let j = 0;
    let ans = [];
    let brk = [];
    while(j<arr.length){
        let op = arr[j++];
        if(i<op.lvl){
          ans.push(brk);
          brk = [];
          i++;
        }
        brk.push(op.node.val);
        if(op.node.left!=null) arr.push(new pair(op.node.left,op.lvl+1));
        if(op.node.right!=null) arr.push(new pair(op.node.right,op.lvl+1));
    }
    ans.push(brk);
    return ans;
};


