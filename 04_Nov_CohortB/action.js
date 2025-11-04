// alert("checking js connected");


document.getElementById("heading").style.color="red";
document.getElementById("heading").innerText="This is red color";
// document.getElementById("heading").



// document.children[0].children[1].children[0].children[0];


let x = document.getElementById("para3")
x.style.color ="green"



let bulbImage = document.getElementById("bulbImage");
let url1= "https://images.pexels.com/photos/577514/pexels-photo-577514.jpeg?cs=srgb&dl=light-light-bulb-idea-577514.jpg&fm=jpg"
let url2 = "https://th.bing.com/th/id/OIP.dTmDdvOWEO-0s7t0Z3Yr4gAAAA?o=7rm=3&rs=1&pid=ImgDetMain&o=7&rm=3";
// bulbImage.addEventListener('click',()=>{
//     console.log("clicked image")
// bulbImage.src="https://th.bing.com/th/id/OIP.dTmDdvOWEO-0s7t0Z3Yr4gAAAA?o=7rm=3&rs=1&pid=ImgDetMain&o=7&rm=3"
// })

let cnt =0;
bulbImage.addEventListener('mouseout',()=>{
    cnt++;
    console.log("image clicked "+cnt+ " times");
    if(cnt%2===1){
          bulbImage.src=url2
    }else{
          bulbImage.src=url1
    }
})



// let mango = document.createElement('li');
// mango.innerText ="Mango";

// let fruitList = document.getElementById("fruitsList")
// fruitList.appendChild(mango)



let textInput = document.getElementById("textInput");
let data;
// console.log("inital textBox Value: "+textInput);
textInput.addEventListener('input', (e)=>{
    // console.log(e)
    console.log(e.target.value)
    data=e.target.value;
})

let userList = document.getElementById("userList");



let button = document.getElementById("button");

button.addEventListener('click',()=>{
    console.log("button clicked")
    let newItem = document.createElement("li");
    newItem.innerText = data;
    userList.appendChild(newItem)
})


userList.innerHTML="<h1>userList</h1>"

