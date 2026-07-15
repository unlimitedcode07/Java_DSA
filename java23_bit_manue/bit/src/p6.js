// swap 2 num

let a = 3;
let b = 8;

a = a^b;
b = a^b; // (a^b)^b => a^b^b => a^0 => a
a = a^b; //(a^b)^a => a^b^a => b
console.log(a," ",b)  // 8 3


// find first non repeting
let str = "aabccdd";
str = str.split("").map((el)=> el.charCodeAt(0)).reduce((ans,el)=> ans^el)
console.log(String.fromCharCode(str)); //b