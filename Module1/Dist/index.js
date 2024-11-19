"use strict";
let a = 102222098;
let cousre = 'TS';
let level;
function render(doc) {
    console.log(doc);
}
let arr = [];
arr[0] = 10;
let arr1 = [10, 20, 30];
let user = [1, 'Rutuja'];
var Size;
(function (Size) {
    Size[Size["Small"] = 1] = "Small";
    Size[Size["Medium"] = 2] = "Medium";
    Size[Size["Large"] = 3] = "Large";
})(Size || (Size = {}));
;
;
let mySize = Size.Small;
console.log(mySize);
function calculateTax3(income) {
    if (income < 50000)
        return income * 1.2;
    return income * 1.3;
}
calculateTax3(10000);
function calculateTax1(income, target) {
    if (income < 50000 && target < 2022)
        return income * 1.2;
    return income * 1.3;
}
function calculateTax(income) {
    if (income < 50000)
        return income * 1.2;
    return income * 1.3;
}
function calculateTax2(income, target = 2022) {
    if (income < 50000 && target < 2022)
        return income * 1.2;
    return income * 1.3;
}
calculateTax2(10000);
let emp = { id: 1, name: '' };
emp.name = 'A';
let emp1 = {
    id: 1,
    name: "A",
    retire: (date) => {
        console.log(date);
    }
};
let e1 = {
    id: 1,
    name: "A",
    retire: (date) => {
        console.log(date);
    }
};
class Mail {
    send(email) {
        console.log(`Send mail to ${email}`);
        return true;
    }
    queue(email) {
        console.log(`Queue mail to ${email}`);
        return true;
    }
    later(email, after) {
        console.log(`Send mail to ${email} after the ${after} ms`);
        return true;
    }
}
function get(person) {
    return `firstNAme is ${person.firstName} and lastName is ${person.lastName}`;
}
let p = {
    firstName: 'A',
    lastName: 'b'
};
console.log(get(p));
function getEle(items) {
    let re = Math.floor((Math.random() * items.length));
    return items[re];
}
let num = [1, 2, 3, 4];
let result1 = getEle(num);
console.log(result1);
let str = ['str', 'asdd', 'sss'];
let result2 = getEle(str);
console.log(result2);
function sum(num1, num2) {
    return num1 + num2;
}
console.log(sum(12, 23));
