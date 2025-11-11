const expressVar = require('express')


const app = expressVar();


app.get('/helloWorld',(req,response)=>{
    response.send('Hello there, this response is from my backend written in express');
    console.log("helloWorld fun ran")
})

app.get('/helloIndia',(req,res)=>{
    console.log("helloIndia fun ran")
    res.send('Hello but this time its from india');
})


let obj ={
    name:"John",
    surname:"Cena",
    Adress:{
        locality:"Lohegaon",
        city:"pune"
    },
    favFruits:['apple','orange','bananna']
}
//new endpoint which returns your name, hobby etc etc

app.get('/myinfo',(req,res)=>{
    console.log(req.url);
    res.send(obj);
})

let fruits =['apple','banna','orange','grape']
app.get('/getfruit/:id/:id2',(req,res)=>{
    console.log(req.params);
    console.log(req.params.id);
    res.status(404).send("my fruit is: "+fruits[req.params.id]+" "+fruits[req.params.id2])
})

app.get('/learnQueryParam',(req,res)=>{
    console.log(req.query);
    res.send("learning query params "+req.query.name+"  "+req.query.surname)
})

let port =3000;

app.listen(port,()=>{
    console.log("My server has started on port no:"+port);
})