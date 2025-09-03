
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int getSum(int []arr){
        int sum=0;
         for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
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
