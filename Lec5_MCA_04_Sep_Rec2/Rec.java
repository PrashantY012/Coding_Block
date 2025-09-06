import java.util.ArrayList;

public class Rec{
//those who did fibonacci
// find sum of an array using recursion

    public static int getFact(int n){
        if(n==1){
            return 1;
        }
        return n*getFact(n-1);
    }

    static int  counter =0;
    public static int f(int n){ //10
        //base case
        counter++;
        if(n==1){
            return 0;
        }
        if(n ==2){
            return 1;
        }
        int ans = f(n-1)+f(n-2); //assume
        return ans;
    }

    int getSumR(int []arr, int ptr){
        int n =arr.length;
        //base case
        if(ptr == (n-1)){ //last index/element
            return arr[ptr];
        }

        //calcualtion
        int ans = arr[ptr]+ getSumR(arr, ptr+1);//assume it will return correct value
        return ans;
    }

    public static int getSum(int []arr){
        int n =arr.length;
        return getSumR(arr,0);
    }

    public static void main(String []args){
        // f(10);
        // System.out.println("no of function call are:"+counter);
        int arr [] ={1,2,3,4,5};
        System.out.println((getSum(arr)));
    }
}