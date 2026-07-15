//this is when you want to find the first set bit

Math.log(n & -n) +1;

//if its n = 13  => 1101 then ans is 1
//                     /\
//                     ||
//       n = 12      1100 then ans is 3
//                    /\
//                    ||

------------------------------------------------------------------------------------------------------------

//and if we want to set first 0 from right to set 1 then

 n|n+1
//
//if its n = 12 then => 1100
//       n = 13 then => 1101
//                or => 1101;
//                ans => 13