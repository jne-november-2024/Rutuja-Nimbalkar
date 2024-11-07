let a=1;
// let a; redeclaration not


for (var j = 0; j < 5; j++) {
	console.log("Inside ", j);
}

console.log("Outside ", j);

console.log('-----------------'+ '=');
for(let k=0; k<5;k++){
    console.log("Inside ", k);

}
//console.log("Inside ", k);

for(let i=0;i<5;i++){
    setTimeout(function(){
        console.log(i);
    },5000);
}


const RATE = 0.1;
// RATE = 0.2;

const p={

age:10

}

p.age=20;

console.log(p);

/* p={
    a:9
}
    */

// default parameter

function say(msg='hii'){

    console.log(msg);
}
say();
say("Hello");

//rest
console.log("-----------Rest------------");
function sum(... args){
let total=0;
 
for(let i=0;i<args.length;i++){
    total+=args[i];


}
console.log(total);


}


sum(1,3);
sum(1,2,3,3,4,5);



//Spread
console.log("-----------Spread------------");
let a1=[1,2,3];
let a2=[...a1,5,6];
let a3=[11,22,33,44];

console.log(a2);

a3.push(...a1);
console.log(a3);

//for...of

for(let items of a1){
    console.log(items);
}