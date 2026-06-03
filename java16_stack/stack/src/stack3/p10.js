/**
 * @param {number[]} heights
 * @return {number}
 */
var largestRectangleArea = function(heights) {
    let n = heights.length;
    let arrL =Array(n).fill(-1);
    let arrR =Array(n).fill(-1);

    let stack = [];
    let idx = [];
    arrR[n-1] = n;
    stack.push(heights[n-1])
    idx.push(n-1);
    for(let i = n-2; i>=0; i--){
      while(stack.length>0 && stack[stack.length-1]>=heights[i]){
        stack.pop();
        idx.pop();
      }
      if(stack.length == 0){
        arrR[i] = n;
      }else{
        arrR[i] = idx[idx.length-1];
      }
      stack.push(heights[i]);
        idx.push(i);
    }

    stack = [];
    idx = [];
    arrL[0] = -1;
    idx.push(0);
    stack.push(heights[0]);

    for(let i = 1; i<n; i++){
      while(stack.length>0 && stack[stack.length-1]>=heights[i]){
        stack.pop();
        idx.pop();
      }
      if(stack.length == 0){
        arrL[i] = -1;
      }else{
        arrL[i] = idx[idx.length-1];
      }
      stack.push(heights[i]);
        idx.push(i);
    }
    let max = 0;
    for(let i = 0; i<n; i++){
        let add = (arrR[i]-arrL[i]-1)*heights[i];
        if(max<add){
            max = add;
        }
    }
    return max;

};

console.log(largestRectangleArea([2,1,5,6,2,3]));
// 10


//
//84. Largest Rectangle in Histogram
//Solved
//Hard
//Topics
//premium lock icon
//Companies
//Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
//
//
//
//Example 1:
//
//
//Input: heights = [2,1,5,6,2,3]
//Output: 10
//Explanation: The above is a histogram where width of each bar is 1.
//The largest rectangle is shown in the red area, which has an area = 10 units.
//Example 2:
//
//
//Input: heights = [2,4]
//Output: 4
//
//
//Constraints:
//
//1 <= heights.length <= 105
//0 <= heights[i] <= 104