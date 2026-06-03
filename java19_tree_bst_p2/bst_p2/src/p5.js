
//Paths from root with a specified sum gfg practic

/* A Tree node
function Node(key) {
    this.key = key;
    this.left = null;
    this.right = null;
}*/


function op(root, targetSum,domey,i,arr){
  if(root == null){
    return;
  }
  i = i +root.key

  domey.push(root.key);
  if(targetSum == i){
   arr.push([...domey]);
  }
  op(root.left, targetSum,domey,i,arr)
  op(root.right, targetSum,domey,i,arr)
  domey.pop();
}



class Solution {

printPaths(root, targetSum) {
 let domey = [];
 let arr = [];
 let i = 0;
 op(root, targetSum,domey,i,arr);
 return arr;
    }
}