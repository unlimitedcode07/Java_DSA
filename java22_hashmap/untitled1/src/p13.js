// // => Amount of Time for Binary Tree to Be Infected
 //same solution with

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} start
 * @return {number}
 */
let kp;
function dfs(root,start,obj){
  if(root == null) return ;
  if(root.val == start){
    kp = root;
  }
  if(root.left !=null){
    obj[root.left.val] = root;
  }

  if(root.right !=null){
    obj[root.right.val] = root;
  }
  dfs(root.left,start,obj);
  dfs(root.right,start,obj);
}

function cl(nd,lvl){
    this.nd = nd;
    this.lvl = lvl;
}

var amountOfTime = function(root, start) {
    let obj = {};
    dfs(root,start,obj)
    let set = new Set();
    let arr = [];
    arr.push(new cl(kp,0))
    set.add(kp.val);
    let i = 0;
    while(arr.length>i){
      if(arr[i].nd == undefined) break;
      let temp = arr[i].nd;
      let lvl = arr[i].lvl;

      if(temp.left != null){
        if(set.has(temp.left.val) == false){
            set.add(temp.left.val);
            arr.push(new cl(temp.left,lvl+1));
        }
      }

      if(temp.right != null){
         if(set.has(temp.right.val)== false){
            set.add(temp.right.val);
            arr.push(new cl(temp.right,lvl+1));
        }
      }

    let parent = obj[temp.val];

   if (parent != undefined && !set.has(parent.val)) {
    set.add(parent.val);
    arr.push(new cl(parent, lvl + 1));
    }
      i++;
    }
    return arr[arr.length-1].lvl;

};