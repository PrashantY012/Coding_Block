public class MyClass{

    int getSum(int a , int b){  //one operation , runs in approx constant time
        return a+b;
    }

    int mul(int a, int b){ //one operation, runs in apporx consant time
        return a*b;
    }

    int getSumOfArry(int arr[]){
        int n =  arr.length; //one opr
        int cnt=0; // one opr
        for(int i =0;i<n;i++){
                cnt = cnt +1 ; 
        }

        return cnt;
    }

    public static void main(String[] args) {
        
        int cnt=0;

        int n= 5;
        for(int i=0;i<n;i++){ // initialising i=0, checking i and incrementing i are also operaitions but they are too fast
            cnt= cnt + 1;     // no of operation in one iteration == 1
        }


          for(int i=0;i<n;i++){
            cnt= cnt + 1;     // no of operation in one iteration == 2
            int a =2 +3;    
        }


           for(int i=0;i<n;i++){
            cnt= cnt + 1;     // no of operation in one iteration == 3 
            int a =2 *3;    
            int b = a+2;
        }


        //Big O notation ==== used for approximation of time or space complexity 



    }

}