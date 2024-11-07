(
    function(){
        console.log('1');
    }
); // not invoke

var a=function(){
    console.log('2');
}

a();

(
    function(){
        console.log('3');
    }
) () ;// Immediately invoke


console.log('End');

function sum(x,y){
    return x+y;
}
console.log(sum(1,2));

let s=function sum(x,y){
    return x+y;
}

console.log(s(2,4));

let person={

firstName:'A',
lastName:'B'

};


(
    function(person){
        console.log(person.firstName+" "+person.lastName);
    }

)(person);



let anonumousVar=function(){
    console.log('A');
}

//Arrow
let arrowA=()=>{
    console.log('Arrow function');
}
anonumousVar();
arrowA();