const mongoose = require('mongoose');
const url ="mongodb://localhost:27017/ADYPU";
const express = require("express");
const app = express();
app.use(express.json());

const connectDB =async ()=>{
    try{
    await mongoose.connect(url);
    console.log("data base connected successfully");
    }catch(err){
        console.log("some error occured while connecting with db ",err);
    }
}

connectDB();

const studentSchema = new mongoose.Schema({
    name:String,
    surname:String,
    age:Number,
    email:{type: String,required:true}
})


const student = mongoose.model('student',studentSchema); //created table in database
const insertFn = async(obj)=>{
    try{
       await student.insertOne(obj)
       console.log("data inserted successfully");
    }catch(err){
        console.log("some error occured while inserting data ",err);
    }
}  

const findFn = async()=>{
    try{
       let data = await student.find()
       console.log("data is: ",data);
    }catch(err){
        console.log("some error occured while fetching data ",err);
    }
}  

const updateFn =  ()=>{
        let filter ={name:"Batista"}
        let update ={email:"batista@batista"}
        student.findOneAndUpdate(filter,update)
        .then(()=>console.log("data update successfully"))
        .catch(()=>console.log("some error occured while updating ",err));
}

const deleteFn =  ()=>{
      
        student.deleteOne({email:"bat@bat"})
        .then(()=>console.log("data delte successfully"))
        .catch((err)=>console.log("some error occured while deleting",err));
}

let obj1 = {
    name:"John",
    age:21,
    email:"john@john"
}
let obj2 = {
    name:"Batista",
    age:33,
    surname:"Liver",
    email:"bat@bat"
}

// insertFn(obj2);
// findFn();
// updateFn();
// deleteFn();

const signInFn =async (req,res)=>{
    let obj = req.body;
    let data = await student.findOne({email:obj.email});
    if(data){
        res.status(400).json("user already signed in, please login ");
    }else{
        await student.insertOne(obj);
        res.json("user signed in successfully")
    }

}

app.post('/signin',(req,res)=>{
    signInFn(req,res);
})

port = 3000;
app.listen(port,()=>{
    console.log("server started at port no:",port);
})

