public class Unify {
    public static void main(String[] args) {
        // Your code here
        //input
        //my name is prashant
        String s = "my name is prashant";
        int word=0;
        int len = s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)==' ')word++;
        }
        word++;


    }
}
