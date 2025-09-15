class animal{ //class name
    //data members-> data variables, methods -> function

    public String label =" this is an animal class";

    public void makeSound(){
        System.out.println("Animals can speak");
    }

    public String name;
    public int age;

}

class person{
    public int age; 
    public String name;
    private int bankBalance=21000;

    public int getBankBalance(){// getVariableName---> getter
        return this.bankBalance-10000;//loan kat har mahine
    }

    public void setBankBalance(int bankBalance){   //setVariableName ---> setter
        // bankBalance = bankBalance;
        System.out.println("class/global bankBalance: "+ this.bankBalance+"  local bank balance: "+bankBalance );
        this.bankBalance = bankBalance;
    }

}

public class Oop{
    public static void main(String args[]){
        // System.out.println("Hello Class");

        person p1 = new person(); // age = null, name = null, bankBalance = 21000
        p1.name ="ram"; //name changed
        p1.age = 21; //age change
        // p1.setBankBalance(10000); //bank balance changed to 10000
        System.out.println("Bank balance of p1: "+p1.getBankBalance());






















        // System.out.println("Label of class Animal is: "+ animal.label); //will this throw error or not
        // animal dog1 = new animal();
        // dog1.name = "Sheru";
        // dog1.age = 21;
        // dog1.makeSound();

        // animal dog2 = new animal();
        // dog2.name = "foxy";
        // dog2.age = 22;

        // System.out.println(dog1.name);


        // animal cat1 = new animal();
        // cat1.name = "billi";
        // cat1.age = 15;

        // animal elephant = new animal();

        // animal lion = new animal();

        // animal snake = new animal();

        // animal bird = new animal(); //separation of concerns


        // animal dog = new animal();
        // dog.name = "Sheru";
        // dog.name1= "foxy"; //private member can not be accessed directly
        // dog.name2 = "tom";



    }
}