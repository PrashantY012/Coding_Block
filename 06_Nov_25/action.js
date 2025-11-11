// alert("checking connection")
let head = document.getElementById("heading")
let arr =document.getElementsByTagName("p")
let div1 =document.getElementById("div1")

// document.querySelector("")
// console.log(arr);

// head.style.color="white";
// head.style.backgroundColor="black"
head.innerText="new heading"

//create a element
let ptag= document.createElement("p");
ptag.innerText="this is made from js";
div1.append(ptag)
// head.remove();




let catUrl ="https://wallup.net/wp-content/uploads/2016/01/195009-animals-cat.jpg" 
let dogUrl ="https://w-dog.org/android-wallpapers/16/17/478857865223221/dog-puppy-portrait.jpg"
let animalImg = document.getElementById("animalImg")

let flag=0;
animalImg.addEventListener('mouseout',()=>{
    if(flag%2===0)
    animalImg.src=catUrl;
    else animalImg.src=dogUrl 
    flag++;
})



// document.children[]

let input= document.getElementById("inputItem");
let inputValue;
input.addEventListener('input',(evn)=>{
    console.log(evn.target.value)
    inputValue=evn.target.value;
})

let todoList= document.getElementById("todoList");
let inputBtn= document.getElementById("inputBtn");

inputBtn.addEventListener('click',()=>{
    let li = document.createElement('p');
    li.innerText= inputValue;
    todoList.append(li);
    inputValue = -1
})




