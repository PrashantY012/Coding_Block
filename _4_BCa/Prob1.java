public class Prob1 {


    public  static int getSum(int a, int b){
        return a+b;
    }
    public static int getSum2(int arr[]){

        int sum=0;
        int size= arr.length;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        return sum;

    }

    public  int[] copyArr(int arr[]){
        int n =arr.length;
        int copy[] = new int[n];
        for(int i=0;i<n;i++){
            copy[i] = arr[i];
        }
        return copy;
    }

   
    public static void main(String args[]){

        for(int i=0;i<1e10;i++){
                int a =2+3;
        }
        getSum(2,3);
        System.out.println("For loop complete");
    }
    
}
