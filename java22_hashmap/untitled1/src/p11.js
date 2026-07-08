/**
 * @param {Node} root
 * @returns {number[]}
 */

/*
class Node {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/
/////=> Top View of Binary Tree

function Nd(tn,lvl,not){
    this.tn = tn ;
    this.lvl = lvl;
    this.not = not;
}  // level order solution
class Solution {
    topView(root) {
        let arr = []
        arr.push(new Nd(root,0,0));
        let i = 0;
        let obj = {};
        while(i<arr.length){
          let r = arr[i].tn
         if(obj[arr[i].not] == undefined ) obj[arr[i].not] = r.data;
          if(arr[i].tn.left != null)  arr.push(new Nd(arr[i].tn.left,arr[i].lvl+1,arr[i].not -1));
          if(arr[i].tn.right != null)  arr.push(new Nd(arr[i].tn.right,arr[i].lvl+1,arr[i].not +1));
          i++
        }
        return Object.keys(obj).sort((a,b)=>Number(a) - Number(b)).map((el)=>obj[el]);
    }
}