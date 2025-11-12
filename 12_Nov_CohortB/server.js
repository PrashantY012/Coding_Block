const expressVar = require('express')
const cors = require('cors');

const app = expressVar();
app.use(cors());

app.use(expressVar.json());




app.post('/userData',(req,res)=>{
    console.log("recived data is: ",req.body);
    res.status(201).send(req.body);
})

let port =3000;

app.listen(port,()=>{
    console.log("My server has started on port no:"+port);
})