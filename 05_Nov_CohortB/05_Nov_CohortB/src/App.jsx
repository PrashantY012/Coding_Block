import Car from "./Car"
import Greet from "./Greet"

function Fun() {

  return (
    <>
      <p>This is para</p>
     <Greet    Name = "Tom" SurName="Cruise"></Greet>
     <Greet Name = "Johny" SurName="Dep"></Greet>
     <Greet Name = "Shilpa" SurName="Shetty"></Greet>
     <Car model="sedan" color="black"></Car>

     <div>Hello World!!!</div> 
     </>
  )
}

export default Fun
