import { useState } from "react";

//hook -> useEffect
function Increment(){
    // let x=21;
    let [counter, setCounter] = useState(0);  //initally counter is zero
        //state,  function which changes state  
    
    function Increment(){
        console.log("Counter 1 chnaged");
        setCounter(counter=>counter+1);
    }

     function Decrement(){

        setCounter(x=>x-1);
        console.log(counter);
        console.log("Counter 1 chnaged");
    }


    return (
        <>
        <p>Counter {counter}</p>
        <button onClick={Increment}>Increment</button>
        <br />
        <br />
        <button onClick={()=>{
                setCounter(count=>count-1);
                console.log("ram is a boy");

        }}>Decrement</button>
        </>
    )
}


/*
document.getElementById("button0").addEventLisnter('click')'mouserOver'


*/

export default Increment;