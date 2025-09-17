//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//class customArrayList{
//    int arr[] = new int[5];
//
//    int len =5;
//    //.add(){
//        //check if my array is full
//        int newarr[] = new int[len*2];
//        len = len*2;
//        //copy all old elements in new array;
//        //add the new element
//
//        arr = newarr ;
//    }
//
//
//}
class Animal{
    public int age;
    Animal(int age){
        this.age = age;
        System.out.println("this: "+this);
    }
}

class LinkedList{ //how many constructor we can make of this class
    public int value;
    public LinkedList adr;

    LinkedList(int value, LinkedList ard){
        this.value = value;
        this.adr = adr;
    }
    LinkedList(){

    }

}
public class Main {
    public void fun(){
//        int arr[] = {5,6,7,8}; //primitive data strucutre
////            int arrx[4];
////        === int arr[] = new int[4]; --> 5,6,7,8
//        int a =71; //primite values
//        int arr2[] ={5,6,7,8,9};  // 5 elements 5 operation, 5 space extra
//
//
//        int arr3[] =new int [20];
////        {5,6,7,8,9};
//
//        int arr4[] = new int [40];//
//
//        int arr5[] = new int[80];//element copied and add new element
//
////        int arr6[] ={1,2,3,4,5};
//        float b = 23;
////            a.appe
    }
    public void fun2(){
        //        Animal dog = new Animal(21);
//        System.out.println("Animal: "+dog);
//        dog.age =34;
        int value =21;LinkedList adr = null;
        LinkedList ll = new LinkedList(21,null);
        LinkedList ll2 = new LinkedList();
//        System.out.println(ll.value + "  "+ ll.adr);
    }

    public static void printLinkedListNode(LinkedList obj){
        System.out.println("Value: "+obj.value +" adr: "+obj.adr);
    }

    public static void printLinkedList(LinkedList head){

        while(head!= null){
            System.out.print(head.value+ "->");
            LinkedList temp = head.adr;
//            head = head.adr;
            head = temp;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //create a LinkedList with elements  5,6,7,8,9
        LinkedList n1 = new LinkedList();
        n1.value = 5;
        printLinkedListNode(n1);

        LinkedList n2 = new LinkedList();
        n2.value = 6;
        //Join/Link n1 and n2
        n1.adr = n2;
        printLinkedListNode(n1);
        System.out.println(n2);


        //print n2'value
        System.out.println(n2.value);
        System.out.println(n1.adr.value);

        LinkedList n3 = new LinkedList();
        n3.value = 7;
        //link second and third node
        n2.adr = n3;

        System.out.println("n3Value: "+n1.adr.adr.value);


        LinkedList n4 = new LinkedList();
        n4.value = 8;
        //Link node 3 and 4 th node
        n3.adr = n4;

        System.out.println("Node4Value: "+n1.adr.adr.adr.value);

        System.out.print("LinkedList is: ");
        printLinkedList(n1);



        }
    }


    //Add element 10 after node 2 such that 3 and 4 are still there
    /*
    * ArrayList
    * HashMap
    * TreeMap
    * PriorityQueue
    * Queue
    * Stack
    *
    * */