let seeData = document.getElementById("seeData");//p tag
let getBtn = document.getElementById("getDataBtn");

let form = document.getElementById("form");


let sendData = {
    name: "Prashant",
    age: 21,
    email: "gmail.com"
}
form.addEventListener('submit', async (e) => {
    e.preventDefault();
    //TODO: get data from form inputs and form an object


    let rawData = await fetch("http://localhost:3000/recieveData", {
        // Adding method type
        method: "POST",

        // Adding body or contents to send
        body: JSON.stringify({
            sendData
        }),

        // Adding headers to the request
        headers: {
            "Content-type": "application/json"
        }

    })
    
    let data = await rawData.json();
    console.log("form submitted",data)
})








getBtn.addEventListener('click', async () => {
    console.log("get data start");

    let rawData = await fetch("http://localhost:3000/myinfo");
    let data = await rawData.json();
    console.log(rawData);
    console.log(data);
    console.log("get data end")
    seeData.innerText = JSON.stringify(data);
})