const mongoose = require('mongoose')
const express = require('express')
const url = "mongodb://localhost:27017/Sunstone";

const app = express();
app.use(express.json());

let connectDB = async () => {
    try {
        await mongoose.connect(url);
        console.log("database connected");
    } catch (err) {
        console.log("some error occured while connecting to database: ", err);
    }
}
connectDB();

const studentSchema = new mongoose.Schema({
    name: String,
    age: Number,
    Address: String,
    email: String
})

const student = mongoose.model('Student', studentSchema);//making table/collection in mongoDB


// let obj =
// {
//     name: "Prashant",
//     age: 21,
//     Address: "Lohegaon",
//     email: "pra@pra"
// }

const signin = async (req,res) => {
    try {
        let obj = req.body;
        let doesAlreadyExist = await student.findOne({ email: obj.email })
        console.log("does already exist ",doesAlreadyExist)
        if (doesAlreadyExist) {
            console.log("user already exist, please login ")
            res.json("user already exist, please login ")

        } else {
            await student.insertOne(obj)
            console.log("user logged in successfully")
            res.json("user logged in successfully")
        }

    } catch (err) {
        console.log("some error occured while iserting data ", err);
        res.json("some error occured while iserting data ")
    }

}

app.get('/signin',(req,res)=>{
    signin(req,res);
})



let port = 3000;
app.listen(port,()=>{
    console.log("Server started at port no: ",port)
})
