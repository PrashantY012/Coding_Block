public class Recusrion_1 {

    // public static int factRecursive(int n){
    // if(n==1)return 1;
    // return n*factRecursive(n-1);
    // }

    public static int getFactRec(int n) { // n==5

        // terminating conditon,base conditon
        // n>-1
        // n ==1
        // easy to write, easy to think
        if (n == 1) {
            return 1;
        }
        // calculation
        return n * getFactRec(n - 1);

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
     * return 3* getFactRec(3-1);
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

    public static int factSimple(int n) { // for loop
        int ans = 1;
        for (int i = n; i > 0; i--) {
            ans *= i;
        }
        return ans;
    }

    public static int getNFibo(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int prev = 0, crnt = 1;
        for (int i = 3; i <= n; i++) {
            int newCrnt = prev + crnt;
            prev = crnt;
            crnt = newCrnt;
        }
        return crnt;
    }

    public static int fibo(int n) { // 10
        // base case
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        // calculation

        return fibo(n - 1) + fibo(n - 2); // asume
    }

    public static int getSumR(int arr[], int pnt) {

        int n = arr.length;
        if (pnt == n - 1) {
            return arr[pnt];
        }
        return arr[pnt] + getSumR(arr, pnt+1);
    }

    public static int getSum(int arr[]) {

        return getSumR(arr, 0);

    }

    public static void main(String[] args) {
        int n = 2;
        // int ans = factSimple(n);
        // System.out.println("Factorial of "+n+" is "+getFactRec(n));

        // System.out.println(n+"th finonacci no is: "+ getNFibo(7));

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of array is: " + getSum(arr));

    }
}

// Given a string, write a recursive function to check if it is palindome or
// not.

// Write a function to calculate sum of an array using recursion.

/* 

*************How to approach Recursion problems, some tips*************

1. Break into base case and calculation part.
2.  Think how you can call same function, with a smaller input/sample,assume you will get 
the answer, apply operations on the recieved answer to include current element.
3.For Base case, think of very simple cases, small inputs, what will be answer when my n is 
small (like 1,2,3) or when my array has 1 or 2 elements only etc.
4. dry run/draw call stack(tree structure) as done in class with pen paper.


 */
