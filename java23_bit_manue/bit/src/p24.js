 //Minimum Bit Flips to Convert Number

//use ^ to make a number so that
//same same like 0 0 , 1 1 , get 0 and different one 1 0 , 0 1 get 1 and then count one
//

 /**
  * @param {number} start
  * @param {number} goal
  * @return {number}
  */
 var minBitFlips = function(start, goal) {
   let a = start ^ goal;
   let count = 0;
   while(a != 0){
     a = a & (a - 1);
     count++;
   }
   return count ;
 };