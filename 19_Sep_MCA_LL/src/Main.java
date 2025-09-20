
class Dog {
    public String name;
    public int age;
}

class Node {
    public int value;
    public Node next;
}

public class Main {
    public void fun() {
        int arr[] = {4, 5, 6};
        System.out.println(arr);
        System.out.println(arr);
        System.out.println(arr);
        System.out.println(arr);
        //[I@6acbcfc0
        Dog dog = new Dog();
        dog.name = "sheru";
        dog.age = 21;
        System.out.println(dog.name);
    }
    public static Node addNode(Node head, int value){
        //return new head or old one but return it.
        Node    newNode     = new Node();
        newNode.value =value;
        if(head == null){
            return newNode;
        }
        Node current= head;


        while(current.next != null){
            current =current.next;
        }

        current.next = newNode;
        return head;

    }

    public static void printLL(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.value+ "->");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n1 = new Node();
        n1.value = 10;

        Node n2 = new Node();
        n2.value = 11;

        n1.next = n2;
        System.out.println(n1.value);
        System.out.println(n1.next);
        System.out.println(n2);
        //n1.next === n2
        //n2.value === n1.next.value
        System.out.println(n2.value);
        System.out.println(n1.next.value);

        Node n3 = new Node();
        n3.value = 12;
        n2.next = n3;

        System.out.println(n2.next);
        System.out.println(n3);


        System.out.println(n1.next.next.value);
        //n1.next == n2
        //n1.next.next == n3
        //n1.next.next.value == 12;



        Node n4 = new Node();
        n4.value = 13;

        n3.next = n4;

        System.out.println(n2.next.next.value);

        printLL(n1);

        Node head = null;
        head = addNode(head,20);
        head = addNode(head,21);
        head = addNode(head,22);

        printLL(head);






    }
}