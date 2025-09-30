import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void printReverse(int arr[]){
        //use stack to print arrays element in reverse
        //you can traverse in right direction/increasing index only
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        while(st.size()>0){
            System.out.println(st.peek());
            st.pop();
        }
    }

    public static void isValidParenthesis(String s){
        Stack<Character>st= new Stack<>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(ch =='(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                  if( st.size()>0 ){
                      if(ch ==']' && st.peek() == '['){
                          st.pop();
                      } else if(ch =='}' && st.peek()=='{'){
                          st.pop();
                      }else if(ch ==')' && st.peek()=='('){
                          st.pop();
                      }else{
                          System.out.println("Invalid parenthesis");
                          return;
                      }
                  }else{
                      System.out.println("Invalid parenthesis");
                      return ;
                  }
            }
        }
        if(st.isEmpty()){
            System.out.print("Valid parenthesis");
        }else{
            System.out.println("Invalid parenthesis");
        }
        //print it is valid or not
    }
    public static void main(String[] args) {
            int arr[]={2,4,6,9};
//            printReverse(arr);
            isValidParenthesis("[((");
            isValidParenthesis("))]");
    }
}


