/**
 * @param {number[]} nums
 * @return {number}
 */

//198. House Robber



/**
 * @param {number[]} nums
 * @return {number}
 */

function tryall(arr,total,nums,i){
  if(i >=nums.length){
    arr.push(total);
    return ;
  }
  tryall(arr,total+nums[i],nums,i+2)
  tryall(arr,total,nums,i+1)
}

var rob = function(nums) {
    let arr = [];
    tryall(arr,0,nums,0);
    console.log(arr)
    return arr.reduce((mx,el)=>{
        if(el>mx)return el
        else return mx;
    });
};

/////////////////////////this is logicaly corect but tle so below is using dp fast


function tryall(arr,nums,i){
  if(i >=nums.length){
    return 0;
  }
  if(arr[i] != undefined) return arr[i];
  let a = nums[i] +tryall(arr,nums,i+2)
  let b = tryall(arr,nums,i+1)
  let ans = Math.max(a,b)
  arr[i] = ans
  return ans;
}

var rob = function(nums) {
    let arr = new Array(nums.length);
    let a = tryall(arr,nums,0);
    console.log(arr)
    return a

};