/**
 * @param {character[][]} matrix
 * @return {number}
 */
var maximalRectangle = function(matrix) {
    for(let i = 0; i<matrix[0].length; i++){
        let count = 0;
      for(let j = 0; j<matrix.length; j++){
        let val = Number(matrix[j][i]);
        if(val == 0)  matrix[j][i] = val;
        else{
           matrix[j][i] = count + val;
        }
        count = Number(matrix[j][i]);
     }
    }
    let max = 0;
   for(let i = 0; i<matrix.length; i++){
     let op  = largestRectangleArea(matrix[i]);
     if(max<op){
        max = op;
     }
   }
   return max;
};

// we use p10 to calculat
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

//
//85. Maximal Rectangle
//Solved
//Hard
//Topics
//premium lock icon
//Companies
//Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
//
//
//
//Example 1:
//
//
//Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
//Output: 6
//Explanation: The maximal rectangle is shown in the above picture.
//Example 2:
//
//Input: matrix = [["0"]]
//Output: 0
//Example 3:
//
//Input: matrix = [["1"]]
//Output: 1
//
//
//Constraints:
//
//rows == matrix.length
//cols == matrix[i].length
//1 <= rows, cols <= 200
//matrix[i][j] is '0' or '1'.
//
//
//

