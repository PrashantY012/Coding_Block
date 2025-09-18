import java.util.concurrent.LinkedBlockingDeque;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class LinkedList{
    public int value;
    public LinkedList next;
    LinkedList(int value){
        this.value = value;
    }
    LinkedList(){

    }
}



 class Main {

    public static int getLinkedListLength(LinkedList  head){
        int count =0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

     //write a function to print linkedList
    public static void printLinkedList(LinkedList head){
//        for(int i=0;i<)
        LinkedList current = head;
        while(current != null){
            System.out.print(current.value+"->");
            current = current.next;
        }
        System.out.println();
    }

    public static LinkedList addNode(LinkedList head, int element){
        LinkedList newNode = new LinkedList();
        newNode.value = element;
        if(head == null){
            return newNode;
        }
        LinkedList current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        return head;

    }

    //given a linked list, position, element, add the new element at the position.
    public static LinkedList addNodeAtPosition(LinkedList head, int position, int element){ //assume positon is 0 indexed
        //positon
        int curInd=0;
        LinkedList current = head;
        LinkedList newNode= new LinkedList(element);
        if(position == 0){
            newNode.next = head;
            return newNode;
        }
        while(true){
            if(curInd == position-1){
                break;
            }
            current = current.next;
            curInd++;
        }
        ///
        LinkedList nextAdr = current.next;
        current.next = newNode;
        newNode.next = nextAdr;
        return head;


    }
    public static void fun(){
        //create a linkedList with values 4,5,6
        LinkedList n1 = new LinkedList();
        n1.value = 4;


        LinkedList n2 = new LinkedList();
        n2.value = 5;
        n1.next = n2;


        LinkedList n3 = new LinkedList();
        n3.value = 6;
//        n2.next = n3;
        n1.next.next=n3;
    }

    //TODO: Complete the folowing function, assume all values are unique
    public static LinkedList deleteNode(LinkedList head, int value){

        return null;
    }
    public static void main(String[] args) {
        System.out.println("Hey");
        LinkedList head = null;
        head = addNode(head,4);//now head becomes not null
        //head is not nul
        head = addNode(head,5);
        head = addNode(head,6);
        head = addNode(head,7);



        System.out.println(head);
        printLinkedList(head);

        //add new nodes
        head = addNodeAtPosition(head,3,11);
        printLinkedList(head);




    }
}