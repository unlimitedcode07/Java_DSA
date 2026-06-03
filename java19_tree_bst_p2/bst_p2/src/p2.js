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
 * @return {number[]}
 */


// 199. Binary Tree Right Side View


function pair(node,lvl){
    this.node = node;
    this.lvl = lvl;
}

function get(root){
  let arr = [];
  let arr2 = [];
  let domy = [];
  arr.push(new pair(root,0));
  let i = 0;
  let l = 0;
  while(i<arr.length){
    if(arr[i].lvl >l){
       arr2.push(domy);
       domy = [];
       l++;
    }
    domy.push(arr[i].node.val)
    if(arr[i].node.left!=null) arr.push(new pair(arr[i].node.left,arr[i].lvl+1));
    if(arr[i].node.right!=null) arr.push(new pair(arr[i].node.right,arr[i].lvl+1));
    i++;
  }
  arr2.push(domy);
  return arr2;
}

var rightSideView = function(root) {
    if(root == null) return [];
   let op = get(root).map((el)=>el[el.length-1]);
    return op;
};