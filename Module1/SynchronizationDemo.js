//Sync  sequence linear mannaer ( ! fetching data from a server or reading a large file.)

//Async allows multiple tasks to run independently of each other


//sync 
console.log('Hi');
console.log('Hello');
console.log('How are you?');


//async

console.log('Hi');

setTimeout(() => {
    console.log('Inside the setTimeout.');
}, 2000);

console.log('End');

