 
var isEven= function (element){

   /*if(element%2===0){
    return true;
   }
     return false;
*/

return element%2===0;

}



console.log(isEven(3));


var print= (msg)=>{

    return "hi, "+msg;
}

console.log(print('Rutuja'));



let resukt=[2,3,4,5,6].every(isEven);
console.log(resukt);



let a=[2,4,6,8].every((e)=>{

    return e%2===0;
})
console.log(a);



let b=[1,2,3].every((e)=>(e%2===0));
console.log(b);



var xyz;
/* 

xyz.createOrder();

xyz.ProceedToPay();

xyz.OrderSummary();
*/
xyz.createOrder(
    function () {
        xyz.ProceedToPay(
            function () {
                xyz.OrderSummary(/*callbacks..*/);
            }
        );
    }
);

//callbacks hell grows horizontally


