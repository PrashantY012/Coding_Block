// package _2_BCA;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

/*
 for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " → " + entry.getValue());
}

 */


public class Main {

    public static int getSum(int []arr){
        int sum=0;
         for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int getSumUsingMap(int arr[]){
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(1,3);
        mp.put(3,8);
        mp.put(4,8);
        mp.remove(3);
        System.out.println(mp.containsKey(4));
        System.out.println(mp);
        for(Integer key: mp.keySet()){

        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,5};
        int ans = getSum(arr);
        System.out.println(getSumUsingMap(arr));
    }


        //what is the time complexity of this function? 
        //think-> write samples(dry run)
        // make counter in core part of function, increment it and 
        //see pattern(can be used in starting but dry run is preffered for learning)
    public static void tc1(int arr[]){ 
        int n = arr.length;
        for(int i = 0;i<n ;i++){

            for(int j=0; j<2; j++){
                int a =2+3;
            }
        }
    }

    public static void tc2(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n ;i++){
            if(i%2){
                break;
            }
            for(int j=0; j<n*n; j++){
                int a =2+3;
            }
        }
    }

     public static void tc3(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n ;i++){
            
            for(int j=0; j< n; j++){

                for(int k =0;k<n/2;k++){
                    if(k+j>1){
                        break;
                    }
                }
            }
        }
    }

     public static void tc4(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n ;i++){
            if(i%2){
                break;
            }
            for(int j=0; j<n*n; j++){
                int a =2+3;
            }
        }
    }

}
