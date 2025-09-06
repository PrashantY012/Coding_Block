public class Prac {


    //Given a string, use recursion to tell if it is palindrome or not.

    public static boolean isPalRec(StringBuilder s, int st, int en){
        //base case
        if(st >= en) return true;
        //cal
        if(s.charAt(st) != s.charAt(en)){
            return false;
        }
        boolean ans = isPalRec(s, st+1, en-1);//solve for inner string, if it is palindorme or not
        return ans;  
    }

    public static boolean isPalindrome(String s){

        //using loops
        int n = s.length();
        int st = 0, en = n-1;

        while(st<=en){
            if(s.charAt(st) !=  s.charAt(en)){
                return false;
            }
            st++;
            en--;
        }
        return true;


    }

    //Given a array of unique characters n, generate all possible combination of strings of length k, repetion of characters is allowed.
    public static void printAllRec(char [] chr, int k, StringBuilder s){ //s current string we made
        int crntStringLength = s.length();
        if(crntStringLength == k){
            System.out.println(s);
            return ;
        }
        //cal
        int n = chr.length;
        for(int i =0;i<n;i++){
            s.append(chr[i]);
            printAllRec(chr, k, s);
            s.deleteCharAt(s.length() - 1);
        }

    }
    public static void printAll(char [] characters, int k){
        //base case
        StringBuilder s = new StringBuilder("");
        printAllRec(characters, k, s);

    }

    public static void main(String[] args){

        char [] chr ={'a','b','c'};
        int k = 3;
        printAll(chr, k);

    }
    
}
