//Single Number III

/**
 * @param {number[]} nums
 * @return {number[]}
 */
 // my solution

var singleNumber = function(nums) {
    if(nums.length == 2) return nums;
    let xor = nums.reduce((add,el)=>add^el);
    let digit = Math.log2(xor & -xor)
    console.log(digit);
    let a = [];
    let b = [];
    for(let i = 0; i<nums.length; i++){
        let x = nums[i]>>digit;
        if((x&1)==1){
            a.push(nums[i]);
        }else{
            b.push(nums[i]);
        }
    }
  a = a.reduce((x, y) => x ^ y, 0);
  b = b.reduce((x, y) => x ^ y, 0);
    return [a,b]
};

/// beter chat gpt solution
var singleNumber = function(nums) {
    let xor = nums.reduce((x, y) => x ^ y, 0);

    let mask = xor & -xor;

    let a = 0, b = 0;

    for (let num of nums) {
        if (num & mask)
            a ^= num;
        else
            b ^= num;
    }

    return [a, b];
};