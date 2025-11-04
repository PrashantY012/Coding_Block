let globalVariable = "I am global variable"
console.log("using add on top:"+add(11,8));



function print(){
    let localVariable = " I am local variable ";
    console.log("inside print function: localVar:"+localVariable+ "  globalVar: "+globalVariable);
}

// print();
// console.log(globalVariable);
// console.log(localVariable);

// if(true){
//     let blockScopeVar="I have block scope";
//     console.log(blockScopeVar);
// }
// console.log(blockScopeVar); //will throw error

// console.log(checkHoistInFunction);
// function printOutside()
// {   
//     console.log(checkHoistInFunction);
//     let printOutVar = "I am outside function";

//     function printInside(){
//         console.log("InsidePrint function: "+printOutVar);
//     }
//     printInside();
//     var checkHoistInFunction= "checkHoistInFunction checking....";
// }

// printOutside();

// console.log(usingVar);
// console.log(usingLet);

var usingVar = " I am of var type";
usingVar = 21;

let usingLet = "I am of let type";

// console.log(usingVar);

// console.log(add(11,8));
// console.log(addVar(a,b));

function add(a,b){
    return a+b;
}

let addVar = function(a,b){  //function expression, use this style
    return a+b;
}

// console.log(addVar(5,6));
// console.log(add(5,6));






// function getBioData(){
//     let name = "Sam";
//             if(true){
//                 let middleName = " hanger ";
//                 if(true){
//                     var surName =" cliff";
//                 }
//             }
//     console.log(name);
//     console.log(surName);
//     // console.log(middleName);        
// }
// console.log(surName);

// getBioData();


let divideFun = function (a,b){
    return a/b;
}

let  calBMI = function(height, weight, divi){
    console.log("BMI is: "+ divi(height,weight));
}

calBMI(2,100,divideFun);

let temp= function (a,b){
    return {  
        add: function(a,b){
            return a+b;
        },
        sub: function (a,b)
        {
            return a-b;
        }
    }
    /*
    {key1: value,
        key2: value,
    }
    */
}

// let calC = temp();
// console.log(calC.add(5,18));

// let arr = [2,4,6,9];

// let doubleFun = function(b){
//     return 2*b;
// }

// // let arr2 =arr.map(doubleFun) //returns new array
// let arr2 =arr.map(function(b){
//     return 2*b;
// }) //returns new array

// let evenArr = arr.filter(function(a){
//     return a>5;
// })

// console.log(arr);
// console.log(arr2);
// console.log(evenArr);


let obj = {
    "name":"Prahant",
    "age": 31,
    greet: function (special){
        return "Hello from prashant "+special;
    }
}

// console.log(obj.name);
// console.log(obj.age);
// let greetState = obj.greet(" to you all");

// console.log(greetState)
let counterFun = function(){
    let counter = 0;
    // return {
    //     incrementCounter: function(){
    //         counter++;
    //     },
    //     decrementCounter: function(){
    //         counter --;
    //     },
    //     printCounter: function(){
    //         console.log(counter);
    //     }
    // }
    return info = function(){
        counter++;
        console.log(counter);
    }
}

let buttonCount = counterFun();

// buttonCount.printCounter();
// buttonCount.incrementCounter();
// buttonCount.printCounter();

buttonCount();
buttonCount();

//create  a calculator funciton, which returns add, sub, div, mul on two numbers

