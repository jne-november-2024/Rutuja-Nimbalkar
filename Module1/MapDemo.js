let map=new Map();

map.set('Navin','JavaCo');
map.set('Kiran','Android');
map.set('Chirag','ML');
map.set('Trishul','JS');
map.set('Navin','Java');
map.set(1,'A')




console.log(map.keys());
console.log(map.values())


console.log(map.has('Chirag'));

console.log(map.get('Trishul'));

for(let [k,v] of map){
    console.log(k," : ",v);
}

map.forEach(

    (v,k)=>{  //value then inx then if set

        console.log(k," : ",v);
    }

)

console.log(map.delete(1));

console.log(map);