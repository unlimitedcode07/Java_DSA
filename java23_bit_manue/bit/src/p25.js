Subsets
//=> using bit

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
function bi(s,arr,nums){
  if(s.length >= nums.length){
    let temp = [];
    for(let i = 0; i<nums.length; i++){
       if(s[i] == "1"){
        temp.push(nums[i])
       }
    }
    arr.push(temp);
    return;
  }
  bi(s+"0",arr,nums);
  bi(s+"1",arr,nums);
}
var subsets = function(nums) {
    let s = "";
    let arr = []
    bi("",arr,nums);



/////////////////////////////////////////////////////////////////////////////////////
//even more fast
  /**
   * @param {number[]} nums
   * @return {number[][]}
   */


  var subsets = function(nums) {
      let arr = []
      let limit = (1<<(nums.length));
      for(let n = 0; n<limit; n++){
         let p = n;
         let temp = []
         while (n) {
            temp.push(nums[Math.log2(n & -n)])
            n =n & (n - 1);
          }
          arr.push(temp)
          n = p;
      }

      return arr;
  };