

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.ArrayList;
import java.util.Arrays;
//************************************************************
//create custom arrayList using class
//write a linked list and add a node in between like add a node with value 100 after n2.(you are given only linkedlist's head)
class LinkedList{
    public int value ;

    public LinkedList adr;

}

public class Main {
    public void fun(){
        int arr[]= {1,2,3,4};
//        int,float, double etc ---> primitve
        //append 5 at the end

        int arr2[]={1,2,3,4,5};

        int arr3[]= new int[10];
        //old elements copy,

        int arr4[] = new int[20];

        int arr5[]= new int[40];
        ArrayList<Integer> arr7= new ArrayList<>(Arrays.asList(1,2,3,4));
        arr7.add(10);
    }


    //Write a function to print the complete linkedList

    public static void printLinkList(LinkedList head){

        LinkedList current = head;
        while(current != null){

            System.out.print(current.value+"->");
            LinkedList temp = current.adr;
            current = temp;
//            current = current.adr;
        }
        System.out.println();

    }
    public static void main(String[] args) {

        //5,6,7,8,9

    LinkedList n1 = new LinkedList();
    n1.value = 5;


    LinkedList n2 = new LinkedList();
    n2.value= 6;
    n1.adr = n2;
    System.out.println(n2.value);
    System.out.println(n1.adr.value);



    LinkedList n3 = new LinkedList();
    n3.value = 7;
    n2.adr=n3;
    System.out.println(n3.value);
    System.out.println(n1.adr.adr.value);

    LinkedList n4 = new LinkedList();
    n4.value = 8;
    n3.adr = n4;

    System.out.println("n4.adr"+n4.adr);

    printLinkList(n1);










    }
}