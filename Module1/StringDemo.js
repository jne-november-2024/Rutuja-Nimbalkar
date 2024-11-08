let str="javaScript";

console.log(str.at(-1));
console.log(str.indexOf('a'));
console.log(str.concat(' Welcome',' !!!!'));


let result=str.match(/o/g);
console.log(result);

console.log(str.slice(-6,-2));

console.log(str.substring(2, 5));  //start n end idx
console.log(str.substr(3,6));  // start n length

console.log(str.charAt(-1));
console.log(str.charAt(2));