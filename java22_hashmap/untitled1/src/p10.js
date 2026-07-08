//  Pairs with difference k



 * @param {number[]} arr
 * @param {number} k
 * @return {number}
 */

class Solution {
    countPairs(arr, k) {
        // code here
          let obj = {

        }

        for(let i = 0; i<arr.length; i++){
            if(obj[arr[i]] == undefined){
               obj[arr[i]] = 1;
            }else{
                obj[arr[i]] = obj[arr[i]] +1;
            }
        }

        let count = 0;
        for(let i = 0; i<arr.length; i++){
           let a = arr[i] + k;
           let b = arr[i] -k;
           obj[arr[i]] = obj[arr[i]] -1;
           if(obj[arr[i]] == 0) delete obj[arr[i]];

           let x = 0;
           let y = 0;
           if(obj[a]){
              x = obj[a];
           }
           if(obj[b]){
             y = obj[b];
           }

            count = count + x + y;
        }

        return count;

    }
}