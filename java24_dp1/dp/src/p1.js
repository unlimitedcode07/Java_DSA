/**
 /// dp lesion 1 store in arr idx so that we can save rest of compurtation

 * @param {number} n
 * @returns {number}
 */

class Solution {
    op(n,arr){
        if(n<=1) return n;
        if(arr[n]!= undefined) return arr[n];
        let kp = this.nthFibonacci(n-1) +this.nthFibonacci(n-2) ;
        arr[n] = kp;
        return kp;
    }
    nthFibonacci(n) {
       let arr = new Array(n+1);
       return this.op(n,arr)
    }
}