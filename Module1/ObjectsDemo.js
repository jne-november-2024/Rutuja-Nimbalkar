let person = {
    firstName: 'John',
    lastName: 'Doe'
};

function greet() {
    console.log('Hello, World!');
}
console.log(person);
person.greet = greet;

console.log(person);
person.greet();





let users={

    firstName:'Rutuja',
    lastName:'Nimbalkar',
    address:'Pune',
    phone:12344455,
    "full name":'Rutuja Nimbalkar'
  


}

console.log(users.firstName);

console.log(users["address"]);

console.log(users["full name"]);

users.greetings=function say(){
    console.log('Hello users');
}

users.greetings1=function say(){

    console.log(`hello user, ${this.firstName}`);

}

console.log(users);
console.log('------------------');

console.log(users.greetings);
users.greetings()

console.log(users.greetings1()); // return value of function print undefined

const ob1={1:'a',2:'b'}

const ob2={3:'c',4:'d'}

const ob3=Object.assign({},ob1,ob2)

console.log(ob2);
console.log(ob3)
const ob5={8:'V'}
const ob4={...ob3, ...ob5}
console.log(ob4)


const person1={
    fullName:'Rutuja Nimbalkar',
    score:90,
    getScore:function(){
      console.log(this.score);
    }
}

person1.getScore();

let data='secure';
class Info{
   

    constructor(name,email){

        this.name=name,
        this.email=email
    }

    viewInfo(){
        console.log('name: ',this.name,'email : ',this.email,' ',data)
    }
}

const obj1=new Info('Rutuja','rutu@gamil.com');

const obj2=new Info('Rutu','rutu@gmail');

obj1.viewInfo();
obj2.viewInfo();




class Admin extends Info{
constructor(name,mail){

    super(name,mail);

}


    editData(data){
        super.data=data;
    }

}

const obj3= new Admin('admin','admin@gmail.com');
obj3.editData('abc');
console.log(obj3);




const destruct={
 a:'a',
 b:'b',
 c:'c'

}
console.log(destruct.a);
// const{}=destruct;

const{c}=destruct;
console.log(c);

const{c:third}=destruct;
console.log(third);




