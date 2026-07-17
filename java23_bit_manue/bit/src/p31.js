//  Score After Flipping Matrix

/**
 * @param {number[][]} grid
 * @return {number}
 */

function deci(arr,grid,p,f){
  let n = arr.length-1
  let count = 0;
  for(let i = 0; i<arr.length; i++){
   count = count + arr[i]*(1<<n)
    n--
  }
  if(f == true){
    return count;
  }else{
    let alter = count^((1<<arr.length)-1)
  if(alter>count){
    grid[p] = grid[p].map((el)=>{
        if(el == 1) return 0;
        else return 1;
    })
    return alter;
  }else {
    return count;
  }
  }
}

var matrixScore = function(grid) {
   let g1 = [];
   for(let i = 0; i<grid.length; i++){
    g1.push(deci(grid[i],grid,i,false))
   }
   console.log(g1)
   console.log(grid)
   let g2 = [];
   for(let i = 0; i<grid[0].length; i++){
    let j = 0;
    let temp = []
    let onc = 0;
    let limit = grid.length;
    while(j<grid.length){
        let a = grid[j][i];
        if(a == 1) onc++
        temp.push(a);
        j++;
    }
    let mid = Math.ceil(grid.length/2);
    if(mid<=onc){
       g2.push(temp)
    }else{
        temp = temp.map((el)=>{
            if(el == 1) return 0;
            else return 1;
        })
        g2.push(temp)
    }

   }

   let kp = [];

   for(let i = 0; i<g2[0].length; i++){
    let lp = []
     let t = 0;
      while(t<g2.length){
          lp.push(g2[t][i])
          t++;
      }
      kp.push(lp)
   }
   let ans = kp.map((el)=> deci(el,grid,0,true)).reduce((add,el)=>add+el)
   return ans;
};