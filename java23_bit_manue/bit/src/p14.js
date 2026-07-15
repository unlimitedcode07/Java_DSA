Set kth bit


/**
 * @param {number} n
 * @param {number} k
 * @returns {number}
 */

function getBinary(n){
    let s = ""
    while(n !=1){
        s  = n%2+s;
        n = Math.floor(n/2);
    }
    s = "1" + s;
    return s;
}

function getDecimal(s){
    let count = 0;
    let i = s.length-1;
    let j = 0
    while(i>=0){
     count = count + Number(s[i])*2**j;
     j++;
     i--;
    }
    return count
}

class Solution {

    setKthBit(n, k) {
        let op = getBinary(n)
        let num = op.length-(k+1);
        op = op.slice(0,num)+"1"+op.slice(num+1);
        return getDecimal(op);
    }
}

////////////////////////////////////////////////////////////////////
or
//this is using bit mask
class Solution {
    static int setKthBit(int n, int k) {
        // code here
        return (n | 1<<k);   // this is using bit mask
    }
}