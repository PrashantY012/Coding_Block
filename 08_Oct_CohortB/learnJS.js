// console.log("Hello, World!");



// let a =21;
// let s = "string sample ";
// let arr =[1,5,8];
// let  floatNo = 20.2;
// console.log(a);
// console.log(s,"   ",arr);
// console.log(floatNo);


// for(let i =0;i<arr.length;i++){
//     console.log(arr[i]);
// }


/*
DataTypes
Primitive
int, string, undefined, null, Bigint, , boolean, symbol

NonPrimitve
object


let no = 21;
let str = "apple";
let bool = true;
let Bigint = 123439812812837840274823974813975823913491912030183129n;
let arr = [1,2,3];
let nullType = null;
let undefinedType;

console.log(no, str, bool, Bigint, arr, nullType, undefinedType)

console.log(typeof(no), typeof(str), typeof(bool), typeof(Bigint), typeof(arr), typeof(nullType), typeof(undefinedType))

*/

/*
**********************************Strongly typed vs weakly typed language***************
let no =21
let fruit = "apple"
let sum = no+fruit; //implicit type conversion
let sum2= no +"10";
let sum3 = no-"10";
let fruitMul = fruit*3;
console.log(typeof(sum))
console.log("sum2 ",sum2, "   ", typeof(sum2))
console.log("sum3 ",sum3, "  ", typeof(sum3))
console.log("fruitMul", fruitMul);

let a = null;
let b;

let a ='21';
let b = Number(a); //explicit conversion
console.log(typeof(b));
*/


/* *******************STATTIC vs DYNAMIC TYPE*******************
// let cond = prompt("Please say terue or false:");
let cond = true; //type of a is defined at run time based on conditon
let a;

if(cond==true){
    a = 111;
}else{
    a ="111";
}

console.log(a, typeof(a));
*/



/****************************FUNCTIONSSSSS 

// function addNumber(a,  b){
//         return a+b;
// }

// let addNumber = function (a,  b){
//         return a+b;
// }

// let calculator = function (addNumber,a,b){
//     return addNumber(a,b);
// }
// console.log("sum of two numbers is: ", calculator(addNumber,10,11));
// console.log(typeof(addNumber));


*/


/******************OBJECT 
let Person = {
    age: 21,
    Name: "Prashant",
    FavMovie:["Life of pi","Ek tha Tiger", "Race 3"],
    Greet: function(){
            console.log("Greetings from Prashant");
    }
}
Person.Greet();
console.log(Person);

*/



/****************EQUALITY 
let a = 21;
let b = "21";
let fal = "false"
let boolFal = false;
console.log(a==b); //lose equality
console.log(fal == boolFal);

console.log(a === b); //strict equality
console.log(a!=b);//ideally true
console.log(a!==b); //use strict ineqaulites

*/

let fun = function(){
    console.log("funciton is in an array");
}
let arr = [1,2, "Apple", null, fun];
// console.log(arr)
// arr[3];














