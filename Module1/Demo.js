function a(){
    var name1='A';
}

//console.log(name1);

function a1(){
    let name2='A';
}

//console.log(name2);

if (true) {
    var x = 10;
    let y = 20;
  }
  
  console.log(x); 
  //console.log(y);
  

  var xa= 10;
  let b=100;
if (true) {
    var xa = 20; 
    let b=90;
}
console.log(xa);//20 overwrite 
console.log(b);


let person=[

    {firstName:'A',
        lastName:'B',
        age:30,
        email:'AA'
    },

    {firstName:'AA',
        lastName:'BB',
        age:33,
        
    },

    {firstName:'AAA',
        lastName:'BBB',
        age:35,
       
    },
    
    {firstName:'AAAA',
        lastName:'BBBB',
        age:28,
        
    }   


]

let result=person.filter((value)=>{return value.age>30});

console.log(result);

//let mapResult=person.map(value=>value.email='Mail');

let mapResult1=person.map((value)=>{

    return {
    ...value,
      email:'Email...'

    }
}
)


console.log(mapResult1);


console.log('----------------------');
let num=[10,20,30,5,3,2,1];

let re=num.filter(value=>value%2===0);
console.log(re);
console.log("=====");
console.log(num);
num.forEach(
    (value,idx,arr)=>{
        arr[idx]=value*2;
    }
)

console.log(num);

let letters=['A','B','C'];

let caps=letters.map(value=>value.toLowerCase())
// 
letters.map(
value=>{
    return value.toLowerCase();
}
);
console.log(caps);


//Reduce() ac=0 init

let sum1=num.reduce((ac,value)=>{
    return ac+value;
},0)


let sum2=num.reduce((ac,currentvalue)=>{
return ac+currentvalue;
})

console.log(sum1);
console.log(sum2);
