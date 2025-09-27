
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.HashMap;

class ListNode{
    int value;
    ListNode next;
}
class Node{
    int value;
    Node next;
}
public class Main {

    //Given head of a linked list, reverse it and return its new head.
    public ListNode reverseList(ListNode head) {
        //easy case
        if(head == null)return null;
        if(head.next == null) return head; //single node

        //more than 1 node
        ListNode current = head;
        ListNode prev = null ; //initialise later

        while(current!=null){

            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;

        }

        return prev;
    }



    int getKthFromLast(Node head, int k) {
        // Your code here
        //find length of linked list, then find what the position from head/front, go to that node and return the value

    }

    public boolean hasCycle(ListNode head) {
//        HashMap<ListNode,Integer> hm = new HashMap<>();
//        ListNode current = head;
//        while(current != null){
//            if(hm.containsKey(current)){
//                return true;//cycle is present
//            }
//            hm.put(current,1);
//            current= current.next;
//        }
//        return false;

        ListNode sp = head, fp = head.next; //slow and fast pointer
        while(fp!=null && fp.next!=null && fp.next.next!=null){
            if(sp == fp )return true;
            sp = sp.next;
            fp = fp.next.next;
        }
        return false;

    }



    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int a = 21;

    }
}