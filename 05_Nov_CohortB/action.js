// alert("connection checking")


let btn1 = document.getElementById("incrBtn1")

let cnt1=0;

btn1.addEventListener('click',()=>{
    cnt1++;
    document.getElementById("counter1").innerText=cnt1;
})


let btn2 = document.getElementById("incrBtn2")
let cnt2=0;

btn2.addEventListener('click',()=>{
    cnt2++;
    document.getElementById("counter2").innerText=cnt2;
})



let btn3 = document.getElementById("incrBtn3")
let cnt3=0;

btn3.addEventListener('click',()=>{
    cnt3++;
    document.getElementById("counter3").innerText=cnt3;
})