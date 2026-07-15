Check K-th Bit
/**
 * @param {Number} n
 * @param {Number} k
 * @returns {boolean}
 */
class Solution {
    checkKthBit(n, k) {
        // code here
        n = n>>k
        if(n%2 == 0) return false;
        else return true;
    }
}

///////////////////
//hint this in p13
// we can do right shift >> so thst some bit remove