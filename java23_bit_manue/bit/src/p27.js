/**
 * @param {number} n
 * @return {boolean}
 */

// this is power of 4


//thinking (total bit digit == set didit position ) & num must be in odd lvl  tree 1 ,7,31  cause we get val there 1 , 8,32 etc
var isPowerOfFour = function(n) {
    if(n == 1) return true;
    if(n<1) return false;
    else return Math.floor(Math.log2(n)) == Math.log2(n & -n) && (Math.floor(Math.log2(n))+1)%2 !=0
};//                                                                    /\ it must be odd