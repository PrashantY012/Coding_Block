package Inheritance;

class Vehicle {
    public String name;
    public void horn(){
        System.out.println("Vehicle Horn");
    }

}
class FourWheeler extends Vehicle{
    public String type;
    public void horn(){
        System.out.println("FourWheeler Horn");
    }
}

class TwoWheeler extends Vehicle{
    public String type;
    public void horn(){
        System.out.println("TWoWheeler Horn");
    }
}



public class Polymorphism {

    //**********************COMPILE TIME POLYMORPHISM*************************
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int  b, int c){
        return a+b+c;
    }
    public static String add(String a, String b){
        return a+" "+ b;
    }
    /*

     */
        public static double add(double a, int c, int d)
        {
        return a+c;
        }


        public  static void getVehicle(Vehicle veh){
            veh.horn();
        }

    public static void main(String []args){
//        System.out.print(add(5,8));


        //Run time polymorphism
        FourWheeler swift = new FourWheeler();
        TwoWheeler activa = new TwoWheeler();
        Vehicle veh = new Vehicle();
        getVehicle(swift);
        getVehicle(activa);
        getVehicle(veh);

    }

}
