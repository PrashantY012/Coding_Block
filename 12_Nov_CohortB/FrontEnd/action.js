let getDataBtn = document.getElementById("getDataBtn");
let getDatap = document.getElementById("getDatap")
getDataBtn.addEventListener('click', async () => {
    console.log("get data btn clicked");
    let rawData = await fetch("http://127.0.0.1:3000/myinfo");
    let data = await rawData.json();
    console.log("raw Data is:", rawData);
    console.log("data is: ", data);
    console.log("data is: ", data.name)
    getDatap.innerText = JSON.stringify(data);
})


let form = document.getElementById("formId");
let obj ={
    name:"prashant",
    age:30,
}
form.addEventListener('submit', async (e) => {
    e.preventDefault();
    let data = "This has come from frontend";
     console.log("form clic");
     
    await fetch("http://127.0.0.1:3000/userData", {
        // Adding method type
        method: "POST",
        // Adding body or contents to send
        body: JSON.stringify({
            obj
        }),
        // Adding headers to the request
        headers: {
            "Content-type": "application/json"
        }
    })

    console.log("form submitted");
})