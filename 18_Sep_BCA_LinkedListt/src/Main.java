//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class LinkedList{
    public int value;
    public LinkedList next;
}

public class Main {

    public static LinkedList addNode(LinkedList head, int value){
        LinkedList newNode = new LinkedList();
        newNode.value = value;

        if(head == null){
            return newNode;
//            head = newNode;  will not work
//            return head;
        }

        LinkedList current = head; //denotes on which node i am currently

        while(current != null && current.next != null){
            current = current.next;
        }

        //we have reached last node now, current is pointing to last node
        current.next = newNode;
        return head;

    }

    public static void printLL(LinkedList head){
        while(head!=null){
            System.out.print(head.value+"->");
            head = head.next;
        }
        System.out.println();
    }

    //TODO: Implement below function
    public static int getLengthLL(LinkedList head){
        int len = 0;
        while(head != null){
            head = head.next;
            ++len;
        }
        return len;

    }

    //TODO: *******************HomeWork 18 Sep*************************
    LinkedList head addNodeAtIndex(LinkedList head, int index, int element){ //indexing is 0 based

    }

    //TODO: *************************Delete a node**********************
    LinkedList head addNodeAtIndex(LinkedList head, int element){ //indexing is 0 based, assume all elements are unique

    }

    public static void main(String[] args) {
        LinkedList head =null;
        head =  addNode(head,5);
        printLL(head);
        head = addNode(head,6);
        printLL(head);
        head = addNode(head,7);
        printLL(head);
//        for(int i=0;i<10;i++){
//            head = addNode(head,i);
//        }
        printLL(head);
        System.out.println("LL length isL "+getLengthLL(head));


    }
}