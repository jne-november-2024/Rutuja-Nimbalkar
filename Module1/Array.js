let arr=new Array();

arr=[1,2,3,'A'];

console.log(arr);

let arr1=new Array(10);
let arr2=new Array(1,2,3,4,5);
let arr3=new Array('a');

console.log(arr1);
console.log(arr2);
console.log(arr3);

let emArr=[];
console.log(emArr);
emArr[0]='a';
console.log(emArr[0]);
emArr[0]='b';
console.log(emArr);

console.log(arr2.length);


arr3.push('B');

arr3.unshift('b');


arr3.push('BB');

arr3.unshift('bb');
console.log(arr3);
console.log('------------');
arr3.pop();
arr3.shift();
console.log(arr3);


let index = arr3.indexOf('a');

console.log(index); 

console.log(Array.isArray(arr3));

let output=arr2.map((n)=>n*10);

console.log('------------');
console.log(output);


console.log( typeof arr);
console.log( typeof arr1);