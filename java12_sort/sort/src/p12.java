//493. Reverse Pairs
//Hard
//        Topics
//premium lock icon
//        Companies
//Hint
//Given an integer array nums, return the number of reverse pairs in the array.
//
//A reverse pair is a pair (i, j) where:
//
//        0 <= i < j < nums.length and
//nums[i] > 2 * nums[j].
//
//
//Example 1:
//
//Input: nums = [1,3,2,3,1]
//Output: 2
//Explanation: The reverse pairs are:
//        (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
//        (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
//Example 2:
//
//Input: nums = [2,4,3,5,1]
//Output: 3
//Explanation: The reverse pairs are:
//        (1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
//        (2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
//        (3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
//
//
//Constraints:
//
//        1 <= nums.length <= 5 * 104
//        -231 <= nums[i] <= 231 - 1

//this is in js


/**
 * @param {number[]} nums
 * @return {number}
 */
//
//var reversePairs = function(nums) {
//let op = rec(nums);
//    return op;
//};
//
//function rec(nums){
//    if(nums.length <= 1) return 0;
//    let arr1 = [];
//    let arr2 = [];
//
//    let idx = 0;
//    for(let i = 0; i<Math.floor(nums.length/2); i++) arr1[i] = nums[idx++];
//    for(let i = 0; i<(nums.length-Math.floor(nums.length/2)); i++) arr2[i] = nums[idx++];
//
//    let count =  rec(arr1)+rec(arr2);
//    mergsort(arr1,arr2,nums);
//    console.log(arr1,arr2,nums)
//    count = count + count_cal(arr1,arr2)
//    return count;
//}
//
//function count_cal(arr1,arr2){
//    let i = 0; let j = 0;  let count = 0;
//    while(i<arr1.length && j <arr2.length){
//        if(arr1[i]>arr2[j]*2){
//            count = count + (arr1.length-i);
//            j++;
//        }else{
//            i++;
//        }
//    }
//    return count;
//}
//
//function mergsort(arr1,arr2,arr){
//
//    let i = 0; let j = 0; let k = 0;
//    while(i<arr1.length && j<arr2.length){
//        if(arr1[i]<=arr2[j]) arr[k++] = arr1[i++];
//        else arr[k++] = arr2[j++];
//    }
//    while(i<arr1.length) arr[k++] = arr1[i++];
//    while(j<arr2.length) arr[k++] = arr2[j++];
//    return arr;
//}
//
//console.log(reversePairs([2,4,3,5,1]))
//

