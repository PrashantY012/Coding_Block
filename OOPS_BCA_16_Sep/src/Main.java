
class Animal {
   public int weight;
   public String color;
   private String eyeColor;
   protected int age;
   public String getEyeColor(){
       //perform operations then return eyeColor---> abstraction
       return eyeColor;
   }
   public void setEyeColor(String eyeColor){
       this.eyeColor = eyeColor;
   }
   Animal (){

   }
   Animal (int weight, String color){
       this.weight = weight;
       this.color = color;
       System.out.println("parent constr called");
   }
    Animal (int weight){
        this.weight = weight;
        //20 logical lines are wrtiten here
    }
}

 class Mammal extends Animal{
    public int runningSpeed;
    public String walkingStyle;
    Mammal(int runningSpeed, String walkingStylex, int weight,String color ){  //custom ---> default is lost
        super(weight,color);
//        super(color, weight);
        this.runningSpeed = runningSpeed;
        this.walkingStyle = walkingStyle;
        System.out.println("Child constructor called");
    }

     Mammal(int runningSpeed, String walkingStylex, int weight,String color, String eyeColor ){  //custom ---> default is lost
         super(weight,color);
//        super(color, weight);
         this.runningSpeed = runningSpeed;
         this.walkingStyle = walkingStyle;
         this.weight = weight;
         super.setEyeColor(eyeColor);
         setEyeColor(eyeColor);
         System.out.println("Child constructor called");
     }

     Mammal(int runningSpeed, int age ){  //custom ---> default is lost
            this.runningSpeed = runningSpeed;
            super.age = age;
     }
}

class Bird extends Animal{
    public int flyingSpeed;
    public int avgEggLaid;

    @Override
    public String toString(){
        return "weight: "+ weight + " color: "+ color + " flyingSpeed: "+flyingSpeed+ " avgEggLaid: "+avgEggLaid;
    }
}

class LearnCons{
    public String name;
    public int age;
    public LearnCons(String type){
        System.out.println("custom constructor called: type: "+type);//logs
    }

    public LearnCons(String type, int number){
        System.out.println("custom constructor called: type: "+type+" number: "+ number);//logs
    }
    public LearnCons(){
        System.out.println("custom constructor called with no arguments ");//logs
    }

}


public class Main {
//    public void simpleInheritance(){
//        Mammal dog = new Mammal(100, "walking");
//        dog.weight = 30;
//        dog.color = "Brown";
////        dog.runningSpeed = 100;
////        dog.walkingStyle = "Walking";
//
//        Bird pigeon = new Bird();
//        pigeon.weight = 15;
//        pigeon.color = "Blue";
//        pigeon.flyingSpeed =25;
//        pigeon.avgEggLaid = 3;
//
//        System.out.println("Dog: "+ dog+ "   pigeon:"+ pigeon);
//    }
    public static void main(String[] args) {
        System.out.println("Hey There");
        Mammal Lion = new Mammal(100, "Walk", 300, "Yellow");
        Lion.age = 61;
        System.out.println("age: "+Lion.age);



    }


}


/*
    Constructor is called only once, when object is initialsied(and only one construcotr is called, even if many are present);

    //when no custom constructor is written by user, default constructor(with no parameters) is called

    //when we write a custom constructor, the default one is never called.(assume it is lost now)

 */