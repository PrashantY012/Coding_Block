public class Recusrion_1 {


    // public static int factRecursive(int n){
    //     if(n==1)return 1;
    //     return n*factRecursive(n-1);
    // }




    public static int getFactRec(int n){ //n==5

        //terminating conditon,base conditon
        //n>-1
        //n ==1
        //easy to write, easy to think
        if(n==1){
            return 1;
        }
        //calculation
        return n* getFactRec(n-1);

    }
    /*
     * getFactRec(4)
     * 
     * return 5* getFactRec(4-1)
     * 
     * 
     * 
     * getFactRec(4){
     * 
     * return 4* getFactRec(4-1)
     * 
     * }
     * 
     * 
     * 
     * getFactRec(3){
     * 
     * 
     * return  3* getFactRec(3-1);
     * }
     * 
     * 
     * 
     * getFactRec(2){
     * 
     * return 2*getFactRec(2-1);
     * }
     * 
     * 
     * getFactRec(1){
     * 
     * return 1* getFactRec(1-1)
     * }
     * 
     * 
     * getFactRec(0){
     * 
     * 
     * return 0* getFact(0-1)
     * }
     * 
     * 
     * getFactRec(-1){
     * 
     * 
     * return -1 * getFactRec(-1-1);
     * }
     * 
     * 
     * getFactRec(-2){
     * 
     * }
     * 
     * ....continues, never stops
     * 
     * 
     */

    public static int factSimple(int n){ //for loop
        int ans =1;
        for(int i=n;i>0;i--){
            ans*=i;
        }
        return ans;
    }


    public static int getNFibo(int n){
        if (n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int prev= 0,crnt=1;
        for(int i=3;i<=n;i++){
            int newCrnt = prev+crnt;
            prev = crnt;
            crnt = newCrnt;
        }
        return crnt;
    }

     public static int getNFiboRec(int n){
        if (n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return getFactRec(n-1+n-2);
    }

    public static void main(String[] args){
        int n =5;
        // int ans = factSimple(n);
        // System.out.println("Factorial of "+n+" is "+factSimple(n));

        System.out.println(n+"th finonacci no is: "+ getNFibo(7));


    }
}
