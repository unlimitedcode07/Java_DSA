//Min Cost Climbing Stairs

/**
 * @param {number[]} cost
 * @return {number}
 */
function see(arr,i,cost){
 if(i>=cost.length){
    return 0;
 }
 if(arr[i] != undefined) return arr[i];
 let a = cost[i] + see(arr,i+1,cost);
 let b = cost[i] + see(arr,i+2,cost);
 let ans = Math.min(a,b);
 arr[i] = ans;
 return ans;
}
var minCostClimbingStairs = function(cost) {
   let arr = new Array(cost.length)
   see(arr,0,cost)
   return Math.min(arr[0],arr[1]);
};