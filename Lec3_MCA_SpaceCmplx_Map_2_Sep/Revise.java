import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Revise{
//space complexity->
//extra space used by our algorithim
    public static void p1(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            int c=2+3;
        }
        return ;
    }


    public static void p2(int n){
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            int c = 2+i;
        }
        return ;
    }

    public static void p3(int n, int m, int l){
        int[][] arr= new int [n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=i+j;
            }
        }
        return ;
    }

     public static void p4(int n, int m, int l){
        int[][] arr= new int [n][m];
        System.out.println("Took Time");
        return ;
    }

    public static void sortPrac(){
        int[] arr = {2,-1,3,5,6,-4}; //-1,2,3,5,6,-1
        Arrays.sort(arr,0,3); //sort first 3 elements in asc order, rest same
        System.out.print(Arrays.toString(arr));

        //sort in descending order
        Integer []arr2 = {2,-1,3,5,6,-4};
        
        Arrays.sort(arr2, Collections.reverseOrder());



    }

    public static void hashMap(){
        Map<Integer, Integer> hmp = new TreeMap<>();
        
        /*
         *  5,6    7,9     0,2     -3,8
         * 
         */
        hmp.put(5,6);
        hmp.put(7,9);
        hmp.put(0,2);
        hmp.put(-3,8);



        // hmp.remove(7);

        //traversing a map

        hmp.forEach((key,value)->{
            System.out.println("key: "+key+ "  value: "+value);
        }); 

        /*
         * 
         * 
         * 
         */
       

        System.out.println(hmp);

    }
    public static void main(String []args){
            // p4(20000,20000,10);
            // sortPrac();
            hashMap();
    }


}