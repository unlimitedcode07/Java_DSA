

// Maximum Sum BST in Binary Tree

// this solution is not optrimised but good for understanding


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
 * @return {number}
 */
function pair(node,inorder,sum){
 this.node = node;
 this.inorder = inorder;
 this.sum = sum;
}


function travel(root,nums){
  if(root == null) return ;
  travel(root.left,nums);
  nums.push(root.val);
  travel(root.right,nums);
}

function travel2(root,arr){
  if(root == null) return true;
   let a = travel2(root.left,arr);
   let b = travel2(root.right,arr);

   if(a && b){
   let nums = [];
    travel(root,nums);
   let sum = nums[0];
  let isBts = true;
  for(let i = 1; i<nums.length;i++){
     sum = sum +nums[i];
     if(nums[i-1]>=nums[i]) isBts = false;
  }
  if(isBts){
    arr.push(new pair(root,nums,sum)) ;
    return true;
  }else return false;
 }
 else return false;
}

var maxSumBST = function(root) {
  let arr = [];
  travel2(root,arr);
  console.log(arr);
  let op;
  let sum = arr[0].sum;
  for(let i = 0; i<arr.length; i++){
    if(sum<arr[i].sum) {
        sum = arr[i].sum;
    }
  }
  if(sum<0) sum = 0;
 return sum;
};