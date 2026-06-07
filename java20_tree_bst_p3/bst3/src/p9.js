/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */

 function ans(temp,nums){
    if(nums.length == 0) return;
   let mid = Math.floor(nums.length/2);
   let op = new TreeNode(nums[mid]);
   if(temp.val >op.val) temp.left = op;
   else temp.right = op;
   let count_l = mid;
   let count_r = nums.length-mid
   let arr1 = nums.slice(0,count_l);
   let arr2 = nums.slice(mid+1)
   ans(op,arr1);
   ans(op,arr2);
 }
var sortedArrayToBST = function(nums) {
    let temp = new TreeNode(-1);
    ans(temp,nums);
    if(temp.right!=null) return temp.right;
    else return temp.left;
};