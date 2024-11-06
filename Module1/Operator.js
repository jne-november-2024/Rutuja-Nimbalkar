console.log(true > 0);  

console.log(false < 1); 
console.log(true > false); 
console.log(false > true);

// NaN :false
console.log(NaN ==NaN);


// == ===
console.log("10" == 10); 
console.log("10" === 10); 

//logical && || !

let result=true;
console.log(' not op:'+!result);

console.log(undefined);
console.log(!undefined);

console.log('double !! ' +!!undefined);

//&& T-T =T other f 
let a=true;

console.log(a &&(1/0));

console.log(undefined && 1 && true);

console.log(12 && 1 && true);

console.log(12 || 1 || true);

console.log(0 || 90 || true);


let Person={

firstName:'John',
lastName:'Doe'

}
Person.firstName &&='Smith';
console.log(Person);


let res = 1 ?? console.log('Hi');


let res1 = null ?? console.log('Hi');

console.log(res1);

