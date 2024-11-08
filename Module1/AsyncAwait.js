function makeConnection(location){
 
    return new Promise(
        (resolve,reject)=>{
            console.log(`Making request to the ${location} `)
            console.log('Wait for movement')
            if(location=='Google'){
                resolve('you can accesss')

            }else{
                reject('Only avaible for the google')
            }
        }
    )
}


function getInfo(response){

    return new Promise(
        (resolve,reject)=>{

            console.log('Recevied the response for data')
            resolve(`${response} google say hii...`)
        }
    )

}

/*

makeConnection('Google1').then(
    response=>{
   console.log('Recevied the data')
   return getInfo(response)
    }
).then( 
    msgGet=>
    console.log(msgGet)
).catch(
    err=>
    console.log(err)
)
    */


async function work1(){

    let response=await makeConnection('google');
    console.log('Recevied the data')

    let msg= await getInfo(response)

    console.log(msg)

}


async function work(){

    try{

    let response=await makeConnection('google');
    console.log('Recevied the data')

    let msg= await getInfo(response)

    console.log(msg)
    }catch(err){
        console.log(err);
    }

}




work();



