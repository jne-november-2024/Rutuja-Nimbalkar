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