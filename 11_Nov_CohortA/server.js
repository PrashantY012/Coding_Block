const expressVar = require('express');//import express

const app =  expressVar();


app.get('/helloWorld',(req,response)=>{  //url
    response.send("Hello world from our server and me!");
})

//information about you, name, college, hobby
let infoObj ={
    name:'Prashant',
    surname:'TA',
    address:{
        HouseNo:"Lohegaon",
        StNo:72
    },
    favMovies:['Ipman','IronMan',213]
}

app.get("/myInfo",(req,res)=>{
    res.status(203).send(infoObj) ;
})

app.get("/queryParam",(req,res)=>{
    console.log(req.query);
    res.send("learning query params "+req.query.name)
    
})

//create a new api
let fruits=['apple','mango','bananna','orange'];

app.get('/getFruit/:id',(req,res)=>{
    console.log(req.params);
    console.log(req.params.id);
    let ind= req.params.id
    res.send("required fruit is: "+fruits[ind])
})



const port = 2000;

app.listen(port, ()=>{
    console.log("Server has started at port no: "+port);
})




