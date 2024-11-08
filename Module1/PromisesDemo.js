let p=new Promise(  

    (resolve,reject)=>{
        let pin=11
        if(pin==1){
            resolve('Success');
        }else{
            reject('Error');
        }
    }
 );

 p.then(
    (msg)=>{
     console.log(msg);   
    }
 ).catch(
    (msg)=>{
        console.log(msg);   
       }
 );

let p1=new Promise(

    (resolve,reject)=>{
        resolve('Task 1 completed')
    }

)
let p2= new Promise(
    (resolve,reject)=>{
        resolve('task 2 completed')
    }
)

let p3= new Promise(
    (resolve,reject)=>{
        reject('task 3 rejected')
    }
)

Promise.all([
    p1,p2
]).then(
    (msg)=>console.log(msg)
).catch(
    err=>
    console.log(err)
)

Promise.all([
    p1,p2,p3
]).then(
    (msg)=>console.log(msg)
).catch(
    err=>
    console.log(err)
)

// all return all


// first  result return 
Promise.race(
    [p2,p1]
).then(
    (msg)=>{
        console.log('race  '+msg)
    }
).catch(
    (error)=>{
        console.log('race  '+error);
    }
)





function first() {
    return new Promise((resolve) => {
      setTimeout(() => resolve("Data fetched"), 1000);
    });
  }
  
  function second(data) {
    return new Promise((resolve) => {
      setTimeout(() => resolve(`${data} processed`), 1000);
    });
  }
  
  first()
    .then((data) => second(data))
    .then((second) => console.log(second))
    .catch((error) => console.error("Error:", error));
  


  

    let promise1=new Promise(
        (resolve,reject)=>{
            setTimeout(() => {
                resolve('promises1')
            }, 1000);
        }
    )

    let promises2=new Promise(
        (resolve,reject)=>{
            setTimeout(() => {
             resolve('promises2')   
            }, 500);
        }
    )

    Promise.race([promise1,promises2])
    .then(msg=>console.log(msg))
    .catch(err=>console.log(err))


    let promises3=new Promise(

        (resolve,reject)=>{

            setTimeout(()=>{
                reject('3 rejected')
            },3000)
        }

    )

    Promise.allSettled([promise1,promises2,promises3])
    .then(
        (msg)=>console.log(msg)
    ).catch(
        err=>console.log(err)
    )