/*

 */
class animal2 {

    public void sound(){
        System.out.println("I am an animal who speaks");
    }
}

class Dog extends animal2{

    @Override //method override
    public void sound(){
        System.out.println("I bark");
    }
}

class Cat extends animal2{

    @Override //method override
    public void sound(){
        System.out.println("Meow Meow");
    }
}
/*
    animal dog = new Dog();
        dog.sound();
*/

public class Polymorphism {

    public static int add (int a, int b){
        return a+b;
    }

    public static int add (int a, int b, int c){

        return a+b+c;
    }

    public static String add (String a, String b){   //method overloading
        return a+"   "+b;
    }

//    public static int add(String a, String b){ //will throw compile time error
//        return 0;
//    }

    //add("ape" +"dog")

    public static void methodOverloading(){
        int sum2 = add(3,5);
        int sum3 = add(3,5,6);
        String sumString2 = add("apple","orange");
        System.out.println("sum2 is: "+sum2+ "   sum3 is: "+sum3+ "  sumString2: "+sumString2);
    }

    public void runTime(animal2 animal){
        animal.sound();
    }

    public static void main(String args[]){

        animal2 dog = new Dog();
        animal2 cat = new Cat();
        dog.sound();

    }
}
