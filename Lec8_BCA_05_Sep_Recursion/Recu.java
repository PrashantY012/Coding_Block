import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Recu{

    //find sum of an array using recursion, creating new array
    // public static int getSumArrRec1(int []arr){ //dry run yourself
    //     int n = arr.length;
    //     //base case
    //     if(n == 1){
    //         return arr[0];
    //     }
    //     //cal
    //     int newArr [] = new int[n-1];
    //     for(int i=0;i<n-1;i++){
    //         newArr[i]=arr[i+1];
    //     }
    //     int ans = getSumArr(newArr)+ arr[0];
    //     return ans;
    // }


    //find sum of an array using recursion, creating new array
    public int getSumArrRec1(int []arr){ //dry run yourself
        int n = arr.length;
        //base case
        if(n == 1){
            return arr[0];
        }
        //cal
        int newArr [] = new int[n-1];
        for(int i=0;i<n-1;i++){
            newArr[i]=arr[i+1];
        }
        int ans = getSumArrRec1(newArr)+ arr[0];
        return ans;
    }
    public static int getSumArrRec2(int[] arr,int ptr){
        int n = arr.length;
        //base case
            if(ptr == n-1){// i am on last element, return it.
                return arr[ptr];//or return arr[n-1];
            }
        //cal
        int restSum = getSumArrRec2(arr, ptr+1);
        int ans = arr[ptr] + restSum;
        return ans;
    }

    public static int getSum(int arr []){
        return getSumArrRec2(arr,0);
    }

        public static String compressString(String s){ //bonus append dummy character at the end of input string
            int n =s.length();
            int count =0;
            char crntChar = '.';
            String ansString ="";
            for(int i =0;i<n;i++){
                
                if(i==0){
                    crntChar = s.charAt(i);
                    count = 1;
                }else{
                    if(s.charAt(i)== s.charAt(i-1)){
                        count++;
                    }else{
                        ansString = ansString + crntChar; //added character
                        ansString = ansString + count;

                        crntChar = s.charAt(i);
                        count = 1;
                    }
                }
            }
            ansString = ansString + crntChar; //added character
            ansString = ansString + count;
            return ansString;
    }
    public static void main(String [] args){

        String s = "aaabbccdef";
        System.out.println("compressed string is: "+compressString(s));
    }
    public static boolean checkPalFor(String s){ //check if a string is palindrome or not using for loop
        return true;
    }

    

}
//find max value of an array using recursion. --> HW

//find if  a string is palindrome or not using recursion.

