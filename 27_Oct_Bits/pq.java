/*
 * Given an array of integers, you are appending elements one by one in it
 * after each append, find the kth smallest  elements (k will be given ).
 * 
 * 
 * 5,10,15,21,17
 * 
 * 3
 * 
 * 3,5,10
 * 
 * 
 * append 9, 4
 * 
 * 10
 * 
 * 
 * append 1, 3
 * 
 * 5
 * 
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class CustomComp implements Comparator<Integer>{
    @Override
    public int compare(Integer a, Integer b ){
        //if reutrn value is greater smaller than 0, a comes before b
        //if return value is greater than 0, b will come before a
        // if(a>b){
        //     return -6;
        // }
        // if(a<b){
        //     return 2;
        // }
        // return 0;
        // return a-b;//ascending order
        return b-a;//descending order


        //first all even element, fir odd elemenets
        // if(a%2==0 && b%2==0 )return -1;
        // if(a%2==1 && b%2==1)return -2;
        // if(a%2==1)return 2;
        // return -1;
    }

}

//functional interface
public class pq{

    public static void learnSort(){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,2,8,5,10,9));
        // arr.sort((a,b)-> b-a);
        arr.sort( (a,b)->{
            return b-a;
        });

        System.out.println("sorted array: "+arr);
    }

    public static void basicPq(){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a); // minimum priority queue
        pq.add(7);
        pq.add(10);
        pq.add(17);
        pq.add(5);
        pq.add(3);
        pq.add(4);

        pq.remove();
        System.out.println("pq.top element is: "+pq.peek());
    }
public static void main(String args[]){
    basicPq();
    // learnSort();
}


 }