


//Reverse Bits{ leetcode }
/**
 * @param {number} n
 * @return {number}
 */
var reverseBits = function(n) {
    let ans = 0;
    let i = 32
    while(i--){
       ans = ans <<1;
       if((n & 1) == 1) ans = ans | 1;
       n = n>>1;
    }
    return ans;
};

//Reverse Bits {gfg}
/**
 * @param {number} N
 * @return {number}
 */

class Solution {
    reverseBits(n) {
        // code here
    let ans = 0;
    while(n){
       ans = ans <<1;
       if((n & 1) == 1) ans = ans | 1;
       n = n>>1;
    }
    return ans;
    }
}