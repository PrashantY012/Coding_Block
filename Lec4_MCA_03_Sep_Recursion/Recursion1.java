//Write a function to print factorial of a number using loops
//\
public class Recursion1{

    public static int getFactLoop(int n){
        int ans=1;
        for(int i=n;i>=0;i--){
            ans*=i;
        }
        return ans;
    }
    public static int f(int n){ // 5

        //base case
        if(n==1){
            return 1;
        }
        //cal
        return n*f(n-1); //assume f will return answer for n-1

        
    }
    //write a function to find nth fibonacci element.

        public static int getFibRec(int n){ //10
            //base case
            if(n==1){
                return 0;
            }
            if(n==2){
                return 1;
            }
            //calculation
            int fibn =  getFibRec(n-1)+ getFibRec(n-2);  //fib(9)+fib(8)
            return fibn;

        }
    public static void main (String [] args){
        int n =5; 
        System.out.println("factorial of "+n+" is "+f(n));
               
    }
} 