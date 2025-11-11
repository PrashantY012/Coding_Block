const express = require('express') //import 

const app = express() //call express function

app.get('/helloWorld',(req,res)=>{
    res.send('Hello World (this is sent by server to browser)')
})

const obj ={
    'name':{
        first_name :'John',
        'last name': 'Cena'
    },
    'Address':{
        'Locality': "Lohegaon",
        'St No':10,
        'Pincode':411047
    }
}

app.get('/learnReq/:id',(req,res)=>{
    res.send('learning request');
    console.log("queryParams r: ",req.query.fruit)
    console.log("path variable iss: ",req.params.id);
})

app.get('/info',(req,res)=>{
    res.send(obj);
})

const port = 3000;
app.listen(port,()=>{
    console.log(`Server started on port number ${port}` )
})