package Inheritance;

import com.sun.jdi.VirtualMachineManager;

class Animal {
    public String skinColor;
    public int age;
    private String sound;
    Animal(){

    }
    Animal(int age){
        //50 lines of encryption logic
        this.age=age;
    }
}

class Mammal extends Animal {
    Mammal (int runningSpeed){
        this.runningSpeed = runningSpeed;
        System.out.println("this: "+this);

    }

    Mammal (int runningSpeed,int age){
        super(age);
        this.runningSpeed = runningSpeed;
        System.out.println("this: "+this);

    }

    Mammal (String style){
        walkingStyle = style;
    }

    Mammal (String style, int speed){
        walkingStyle = style;
        this.runningSpeed = speed;
    }

    public int runningSpeed;
    public String walkingStyle;

}

class Bird extends Animal   {

   public  Bird (){
            System.out.println("Custom constructor called");
    }
    public  Bird (String data){
        System.out.println("Custom constructor with data called:"+data);
    }
    public int flyingSpeed;


    @Override
    public String toString(){
        return "toSting";
    }
}

public class Inheritance {
    public static void main(String args[]){
        Mammal dog = new Mammal(50,35);
//        dog.runningSpeed = 30;
//        dog.sound ="Bhau Bhau";
//        dog.age = 15;

        Bird crow = new Bird(null);
        crow.flyingSpeed = 30;
        crow.skinColor = "Black";

        System.out.println("Dog: "+dog.age+ " crow: "+crow);

    }
}


/*
    Constructor is called only once, when object is initialised(and only one constructor is called, even if many are present);

    //when no custom constructor is written by user, default constructor(with no parameters) is called

    //when we write a custom constructor, the default one is never called.(assume it is lost now)

//constructor has no return type, though it can be public, private etc

 */
