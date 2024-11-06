let age = 18;
let state = 'MH';

if (state == 'MH') {
  if (age >= 19) {
    console.log('You can drive.');
  }else {

    console.log('You cannot Drive');
  }
}


if (state == 'MH') {
    if (age >= 18) {
      console.log('You can drive.');
    }else {
  
      console.log('You cannot Drive');
    }
  }



  let month=3;
  let monthName;

  if(month==1){
    console.log('Jan');
  }else if(month==2){
    console.log('Feb');
  }else if(month==3){
    console.log('March');
  }else{
    console.log('end');
  }


  switch(month){

    case 1:
        console.log('Jan');
        break;
    case 2:
        console.log('Feb');
        break;
    case 3:
        console.log('mar');
        break;
    case 4:
        console.log('April');
        break;
        
    default:
        console.log('End');



  }

let count=0;

  while(count<=10){

    console.log(count);
    count+=2;

  }

  do{
    console.log(count);
    count++;
  }while(count<=18);


//outer: for nested   break outer;  (label)
for (let i = 0; i < 5; i++) {
    console.log(i);
    if (i == 2) {
      break;
    }
  }
 console.log('------------');
  for (let i = 0; i < 10; i++) {
    if (i % 2 === 0) {
      continue;
    }
    console.log(i);
  }