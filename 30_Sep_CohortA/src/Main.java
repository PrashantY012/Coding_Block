import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class CustomQueue{
    //array
    int capacity = 10;
    int arr[]=new int[10];
    int rear = 0;//where to add new element
    int front = -1;//from where to remove the element
    public void add(int element){ //
     //baisc checks overflow..implement your self
        if(rear==0){
            front =0;
        }
        arr[rear] = element;
        rear++;
    }

    public int remove(){
        int firstElement = arr[front];
        front++;
        return firstElement;
    }

    public int peek(){ //get first element without removal
        return arr[front];
    }
}

class CustomQueueUsingStack{
    public void add(int element){ //
        //baisc checks overflow..implement your self
    }

    public int remove(){
        return 0;
    }

    public int peek(){ //get first element without removal
        return 0;
    }
}

public class Main {
    public void stlQueue(){

    }
    public static void main(String[] args) {
        CustomQueue cqu= new CustomQueue();
        cqu.add(7);
        cqu.add(9);
        cqu.add(11);
        System.out.println(cqu.remove());
        System.out.println(cqu.peek());

    }
}
