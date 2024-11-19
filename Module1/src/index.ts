// console.log('Welcome to TypeScript');

// let age: number=20;
// //age='a';
// age=30;


let a=102_222_098;
let cousre='TS';
let level;

function render(doc:any){
console.log(doc);

}

let arr:number[]=[];
arr[0]=10;

// let arr1:number[]=[10,20,'30'];
let arr1=[10,20,30];


let user:[number,string]=[1,'Rutuja']

//let user1:[number,string]=[1,'Rutuja',90] error

// const small=1;
// const medium=2;
// const large=3;
//no need to const
//by default 0 
enum Size {Small=1,Medium,Large};

//string explicitly set value to each
const enum Size1 {Small='s',Medium='m',Large='l'};

let mySize:Size=Size.Small;
console.log(mySize);


// function calculateTax(income:number): void{

// }

function calculateTax3(income:number): number{

    if(income<50_000)
        return income*1.2;
    return income*1.3;
   
}

calculateTax3(10_000);//fix


function calculateTax1(income:number,target:number): number{

    if(income<50_000 && target<2022)
        return income*1.2;
    return income*1.3;
   
}

//calculateTax1(10_000);//error

function calculateTax(income:number): number{

    if(income<50_000)
        return income*1.2;
    return income*1.3;
   
}


function calculateTax2(income:number,target=2022): number{

    if(income<50_000 && target<2022)
        return income*1.2;
    return income*1.3;
   
}
calculateTax2(10_000);

// let emp={
//     id:1
// }
// emp.name:'A';

let emp:{
   readonly id:number,
    name:string
}={id:1,name:''} // name='A'
emp.name='A';
//we can modify so use readonly
//emp.id=0;


let emp1:{
    id:number,
    name:string,
    retire:(date:Date)=>void
}={
    id:1,
    name:"A",
    retire:(date:Date)=>{
        console.log(date);
        
    }
};

type Employee={
    id:number,
    name:string,
    retire:(date:Date)=>void
}

let e1:Employee={
    id:1,
    name:"A",
    retire:(date:Date)=>{
        console.log(date);
        
    }
}

interface Mailable{
    send(email:string):boolean;
    queue(email:string):boolean
}

interface FutureMailable extends Mailable{
    later(email:string,after:number):boolean
}

class Mail implements FutureMailable{
    send(email: string): boolean {
        console.log(`Send mail to ${email}`);
        return true;
        
    }

    queue(email: string): boolean {
        console.log(`Queue mail to ${email}`);
        return true;
    }

    later(email: string, after: number): boolean {
        console.log(`Send mail to ${email} after the ${after} ms`);
        return true;
    }
}

interface Person{
    firstName:String,
    lastName:String
}

function get(person:Person):string{
    return`firstNAme is ${person.firstName} and lastName is ${person.lastName}`;

}

let p:Person={
    firstName:'A',
    lastName:'b'
} 

console.log(get(p));
   

function getEle<T>(items:T[]):T{
    let re=Math.floor((Math.random() * items.length));
    return items[re];
}
let num:number[]=[1,2,3,4];
let result1=getEle<number>(num);
console.log(result1);


let str:string[]=['str','asdd','sss'];
let result2=getEle<string>(str);
console.log(result2);


function sum(num1:number,num2:number):number{
    return num1+num2;
}

console.log(sum(12,23));
