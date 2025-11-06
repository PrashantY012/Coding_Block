import { useState } from "react";

//hook -> useEffect

function Increment(){
    // let x=21;
    let [counter, setCounter] = useState(0);  //initally counter is zero
        //state,  function which changes state  
    

    function Increment(){
        // console.log("x before press: "+x);
        // x++;
        // console.log("x after press: "+x);
        // counter++;
        // setCounter((x)=>{
        //     return x+1;
        // })

        setCounter(counter=>counter+1);
        setTimeout(()=>{
            console.log("waiting wating")
        console.log(counter);
        },1000)
    }

     function Decrement(){
        // console.log("x before press: "+x);
        // x++;
        // console.log("x after press: "+x);
        // counter++;
        // setCounter((x)=>{
        //     return x+1;
        // })

        setCounter(x=>x-1);
        console.log(counter);
    }

    return (
        <>
        <p>Counter {counter}</p>
        <button onClick={Increment}>Increment</button>
        <br />
        <br />
        <button onClick={Decrement}>Decrement</button>

        </>
    )
}
/*
document.getElementById("button0").addEventLisnter('click')'mouserOver'


*/

export default Increment;