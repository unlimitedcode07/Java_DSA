
//XOR of a Number Range
// reference from p28-29

/**
 * @param {number} l
 * @param {number} r
 * @returns {number}
 */

function kp(n){
    let a = n%4;
    if(a == 1) return 1;
    if(a == 2) return n+1;
    if(a == 3) return 0;
    else return n;
}
class Solution {
    findXOR(l, r) {
        // code here
        return kp(l-1)^kp(r);
    }
}