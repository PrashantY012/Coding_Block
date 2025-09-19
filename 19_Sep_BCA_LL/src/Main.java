
class LinkedList{
    public int value;
    public LinkedList next;
    LinkedList(int value){
        this.value = value;
    }
    LinkedList(){

    }
}
public class Main {


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

    public static LinkedList addNodeAtPosition(LinkedList head, int element, int index){ //0 based indexing
        LinkedList newNode = new LinkedList();
        newNode.value = element;
        int curPos=0;
        if(index == 0){
            newNode.next = head;
            return newNode;
        }
        LinkedList current = head;
        while(true){

            if(curPos == index-1){
                break;
            }
            current = current.next;
            curPos++;
        }
        LinkedList nextAdr = current.next;
        current.next = newNode;
        newNode.next = nextAdr;

        return head;
    }

    //TODO: implement this function
    public static LinkedList deleteNodeAtPotion(LinkedList head,  int index){

        return null;
    }
    public static void main(String[] args) {
        LinkedList head = new LinkedList(5);
        addNode(head,6);
        addNode(head,7);
        addNode(head,8);
        addNode(head,9);


        printLinkedList(head);
        head = addNodeAtPosition(head,11,5);
        printLinkedList(head);




    }
}