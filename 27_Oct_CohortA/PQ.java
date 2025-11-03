import java.text.CollationElementIterator;
import java.util.*;
 class CustomComp implements Comparator<Integer>{

    @Override
    public int compare(Integer a, Integer b) {
        // TODO Auto-generated method stub
        if(a%2 ==0 && b%2==0 || a%2 ==1 && b%2==1 ){
            return 0;
        }
        else {
            if(a%2==1){
                return 7;
            }else{
                return -1;
            }
        }

    }

    }


public class PQ{
    public static void print3smallest(PriorityQueue<Integer>pq){
         ArrayList<Integer> arr= new ArrayList<>();

        for(int i=0;i<3;i++){
            arr.add(pq.poll());
        }

        for(int i=0;i<3;i++){
            System.out.print(arr.get(i)+"  ");
            pq.add(arr.get(i));
        }
        System.out.println();
    }
    public static void minPracPQ(){
         /*
    given an array of integers, in which elements are being appended, after each append tell
    whats the minimum element in the array.

    Example:
    Array =[], append 7
    array ={7} minimum ==7
    append 9, array ={7,9} minimum =9


    */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(8);
        pq.add(7);
        pq.add(11);
        pq.add(13);
        print3smallest(pq);
        pq.add(3);
        print3smallest(pq);


        // System.out.println("pq is: "+pq);

        pq.poll();
        // System.out.println("top element is: "+pq.peek());

        //smallest 3 elements
        print3smallest(pq);
    }

      public static void maxPracPQ(){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.add(8);
        pq.add(7);
        pq.add(11);
        pq.add(13);
        pq.add(3);

        System.out.println("pq is: "+pq);
        pq.poll();
        System.out.println("top element is: "+pq.peek());

        //smallest 3 elements
    }

  
    public static void learnComp(){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,8,1,9,0,11,13,11,4));
        // arr.sort(new CustomComp());
        arr.sort((a,b)->{
            return a-b;
        }
            );

        System.out.println(arr);
        
    }
    public static void main(String args[]){
        // minPracPQ();
        // learnComp();
        maxPracPQ();


    }
}