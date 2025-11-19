// //npm install bcrypt
// const bcrypt = require('bcrypt')

// let password ="John@123";

// let hashedPswd = bcrypt.hashSync(password,10);
// console.log("hashed password: " + hashedPswd);
// //hashed password: $2b$10$lJTTtpbNSd7Nrrf34oM2oed2LokdeSnJxsHLrskgx7uTtObJsEI12



// let userPswd = "John@123"
// let result = bcrypt.compareSync(userPswd,hashedPswd);
// console.log(result);

//npm install cookie-parser

const express = require('express');
const cookieParser = require('cookie-parser');
const app = express();
app.use(cookieParser());

const cookieInfo ="hey i am cookie";
app.get('/learnCookie',(req,res)=>{
      res.cookie("cookieInfoKey", cookieInfo, {
    httpOnly: true,
    secure: false,
    sameSite: "lax",
    maxAge: 2 * 60 * 1000    // cookie expiry 2 min
  });
  res.json("hey we are learning cookie");
})
app.get('/seeCookieOnServer',(req,res)=>{
    console.log(req.cookies);
    res.json("we are seeing content of cookie");
})

const port = 3000;
app.listen(port, ()=>{
    console.log("app listening on port no: ",port);
})
