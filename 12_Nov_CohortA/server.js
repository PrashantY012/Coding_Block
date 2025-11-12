const expressVar = require('express')

const app = expressVar();
let cors = require('cors')
app.use(cors());

app.use(expressVar.json());


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

app.get('/myinfo',(req,res)=>{ //get request is served here
    console.log(req.url);
    res.send(obj);
})

app.post('/recieveData',(req,res)=>{
    console.log("data from front end is:",req.body);
    res.status(200).json("data recived successfully")
})


let port =3000;

app.listen(port,()=>{
    console.log("My server has started on port no:"+port);
})