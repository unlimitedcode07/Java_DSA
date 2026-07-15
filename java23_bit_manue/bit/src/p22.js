Power of 2 hai ki nahi



class Solution {  // aproach
    isPowerofTwo(n) {
        if(n == 0) return false;
      return  ( (Math.log2(n & -n) +1) == Math.log2(n)+1)
     //              /\                      /\
     //              ||                      ||
     //           my logic                that we use to calculat tree level in perfect bst
    }
}


// bokesh way
class Solution {
    isPowerofTwo(n) {
        // code here
        if(n == 0) return false;
      return  ((n & (n-1)) == 0)
    }
    // resons is the number n has 1 set bit and n-1 has
    //set bit except that position that has occopy by n eg in p23
}