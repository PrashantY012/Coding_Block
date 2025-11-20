// let bcrypt = require('bcrypt');

// let orgPassword = "John";

// let hashedPswd = bcrypt.hashSync(orgPassword,10);

// console.log("hashed value is: "+hashedPswd);


// let loginPswd = "John";

// let check = bcrypt.compareSync(loginPswd,hashedPswd);
// console.log("is password correct: " + check);


// npm install cookie-parser-> to read cookie data


const express = require('express');
const app = express();
const cookieParser = require('cookie-parser');
app.use(cookieParser());

let cookieInfo =" hey i am a cookie set by the server";
app.get('/setcookie',(req,res)=>{
    res.cookie("cookieToken",cookieInfo,{
    httpOnly: true,
    secure: false,
    sameSite: "lax",
    maxAge: 2 * 60 * 1000    // cookie expiry 2 min
  });
    res.json("this is the api to set cookie");
})

app.get('/seeCookie',(req,res)=>{
    console.log("cookie sent to us is: ", req.cookies.cookieToken);
    res.json("i am reading sent by the browser");
})

const port = 3000;
app.listen(port,()=>{
    console.log("server started: ",port);
})